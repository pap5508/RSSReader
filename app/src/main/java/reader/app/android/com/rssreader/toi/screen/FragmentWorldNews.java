package reader.app.android.com.rssreader.toi.screen;

import android.support.v4.app.Fragment;
import android.util.Log;

import reader.app.android.com.rssreader.ReaderMainActivity;

/**
 * Created by Parth on 22-Jun-16.
 */
public class FragmentWorldNews extends Fragment {
    private static final String WORLDNEWS = "Fragment World News";
    private ReaderMainActivity ma;

    public FragmentWorldNews() {
        Log.d(WORLDNEWS, "FragmentWorldNews");
    }

    public FragmentWorldNews(ReaderMainActivity ma) {
        this.ma = ma;
    }
}
