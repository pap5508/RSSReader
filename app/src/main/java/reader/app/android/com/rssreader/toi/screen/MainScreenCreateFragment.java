package reader.app.android.com.rssreader.toi.screen;

import android.support.v4.app.Fragment;

import reader.app.android.com.rssreader.toi.enums.MainScreenPage;


/**
 * Created by Parth on 22-Jun-16.
 */
public class MainScreenCreateFragment {

    public static Fragment createFragmentForRecent(MainScreen screen) {
        Fragment fragmentRecentNews = new FragmentRecentNews(screen.getMa());
        screen.getFragments().put(MainScreenPage.RECENT, fragmentRecentNews);
        return fragmentRecentNews;
    }

    public static Fragment createFragmentForWorld(MainScreen screen) {
        Fragment fragmentWorldNews = new FragmentWorldNews(screen.getMa());
        screen.getFragments().put(MainScreenPage.WORLD, fragmentWorldNews);
        return fragmentWorldNews;
    }

    public static Fragment createFragmentIndiaNews(MainScreen screen) {
        Fragment fragmentIndiaNews = new FragmentIndiaNews(screen.getMa());
        screen.getFragments().put(MainScreenPage.INDIA, fragmentIndiaNews);
        return fragmentIndiaNews;

    }

    public static Fragment createFragmentSportsNews(MainScreen screen) {
        Fragment fragmentSportsNews = new FragmentSportsNews(screen.getMa());
        screen.getFragments().put(MainScreenPage.SPORTS, fragmentSportsNews);
        return fragmentSportsNews;
    }

    public static Fragment createFragmentEducationNews(MainScreen screen) {
        Fragment fragmentEducationNews = new FragmentEducationNews(screen.getMa());
        screen.getFragments().put(MainScreenPage.EDUCATION, fragmentEducationNews);
        return fragmentEducationNews;
    }
}

