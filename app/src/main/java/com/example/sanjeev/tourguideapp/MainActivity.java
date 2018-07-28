package com.example.sanjeev.tourguideapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_black_24dp);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        PlacesFragment fragment = new PlacesFragment();
        fragmentTransaction.add(R.id.main_content, fragment);
        fragmentTransaction.commit();

        drawerLayout = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                item -> {
                    item.setChecked(true);
                    drawerLayout.closeDrawers();
                    switch (item.getItemId()){
                        case R.id.places :
                            PlacesFragment fragment1 = new PlacesFragment();
                            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                            transaction.replace(R.id.main_content, fragment1);
                            transaction.addToBackStack(null);
                            transaction.commit();
                            break;
                        case R.id.restaurants :
                            RestaurantsFragment fragment2 = new RestaurantsFragment();
                            FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                            transaction1.replace(R.id.main_content, fragment2);
                            transaction1.addToBackStack(null);
                            transaction1.commit();
                            break;
                        case R.id.about :
                            AboutFragment fragment3 = new AboutFragment();
                            FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                            transaction2.replace(R.id.main_content, fragment3);
                            transaction2.addToBackStack(null);
                            transaction2.commit();
                            break;
                        case R.id.hotels :
                            HotelsFragment fragment4 = new HotelsFragment();
                            FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                            transaction3.replace(R.id.main_content, fragment4);
                            transaction3.addToBackStack(null);
                            transaction3.commit();
                    }

                    return true;
                }
        );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home :
                drawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

