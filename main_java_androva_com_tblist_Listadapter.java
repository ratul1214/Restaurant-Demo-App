package androva.com.tblist; /**
 * Created by arian on 06-Dec-16.
 */


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import java.lang.reflect.Array;

class Listadapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;

    static int qnt=0;
    public Listadapter(Context context, String[] values) {
        super(context, R.layout.activity_home, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        int qnt=0;
        View rowView = inflater.inflate(R.layout.listlay, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.textView);
        TextView textView1 = (TextView) rowView.findViewById(R.id.textView2);
        final TextView itemquantity = (TextView) rowView.findViewById(R.id.itemquqntity);
        TextView itemprice = (TextView) rowView.findViewById(R.id.itemprice);

        Button cartbtn= (Button) rowView.findViewById(R.id.cartbuttn);
       // ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);
        textView.setText(values[position]);
        final String s = values[position];
        RatingBar ratingBar= (RatingBar) rowView.findViewById(R.id.appbar);
/*        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingBar.getRating();
            }
        });*/
cartbtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(!ChartslectedItem.itemslected.contains(s)) {
            ChartslectedItem.itemslected.add(s);
        }

        Product.qntt[position]++;
        Product.totalprice[position]=Product.totalprice[position]+200;
        Product.TotalPaymnet=Product.TotalPaymnet+200;
        itemquantity.setText("Quantity:"+ Product.qntt[position]);
    }
});
        // Change icon based on name


        System.out.println(s);

        if (s.equals("position1")) {
            textView.setText("Your item 1");
            itemprice.setText("Price:"+200);
            textView1.setText("discription..............");
        } else if (s.equals("position2")) {
            textView.setText("Your item 2");
            itemprice.setText("Price:"+200);
            textView1.setText("discription..............");

        } else if (s.equals("position3")) {
            textView.setText("Your item 3");
            itemprice.setText("Price:"+200);
            textView1.setText("discription..............");

        }
        else if (s.equals("position4")) {
            textView.setText("Your item 4");
            itemprice.setText("Price:"+200);
            textView1.setText("discription..............");

        }
        else if (s.equals("position5")) {
            textView.setText("first");
            textView1.setText("second");

        }
        else if (s.equals("tu")) {
            textView.setText("first");
            textView1.setText("second");


        }
        else {
            textView.setText("first");
            textView1.setText("second");

        }

        return rowView;
    }
}