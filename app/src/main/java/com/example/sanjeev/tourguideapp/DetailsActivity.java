package com.example.sanjeev.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class DetailsActivity extends AppCompatActivity {

    ListItem item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Intent in = getIntent();
        item = (ListItem) in.getSerializableExtra("ItemClicked");

        ImageView imageView = findViewById(R.id.collapsing_image_view);
        Toolbar toolbar = findViewById(R.id.detail_screen_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle(item.getName());
        Glide.with(this).load(item.getImageID()).into(imageView);

    }


}
