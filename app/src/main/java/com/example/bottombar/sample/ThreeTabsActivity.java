package com.example.bottombar.sample;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.roughike.bottombar.BottomBar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iiro on 7.6.2016.
 */
public class ThreeTabsActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_tabs);

        final BottomBar bottomBar = (BottomBar) findViewById(R.id.bottomBar);

        //bottomBar.getTabAtPosition(0).setAnimation("TwitterHeart.json", -15, -2);
        //bottomBar.getTabAtPosition(0).loopAnimation(false);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
//                bottomBar.getTabAtPosition(0).playAnimation(new BottomBarTab.OnHighlightTabListener() {
//                    @Override
//                    public boolean highlight() {
//                        return bottomBar.getCurrentTabPosition() != 0;
//                    }
//                });
            }
        });

        List<Integer> tabsRes = new ArrayList<>();
        tabsRes.add(R.xml.food_tab);
        tabsRes.add(R.xml.location_tab);
        tabsRes.add(R.xml.heart_tab);

        bottomBar.setItems(tabsRes);
    }
}