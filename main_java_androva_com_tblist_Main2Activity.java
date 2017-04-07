package androva.com.tblist;
import android.app.ProgressDialog;
import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import androva.com.tblist.DatabaseAct;
import androva.com.tblist.Home;
import androva.com.tblist.R;
import androva.com.tblist.Userinfo;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextName;
    private EditText editTextUsername;
    private EditText editTextPassword;
    private EditText editTextEmail;
    DatabaseAct myDb;

    private Button buttonRegister;

    private static final String REGISTER_URL = "http://ratulexpo.esy.es/UserRegistration/register.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        myDb = new DatabaseAct(this);
        editTextName = (EditText) findViewById(R.id.editText4);
        editTextUsername = (EditText) findViewById(R.id.editText3);
        editTextPassword = (EditText) findViewById(R.id.editText2);
        editTextEmail = (EditText) findViewById(R.id.editText);

        buttonRegister = (Button) findViewById(R.id.Button);


        buttonRegister.setOnClickListener(this);
        if (viewAll())
        {
            Intent intent=new Intent(Main2Activity.this,Profile.class);
            startActivity(intent);
        }
    }

    @Override
    public void onClick(View v) {
        if (v == buttonRegister) {
            registerUser();
            AddData();
            viewAll();
        }
    }

    public void AddData() {

        boolean isInserted = myDb.insertData(editTextName.getText().toString(),
                editTextUsername.getText().toString(),
                editTextEmail.getText().toString(), editTextPassword.getText().toString());
        if (isInserted == true)
        {
            //   Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();

        }
        else
        {
            //  Toast.makeText(MainActivity.this, "Data not Inserted", Toast.LENGTH_LONG).show();

        }
    }


    public boolean viewAll() {

        Cursor res = myDb.getAllData();
        if (res.getCount() == 0) {
            // show message
            //   showMessage("Error", "Nothing found");
            return false;
        }

        StringBuffer buffer = new StringBuffer();
        while (res.moveToNext()) {
            buffer.append("Id :" + res.getString(0) + "\n");
            buffer.append("Name :" + res.getString(1) + "\n");
            buffer.append("Username :" + res.getString(2) + "\n");
            buffer.append("Email :" + res.getString(3) + "\n");
            buffer.append("Password :" + res.getString(4) + "\n\n");
            Userinfo.name = res.getString(1);
            Userinfo.username = res.getString(2);
            Userinfo.email = res.getString(3);

        }
        Toast.makeText(Main2Activity.this, Userinfo.username, Toast.LENGTH_LONG).show();
        // Show all data
        //showMessage("Data", buffer.toString());
       /* Userinfo.name = res.getString(1);
        Userinfo.username = res.getString(2);
        Userinfo.email = res.getString(3);
        Userinfo.name = res.getString(4);*/
        return  true;
    }



    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    private void registerUser() {
        String name = editTextName.getText().toString().trim().toLowerCase();
        String username = editTextUsername.getText().toString().trim().toLowerCase();
        String password = editTextPassword.getText().toString().trim().toLowerCase();
        String email = editTextEmail.getText().toString().trim().toLowerCase();

        register(name,username,password,email);
    }

    private void register(String name, String username, String password, String email) {
        String urlSuffix = "?name="+name+"&username="+username+"&password="+password+"&email="+email;
        class RegisterUser extends AsyncTask<String, Void, String>{

            ProgressDialog loading;

            @Override

            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Main2Activity.this, "Please Wait",null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                Toast.makeText(getApplicationContext(),s,Toast.LENGTH_LONG).show();
                if(s.equals("successfully registered"))
                {//Toast.makeText(getApplicationContext(),"go intent",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(Main2Activity.this,Profile.class);
                    startActivity(intent);
                }
            }

            @Override
            protected String doInBackground(String... params) {
                String s = params[0];
                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(REGISTER_URL+s);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String result;

                    result = bufferedReader.readLine();

                    return result;
                }catch(Exception e){
                    return null;
                }
            }
        }

        RegisterUser ru = new RegisterUser();
        ru.execute(urlSuffix);
    }
}
