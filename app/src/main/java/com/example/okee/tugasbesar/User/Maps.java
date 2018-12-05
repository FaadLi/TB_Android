package com.example.okee.tugasbesar.User;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.okee.tugasbesar.R;

//public class Maps extends FragmentActivity implements OnMapReadyCallback {
public class Maps extends Fragment {
    View v ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_maps, container, false);


        return v;
    }

}