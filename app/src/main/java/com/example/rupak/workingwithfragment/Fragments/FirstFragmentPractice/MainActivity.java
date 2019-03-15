package com.example.rupak.workingwithfragment.Fragments.FirstFragmentPractice;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rupak.workingwithfragment.Fragments.FirstFragmentPractice.RedFragment;
import com.example.rupak.workingwithfragment.Fragments.FirstFragmentPractice.YellowFragment;
import com.example.rupak.workingwithfragment.R;

public class MainActivity extends AppCompatActivity {

    private Button red, yellow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = findViewById(R.id.btn_fragment1);
        yellow = findViewById(R.id.btn_fragment2);

        red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(v);
            }
        });
        yellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(v);
            }
        });


    }

    public void ChangeFragment(View view) {
        Fragment fragment;
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        if (view == findViewById(R.id.btn_fragment1)) {
            fragment = new RedFragment();

            ft.replace(R.id.frame_layout_containeer, fragment).commit();

        }
        if (view == findViewById(R.id.btn_fragment2)) {
            fragment = new YellowFragment();
            ft.replace(R.id.frame_layout_containeer, fragment).commit();
        }
    }
}
