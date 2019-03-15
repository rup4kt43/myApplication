package com.example.rupak.workingwithfragment.Fragments.SecondFragmentPractice;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.rupak.workingwithfragment.R;



public class ButtomFragment extends Fragment {
    private String value ="Hey";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.buttom_fragment,container,false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        TextView tv = view.findViewById(R.id.textHere);
        Bundle bundle = getArguments();
        if(bundle ==null){
            Toast.makeText(getContext(), "Waiting to get Data", Toast.LENGTH_SHORT).show();
        }else {

            String text = bundle.getString("key");
            tv.setText(text);
            Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
        }







    }


}
