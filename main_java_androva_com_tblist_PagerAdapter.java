package androva.com.tblist;

/**
 * Created by arian on 14-Dec-16.
 */
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                BlankFragment1 tab1 = new BlankFragment1();
                return tab1;
            case 1:
                BlankFragment1 tab2 = new BlankFragment1();
                return tab2;
            case 2:
                BlankFragment1 tab3 = new BlankFragment1();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
