package com.example.dsc_onboarding;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class viewPageAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> fragmentArrayList=new ArrayList<>();


    public viewPageAdapter(FragmentManager fm) {
        super(fm);}

    @Override
    public Fragment getItem(int i) {
        return fragmentArrayList.get(i);
    }


    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }


    public void addFragment(Fragment fragment)
    {
        fragmentArrayList.add(fragment);
    }
}



