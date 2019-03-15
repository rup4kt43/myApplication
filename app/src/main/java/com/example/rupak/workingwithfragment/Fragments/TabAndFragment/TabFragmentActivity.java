package com.example.rupak.workingwithfragment.Fragments.TabAndFragment;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;

import com.example.rupak.workingwithfragment.R;

public class TabFragmentActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_fragment);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

        //Initializing tablayout and adding tab and setting the gravity for tablayout
        TabLayout tabLayout = findViewById(R.id.tablayout);
       // tabLayout.setElevation(8);
        tabLayout.addTab(tabLayout.newTab().setText("Frag-1"));
        tabLayout.addTab(tabLayout.newTab().setText("Frag-2"));
        tabLayout.addTab(tabLayout.newTab().setText("Frag-3"));

        // setting gravity to divide tab into equal parts
        tabLayout.setTabGravity(Gravity.NO_GRAVITY);

        //Initializing the pageViewer
         final ViewPager viewPager = findViewById(R.id.ViewPager);

        //Invoking ViewPagerAdapter
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(viewPagerAdapter);

        //Setting the action for viewPager
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));  //change tab when view is changed


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
