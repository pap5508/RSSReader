package reader.app.android.com.rssreader.toi.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.util.Log;
import android.util.SparseArray;

import reader.app.android.com.rssreader.ReaderMainActivity;
import reader.app.android.com.rssreader.toi.screen.FragmentScreen;


/**
 * Created by Parth on 22-Jun-16.
 */
public class PagerAdapterGeneric extends FragmentStatePagerAdapter {
    private static final String ARRAY_SIZE = "Array Size Page" ;
    private static final String FRAGMENT_NULL = "Fragmnet is Null" ;
    private static final String POSITION = "Fragment position";
    public SparseArray<Fragment> fragments = new SparseArray<Fragment>();
    public FragmentScreen screen;
    public ReaderMainActivity ma;

    public PagerAdapterGeneric(FragmentManager fragmentManager, FragmentScreen screen, ReaderMainActivity ma) {
        super(fragmentManager);
        this.screen = screen;
        this.ma = ma;
        removeFragments(ma);
    }

    public static void removeFragments(ReaderMainActivity ma) {
        Log.d(ARRAY_SIZE , String.valueOf(ma.fragments.size()));
        for (int i = ma.fragments.size() - 1; i >= 0; i--) {
            Fragment fragment = ma.fragments.get(i);
            if (fragment != null) {
                ma.getSupportFragmentManager().beginTransaction().remove(ma.fragments.get(i)).commit();
                ma.fragments.remove(i);
            } else Log.d(FRAGMENT_NULL,"PagerAdapterGeneric");
        }
    }

    @Override
    public int getItemPosition(Object object) {
        return PagerAdapter.POSITION_NONE;
    }

    @Override
    public Fragment getItem(int position) {
        Log.d(POSITION,"Position");
        Fragment fragment = screen.getItem(position);
        ma.fragments.add(fragment);
        return fragment;
    }

    @Override
    public int getCount() {
        return screen.getCount();
    }
}
