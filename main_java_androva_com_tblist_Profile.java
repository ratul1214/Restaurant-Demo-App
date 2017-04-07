package androva.com.tblist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
public static   TextView proname,proemail,username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        proemail= (TextView) findViewById(R.id.proemail);
        proname= (TextView) findViewById(R.id.proname);
        username= (TextView) findViewById(R.id.prousername);
        proname.setText("Name"+Userinfo.name.toString());
        proemail.setText("Email"+Userinfo.email.toString());
        username.setText("Username"+Userinfo.username.toString());

    }
}
