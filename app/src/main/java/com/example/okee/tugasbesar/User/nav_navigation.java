package com.example.okee.tugasbesar.User;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.okee.tugasbesar.R;

public class nav_navigation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_navigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Home()).commit();

        BottomNavigationView botNav = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        botNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedfragment = null;

                    switch (item.getItemId()){
                        case R.id.nav_home:
                            selectedfragment = new Home();
                            break;
                        case R.id.nav_maps:
                            selectedfragment = new Maps();
                            break;
                        case R.id.nav_profil:
                            selectedfragment = new Profil_nav();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,selectedfragment).commit();
                    return true;
                }
            };



    }
