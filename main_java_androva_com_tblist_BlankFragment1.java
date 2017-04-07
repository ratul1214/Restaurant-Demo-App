package androva.com.tblist;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;


public class BlankFragment1 extends Fragment {
    String[] menuitem={"position1", "position2","position3","position4"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView= inflater.inflate(R.layout.fragment_blank_fragment1, container, false);
        ListView listView= (ListView) rootView.findViewById(R.id.listView);


        //    ArrayAdapter<String> listviewAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,menuitem);
        listView.setAdapter(new Listadapter(getActivity(),menuitem));

        return rootView;
    }
}