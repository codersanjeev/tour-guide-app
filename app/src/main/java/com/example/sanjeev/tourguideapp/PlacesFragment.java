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
        listItems.add(new ListItem(R.drawable.karnalake, "Karna Lake"));
        listItems.add(new ListItem(R.drawable.kalandershahtomb, "Kalander Shah Tomb"));
        listItems.add(new ListItem(R.drawable.pukkapul, "Pukka Pul"));
        listItems.add(new ListItem(R.drawable.cantonmentchurchtower, "Cantonment Church Tower"));

        CustomAdapter adapter = new CustomAdapter(getActivity(), listItems);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}
