package com.tivadar11.wearable;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class WearablePagerActivity extends FragmentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wearable_pager);
        final SectionsPageAdapter sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        // Set up the ViewPager with the sections adapter.
        final ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(viewPager);
        // Enables Always-on
        //setAmbientEnabled();
        // for proper ambient support see https://developer.android.com/training/wearables/apps/always-on
    }
    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new Tab1Fragment(), getString(R.string.tab1));
        adapter.addFragment(new Tab2Fragment(), getString(R.string.tab2));
        viewPager.setAdapter(adapter);
    }
}
