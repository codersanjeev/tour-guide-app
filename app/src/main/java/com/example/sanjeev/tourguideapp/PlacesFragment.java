package com.example.sanjeev.tourguideapp;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

// Will contain famous places in Karnal
public class PlacesFragment extends Fragment {

    private MyAdapter adapter;
    private List<ListItem> list;

    public PlacesFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_view, container, false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recycler_view);
        list = new ArrayList<>();
        adapter = new MyAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        prepareView();
        return rootView;
    }

    private void prepareView() {
        int[] images = {R.drawable.kalandershahtomb, R.drawable.karnalake, R.drawable.pukkapul,
                R.drawable.cantonmentchurchtower};

        list.add(new ListItem("Kalander Shah Tomb", images[0]));
        list.add(new ListItem("Karna Lake", images[1]));
        list.add(new ListItem("Pukka Pul", images[2]));
        list.add(new ListItem("Cantonment Church Tower", images[3]));

        adapter.notifyDataSetChanged();
    }
}
