package reader.app.android.com.rssreader.toi.screen;

import android.os.Bundle;
import android.support.annotation.Nullable;
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
public class FragmentEducationNews extends Fragment {
    private static final String EDUCATION_NEWS = "Fragment Education News";
    private ReaderMainActivity ma;

    public FragmentEducationNews(){
        Log.d(EDUCATION_NEWS,"FragmentEducationNews");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_all, container, false);
        return v;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public FragmentEducationNews(ReaderMainActivity ma) {
        this.ma = ma;
    }
}
