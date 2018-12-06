package com.example.okee.tugasbesar.User;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.okee.tugasbesar.Admin.Admin_main;
import com.example.okee.tugasbesar.R;

public class Profil_nav extends Fragment {
    View v;
    Button btn_profil;
    Button btn_admin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v= inflater.inflate(R.layout.activity_profil_nav, container, false);

        setBtn_admin();
        setBtn_profil();

        return v;
    }
    public void setBtn_profil(){
        btn_profil = v.findViewById(R.id.btn_profil);

        btn_profil.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(getContext(), Profil.class);
                startActivity(i);
            }
        });
    }

    public void setBtn_admin(){
        btn_admin = v.findViewById(R.id.btn_admin);

        btn_admin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(getContext(), Admin_main.class);
                startActivity(i);
            }
        });
    }
}
