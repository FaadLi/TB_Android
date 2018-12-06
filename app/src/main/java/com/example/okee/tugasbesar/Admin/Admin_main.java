package com.example.okee.tugasbesar.Admin;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.okee.tugasbesar.Account.Login;
import com.example.okee.tugasbesar.MainActivity;
import com.example.okee.tugasbesar.R;
import com.example.okee.tugasbesar.User.Profil;


public class Admin_main extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout drawer;

    LinearLayout nav_header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();



        if(savedInstanceState == null ){
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new Admin_home()).commit();
            navigationView.setCheckedItem(R.id.btn_home);
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.btn_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Admin_home()).commit();
                break;
            case R.id.btn_tambah:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Admin_tambah()).commit();
                break;
            case R.id.btn_galeri:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new Admin_galeri()).commit();
                break;

                //tombol
            case R.id.btn_share:
                Toast.makeText(this, "Share. coming soon", Toast.LENGTH_SHORT).show();
                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void onBackPressed(){
        if(drawer.isDrawerOpen(GravityCompat.START)){
            drawer.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }

    public void clic(){
        nav_header = (LinearLayout) findViewById(R.id.nav_header);

        nav_header.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Admin_main.this, Admin_profil.class);
                startActivity(i);
            }
        });
    }


}
