package com.example.okee.tugasbesar.User;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.okee.tugasbesar.R;

public class Home extends Fragment {
    View v ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.activity_home, container, false);


        return v;
    }
}
