package reader.app.android.com.rssreader.toi.enums;

/**
 * Created by Parth on 22-Jun-16.
 */
public enum MainScreenPage {

    RECENT, WORLD, INDIA, SPORTS, EDUCATION;

    public int getInt() {
        switch (this) {
            case RECENT:
                return 0;
            case WORLD:
                return 1;
            case INDIA:
                return 2;
            case SPORTS:
                return 3;
            case EDUCATION:
                return 4;
            default:
                return 0;
        }
    }

    public static MainScreenPage getPageFromInt(int page) {
        switch (page) {
            case 0:
                return MainScreenPage.RECENT;
            case 1:
                return MainScreenPage.WORLD;
            case 2:
                return MainScreenPage.INDIA;
            case 3:
                return MainScreenPage.SPORTS;
            case 4:
                return MainScreenPage.EDUCATION;
            default:
                return MainScreenPage.RECENT;
        }
    }
    }
