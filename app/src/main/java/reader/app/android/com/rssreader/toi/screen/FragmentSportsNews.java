package reader.app.android.com.rssreader.toi.screen;

import android.support.v4.app.Fragment;
import android.util.Log;

import reader.app.android.com.rssreader.ReaderMainActivity;


/**
 * Created by Parth on 22-Jun-16.
 */
public class FragmentSportsNews extends Fragment {
    private static final String SPORTS_NEWS = "Fragmemt Sports News";
    private ReaderMainActivity ma;

    public FragmentSportsNews(){
        Log.d(SPORTS_NEWS,"FragmentSportsNews");
    }

    public FragmentSportsNews(ReaderMainActivity ma) {
    }
}
