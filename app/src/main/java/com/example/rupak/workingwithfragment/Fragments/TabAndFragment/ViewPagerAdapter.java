package com.example.rupak.workingwithfragment.Fragments.TabAndFragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final int tabcount;

    public ViewPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabcount = tabCount;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                TabFragment1 tab1= new TabFragment1();
                return tab1;
            case 1:
                TabFragment2 tab2= new TabFragment2();
                return tab2;
            case 2:
                TabFragment3 tab3= new TabFragment3();
                return tab3;


            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
