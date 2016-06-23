package reader.app.android.com.rssreader.toi.screen;

import reader.app.android.com.rssreader.ReaderMainActivity;
import reader.app.android.com.rssreader.toi.enums.ScreenType;


/**
 * Created by Parth on 21-Jun-16.
 */
public abstract class Screen {
    public ReaderMainActivity ma;

    public Screen(ReaderMainActivity ma){
        this.setMa(ma);
    }

    public abstract ScreenType getType();
    public void setMa(ReaderMainActivity ma) {
        this.ma = ma;
    }

    public abstract void refresh(RefreshDTO refreshDTO);

    public void OnBackPressed(){
        getMa().history.deleteLastItemAndThenRefresh();
    }

    public ReaderMainActivity getMa() {
        return ma;
    }

//    public Screen(MainActivity ma) {
//        this.setMa(ma);
//    }
//
//    public abstract FloatingActionsMenu getFloatingActionsMenu();
//
//    public abstract ScreenType getType();
//
//    public abstract void refresh(RefreshDTO refreshDTO);
//
//    public void onBackPressed() {
//        getMa().history.deleteLastItemAndThenRefresh();
//    }
//
//    public MainActivity getMa() {
//        return ma;
//    }
//
//    public void setMa(MainActivity ma) {
//        this.ma = ma;
//    }
//}
}
