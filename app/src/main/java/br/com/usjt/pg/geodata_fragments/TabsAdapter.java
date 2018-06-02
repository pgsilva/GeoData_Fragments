package com.example.auguston.fragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Auguston on 01/06/2018.
 */

public class TabsAdapter extends FragmentPagerAdapter {

    public TabsAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new FragmentPrincipal();
        } else {
            return new FragmentDetalhes();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
