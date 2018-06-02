package com.example.auguston.fragments;

import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;

/**
 * Created by Auguston on 01/06/2018.
 */

public class MyTabsListener implements ActionBar.TabListener {

    private ViewPager viewPager;
    private int index;

    public MyTabsListener(ViewPager viewPager, int index) {
        this.index = index;
        this.viewPager = viewPager;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
        viewPager.setCurrentItem(index);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
