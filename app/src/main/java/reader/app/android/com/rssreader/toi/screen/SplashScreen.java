package reader.app.android.com.rssreader.toi.screen;

import android.view.View;
import android.widget.Button;

import reader.app.android.com.rssreader.R;
import reader.app.android.com.rssreader.ReaderMainActivity;
import reader.app.android.com.rssreader.toi.enums.ScreenType;


/**
 * Created by Parth on 21-Jun-16.
 */
public class SplashScreen extends Screen {

    public SplashScreen(ReaderMainActivity ma) {
        super(ma);
        createSplashScreen();
    }


    private void createSplashScreen() {
        getMa().setContentView(R.layout.splash_screen);
        Button mEnter = (Button) getMa().findViewById(R.id.enter);
        mEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new MainScreen(getMa());

            }
        });
    }

    @Override
    public ScreenType getType() {
        return ScreenType.SplashScreen;
    }

    @Override
    public void refresh(RefreshDTO refreshDTO) {

    }

    @Override
    public void OnBackPressed() {
        super.OnBackPressed();
    }
}
