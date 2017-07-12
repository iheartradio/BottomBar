package com.example.bottombar.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabReselectListener;
import com.roughike.bottombar.OnTabSelectListener;

/**
 * Created by iiro on 7.6.2016.
 */
public class ThreeTabsActivity extends Activity {
    private TextView messageView;
    private LottieAnimationView mLottieAnimationView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_tabs);

        mLottieAnimationView = (LottieAnimationView) findViewById(R.id.lottieView);
        mLottieAnimationView.loop(true);
        mLottieAnimationView.setAnimation("TwitterHeart.json");
        mLottieAnimationView.playAnimation();

        final BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);
        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                //messageView.setText(TabMessage.get(tabId, false));
                bottomBar.getTabAtPosition(0).playAnimation();
            }
        });

        bottomBar.setOnTabReselectListener(new OnTabReselectListener() {
            @Override
            public void onTabReSelected(@IdRes int tabId) {
                //Toast.makeText(getApplicationContext(), TabMessage.get(tabId, true), Toast.LENGTH_LONG).show();
                //animate(bottomBar);
            }
        });
        bottomBar.getTabAtPosition(0).setAnimation("TwitterHeart.json");
        bottomBar.getTabAtPosition(0).loopAnimation(false);
    }

    private void animate(final BottomBar bottomBar) {

        //bottomBar.getTabAtPosition(0).playAnimation("", 3);
    }
}