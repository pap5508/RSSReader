package reader.app.android.com.rssreader.toi.screen;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.EnumMap;

import reader.app.android.com.rssreader.R;
import reader.app.android.com.rssreader.ReaderMainActivity;
import reader.app.android.com.rssreader.toi.adapter.PagerAdapterGeneric;
import reader.app.android.com.rssreader.toi.enums.MainScreenPage;
import reader.app.android.com.rssreader.toi.enums.ScreenType;


/**
 * Created by Parth on 21-Jun-16.
 */

@SuppressLint("ClickableViewAccessibility")
public class MainScreen extends FragmentScreen {
    private static final String PAGE_STATUS_MAIN = "Main Screen Page change";
    private MainScreenPage currentPage = MainScreenPage.RECENT;
    private EnumMap<MainScreenPage, Fragment> fragments = new EnumMap<MainScreenPage, Fragment>(MainScreenPage.class);
    private ImageView mRecentNewsIV, mWorldNewsIV, mLocalNewsIV, mSportsNewsIV, mEducationNewsIV;
    private LinearLayout mRecentLL, mWorldLL, mLocalLL, mSportsLL, mEducationLL;
    private boolean onPageScrolledWasCalled = false;


    public MainScreen(ReaderMainActivity ma) {
        super(ma);
        createMainScreen();

    }

    private void createMainScreen() {
        getMa().setContentView(R.layout.activity_main);
        mRecentNewsIV = (ImageView) getMa().findViewById(R.id.iv_menu_recent);
        mWorldNewsIV = (ImageView) getMa().findViewById(R.id.iv_menu_world);
        mLocalNewsIV = (ImageView) getMa().findViewById(R.id.iv_menu_local);
        mSportsNewsIV = (ImageView) getMa().findViewById(R.id.iv_menu_sports);
        getMa().mPager = (ViewPager) getMa().findViewById(R.id.pager);
        getMa().mPager.setAdapter(getMa().mPagerAdapter);

        getMa().mPager.setCurrentItem(0, false);

        mEducationNewsIV = (ImageView) getMa().findViewById(R.id.iv_menu_education);
        mRecentNewsIV.setImageResource(R.drawable.recent_white);
        mRecentNewsIV.setColorFilter(getMa().getResources().getColor(R.color.base_color));
        mWorldNewsIV.setImageResource(R.drawable.world_white);
        mLocalNewsIV.setImageResource(R.drawable.local_white);
        mSportsNewsIV.setImageResource(R.drawable.sports_white);
        mEducationNewsIV.setImageResource(R.drawable.education_white);
        mWorldNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
        mLocalNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
        mSportsNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
        mEducationNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
        getMa().mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                                                   @Override
                                                   public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                                                       if (onPageScrolledWasCalled == false) {
                                                           onPageScrolledWasCalled = true;
                                                           return;
                                                       } else {
                                                           if (position == 4) return;
                                                       }
                                                   }

                                                   @Override
                                                   public void onPageSelected(int position) {
                                                       select(MainScreenPage.getPageFromInt(position));
                                                   }

                                                   @Override
                                                   public void onPageScrollStateChanged(int state) {

                                                   }
                                               }

        );
        getMa().mPagerAdapter = new PagerAdapterGeneric(getMa().getSupportFragmentManager(), this, getMa());
        getMa().mPager.setAdapter(getMa().mPagerAdapter);
        addClickListener(getMa());

    }

    @SuppressWarnings("deprecation")
    private void select(MainScreenPage page) {
        Log.d(PAGE_STATUS_MAIN, String.format("select %d%d", currentPage.getInt(), page.getInt()));
        if (currentPage != page) {
            currentPage = page;
            mRecentLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_recent);
            mWorldLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_world);
            mLocalLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_local_recent);
            mSportsLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_sports);
            mEducationLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_education);
            if (page == MainScreenPage.RECENT) {
                mRecentNewsIV.setImageResource(R.drawable.recent_white);
                mRecentNewsIV.setColorFilter(getMa().getResources().getColor(R.color.base_color));
                mWorldNewsIV.setImageResource(R.drawable.world_white);
                mLocalNewsIV.setImageResource(R.drawable.local_white);
                mSportsNewsIV.setImageResource(R.drawable.sports_white);
                mEducationNewsIV.setImageResource(R.drawable.education_white);
                mWorldNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mLocalNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mSportsNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mEducationNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
            } else if (page == MainScreenPage.WORLD) {
                mRecentNewsIV.setImageResource(R.drawable.recent_white);
                mWorldNewsIV.setImageResource(R.drawable.world_white);
                mWorldNewsIV.setColorFilter(getMa().getResources().getColor(R.color.base_color));
                mLocalNewsIV.setImageResource(R.drawable.local_white);
                mSportsNewsIV.setImageResource(R.drawable.sports_white);
                mEducationNewsIV.setImageResource(R.drawable.education_white);
                mRecentNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mLocalNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mSportsNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mEducationNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
            } else if (page == MainScreenPage.INDIA) {
                mRecentNewsIV.setImageResource(R.drawable.recent_white);
                mWorldNewsIV.setImageResource(R.drawable.world_white);
                mLocalNewsIV.setImageResource(R.drawable.local_white);
                mLocalNewsIV.setColorFilter(getMa().getResources().getColor(R.color.base_color));
                mSportsNewsIV.setImageResource(R.drawable.sports_white);
                mEducationNewsIV.setImageResource(R.drawable.education_white);
                mRecentNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mWorldNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mSportsNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mEducationNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
            } else if (page == MainScreenPage.SPORTS) {
                mRecentNewsIV.setImageResource(R.drawable.recent_white);
                mWorldNewsIV.setImageResource(R.drawable.world_white);
                mLocalNewsIV.setImageResource(R.drawable.local_white);
                mSportsNewsIV.setImageResource(R.drawable.sports_white);
                mSportsNewsIV.setColorFilter(getMa().getResources().getColor(R.color.base_color));
                mEducationNewsIV.setImageResource(R.drawable.education_white);
                mRecentNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mWorldNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mLocalNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mEducationNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
            } else if (page == MainScreenPage.EDUCATION) {

                mRecentNewsIV.setImageResource(R.drawable.recent_white);
                mWorldNewsIV.setImageResource(R.drawable.world_white);
                mLocalNewsIV.setImageResource(R.drawable.local_white);
                mSportsNewsIV.setImageResource(R.drawable.sports_white);
                mEducationNewsIV.setImageResource(R.drawable.education_white);
                mEducationNewsIV.setColorFilter(getMa().getResources().getColor(R.color.base_color));
                mRecentNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mWorldNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mLocalNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
                mSportsNewsIV.setColorFilter(getMa().getResources().getColor(R.color.icon_timeline_background_dark_grey));
            }

        }
    }

    @Override
    public Fragment getItem(int page) {
        MainScreenPage screenPage = MainScreenPage.getPageFromInt(page);
        switch (screenPage) {
            case RECENT:
                return MainScreenCreateFragment.createFragmentForRecent(this);
            case WORLD:
                return MainScreenCreateFragment.createFragmentForWorld(this);
            case INDIA:
                return MainScreenCreateFragment.createFragmentIndiaNews(this);
            case SPORTS:
                return MainScreenCreateFragment.createFragmentSportsNews(this);
            case EDUCATION:
                return MainScreenCreateFragment.createFragmentEducationNews(this);
            default:
                return null;
        }


    }

    @Override
    public int getCount() {
        return 5;
    }

    private void addClickListener(final ReaderMainActivity ma) {
        mRecentLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_recent);
        mWorldLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_world);
        mLocalLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_local_recent);
        mSportsLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_sports);
        mEducationLL = (LinearLayout) getMa().findViewById(R.id.ll_menu_education);

        mRecentLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.mPager.setCurrentItem(0, false);
            }
        });
        mWorldLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.mPager.setCurrentItem(1, false);
            }
        });
        mLocalLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.mPager.setCurrentItem(2, false);
            }
        });
        mSportsLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.mPager.setCurrentItem(3, false);
            }
        });
        mEducationLL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ma.mPager.setCurrentItem(4, false);
            }
        });
    }


    @Override
    public ScreenType getType() {
        return ScreenType.RecentScreen;
    }

    @Override
    public void refresh(RefreshDTO refreshDTO) {

    }

    public EnumMap<MainScreenPage, Fragment> getFragments() {
        return fragments;
    }
}
