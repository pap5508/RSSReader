package reader.app.android.com.rssreader.toi.screen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import reader.app.android.com.rssreader.R;
import reader.app.android.com.rssreader.ReaderMainActivity;


/**
 * Created by Parth on 22-Jun-16.
 */
public class FragmentRecentNews extends Fragment {
    private static final String RECENT_NEWS = "Recent News Fragment";
    public ReaderMainActivity ma;

    public FragmentRecentNews() {
        Log.d(RECENT_NEWS, "FragmentRecentNews");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_all, container, false);
        return v;

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public FragmentRecentNews(ReaderMainActivity ma) {
        this.ma = ma;
    }
}
