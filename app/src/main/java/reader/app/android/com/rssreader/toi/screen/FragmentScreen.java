package reader.app.android.com.rssreader.toi.screen;

import android.support.v4.app.Fragment;

import reader.app.android.com.rssreader.ReaderMainActivity;

/**
 * Created by Parth on 21-Jun-16.
 */
public abstract class FragmentScreen extends Screen{

    public FragmentScreen(ReaderMainActivity ma) {
        super(ma);
    }
    public abstract Fragment getItem(int page);

    public abstract int getCount();

}

