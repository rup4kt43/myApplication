package com.example.rupak.workingwithfragment.Fragments.SecondFragmentPractice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.example.rupak.workingwithfragment.Fragments.FirstFragmentPractice.RedFragment;
import com.example.rupak.workingwithfragment.Fragments.FirstFragmentPractice.YellowFragment;
import com.example.rupak.workingwithfragment.R;

public class Main2Activity extends AppCompatActivity {

    private FrameLayout top;
    private FrameLayout buttom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        top = findViewById(R.id.topFrameLayout);
        buttom = findViewById(R.id.btmFrameLayout);

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        ft.replace(R.id.topFrameLayout,new TopFragment());
        ft.replace(R.id.btmFrameLayout,new ButtomFragment());
        ft.commit();



      /*  loadTopFragment();
        loadButtomFragment();*/


    }

  /*  private void loadButtomFragment() {
        Fragment fragment;
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        fragment = new ButtomFragment();
        ft.replace(R.id.btmFrameLayout,fragment).commit();
    }


    private void loadTopFragment() {
        Fragment fragment;
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        fragment = new TopFragment();
        ft.replace(R.id.topFrameLayout,fragment).commit();
    }*/


}
