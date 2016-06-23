package reader.app.android.com.rssreader.toi.screen;

import android.support.v4.app.Fragment;
import android.util.Log;

import reader.app.android.com.rssreader.ReaderMainActivity;


/**
 * Created by Parth on 22-Jun-16.
 */
public class FragmentIndiaNews extends Fragment {
    private static final String INDIA_NEWS = "Fragment India News";
    private ReaderMainActivity ma;

    public FragmentIndiaNews(){
        Log.d(INDIA_NEWS,"FragmentIndiaNews");
    }

    public FragmentIndiaNews(ReaderMainActivity ma) {
        this.ma = ma;
    }
}
