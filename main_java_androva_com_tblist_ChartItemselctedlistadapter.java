package androva.com.tblist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by arian on 23-Feb-17.
 */
public class ChartItemselctedlistadapter extends ArrayAdapter<String> {
    private final Context context;
    private final ArrayList<String> values;

    public ChartItemselctedlistadapter(Context context, ArrayList<String> values) {
        super(context, R.layout.activity_home, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.hartlist, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.charttextView);
        TextView textView1 = (TextView) rowView.findViewById(R.id.charttextView2);
        TextView carttotalprice= (TextView) rowView.findViewById(R.id.carttotalprice);
        TextView cartquantity= (TextView) rowView.findViewById(R.id.cartquantity);
        // ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
       // textView.setText(values.get(position));
       // RatingBar ratingBar= (RatingBar) rowView.findViewById(R.id.appbar);
        // Change icon based on name
        String s = values.get(position);
    System.out.println(s);

        if (s.equals("position1")) {


                textView.setText("Your item 1");

             //
            //   Product.totalprice[position]=Product.qntt[position]*Product.totalprice[position];
                cartquantity.setText("Quantity:"+Product.qntt[position]);
                //Product.totalprice[position]=Product.totalprice[position]*Product.qntt[position];
                carttotalprice.setText("Totalprice"+Product.totalprice[position]);
                textView1.setText("discription..............");



        } else if (s.equals("position2")) {
            textView.setText("Your item 2");
        //    Product.totalprice[position] = Product.qntt[position] * Product.totalprice[position];
            cartquantity.setText("Quantity:" + Product.qntt[position]);
            carttotalprice.setText("Totalprice" + Product.totalprice[position]);
            textView1.setText("discription..............");


        } else if (s.equals("position3")) {
            textView.setText("Your item 3");
          //  Product.totalprice[position] = Product.qntt[position] * Product.totalprice[position];
            cartquantity.setText("Quantity:" + Product.qntt[position]);
            carttotalprice.setText("Totalprice" + Product.totalprice[position]);
            textView1.setText("discription..............");


        } else if (s.equals("position4")) {
            textView.setText("Your item 4");
          //  Product.totalprice[position] = Product.qntt[position] * Product.totalprice[position];
            cartquantity.setText("Quantity:" + Product.qntt[position]);
            carttotalprice.setText("Totalprice" + Product.totalprice[position]);
            textView1.setText("discription..............");


        } else if (s.equals("h")) {
            textView.setText("first");
            textView1.setText("second");

        } else if (s.equals("tu")) {
            textView.setText("first");
            textView1.setText("second");


        } else {
            textView.setText("first");
            textView1.setText("second");

        }

        return rowView;
    }
}
