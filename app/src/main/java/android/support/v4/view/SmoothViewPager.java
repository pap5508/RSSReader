package android.support.v4.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class SmoothViewPager extends ViewPager {
    private final int mVelocity = 1;

    public SmoothViewPager(Context context) {
        super(context);
    }

    @Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        return (super.canScroll(v, checkV, dx, x, y));
    }

    public SmoothViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    void smoothScrollTo(int x, int y, int velocity) {
        //ignore passed velocity, use one defined here
        super.smoothScrollTo(x, y, mVelocity);
    }
}
