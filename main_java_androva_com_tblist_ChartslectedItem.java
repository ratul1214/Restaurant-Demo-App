package androva.com.tblist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ChartslectedItem extends AppCompatActivity {

public  static ArrayList<String> itemslected=new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lected_item);
        ListView listView= (ListView)findViewById(R.id.listView11);

        Button button= (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChartslectedItem.this,Paymentgate.class);

                startActivity(intent);
            }
        });
        //    ArrayAdapter<String> listviewAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,menuitem);
        listView.setAdapter(new ChartItemselctedlistadapter(getApplicationContext(),itemslected));


    }
}
