package reader.app.android.com.rssreader;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import java.util.ArrayList;

import reader.app.android.com.rssreader.toi.enums.ScreenType;
import reader.app.android.com.rssreader.toi.history.History;
import reader.app.android.com.rssreader.toi.screen.Screen;
import reader.app.android.com.rssreader.toi.screen.SplashScreen;

public class ReaderMainActivity extends FragmentActivity {

    public History history;
    public Screen screen;
    public ScreenType mScreenType;
    public ViewPager mPager;
    public PagerAdapter mPagerAdapter;
    public ArrayList<Fragment> fragments = new ArrayList<Fragment>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (screen == null) {
            setContentView(R.layout.activity_empty);
            mPager = (ViewPager) findViewById(R.id.pager);
        }
        mScreenType = ScreenType.SplashScreen;
        if (mScreenType.equals(ScreenType.SplashScreen)){
            screen = new SplashScreen(this);

        }

    }
}
