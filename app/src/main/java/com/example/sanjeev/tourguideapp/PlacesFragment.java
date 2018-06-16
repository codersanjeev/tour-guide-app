package com.example.sanjeev.tourguideapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// Will contain famous places in Karnal
public class PlacesFragment extends Fragment {
    public PlacesFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(R.drawable.karnalake, getString(R.string.place1)));
        listItems.add(new ListItem(R.drawable.kalandershahtomb, getString(R.string.place2)));
        listItems.add(new ListItem(R.drawable.pukkapul, getString(R.string.place3)));
        listItems.add(new ListItem(R.drawable.cantonmentchurchtower, getString(R.string.place4)));

        CustomAdapter adapter = new CustomAdapter(getActivity(), listItems);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}
