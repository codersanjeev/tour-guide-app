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

public class AboutFragment extends Fragment {

    private MyAdapter adapter;
    private List<ListItem> list;

    public AboutFragment() {
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

        prepareList();

        return rootView;
    }

    private void prepareList() {
        int[] images = {R.drawable.airport,
        R.drawable.busstand, R.drawable.karnalinfo};

        list.add(new ListItem("Airport", images[0], "Karnal Airport, (ICAO: VI40), the home of Karnal Aviation Club. Karnal Flying Club is an airstrip situated about 3 km east of Karnal in the state of Haryana, India. It is being used for General Aviation and Pilot Training. There are no scheduled commercial flight operations.", "geo:29.7155928,77.0305085"));
        list.add(new ListItem("Bus Stand", images[1], "Located in the middle of the city. One can easily find buses to Delhi or Chandigarh from here.", "geo:29.6907726,76.9845811"));
        list.add(new ListItem("Railway Station", images[2], "Karnal railway station is a station on the Delhi-Kalka line. It is located in the Indian state of Haryana. It serves Karnal and surrounding area. It is located at an altitude of 253 metres (830 ft) above mean sea level. It was allotted the railway code of KUN under the jurisdiction of Delhi railway division.", "geo:29.694786,76.9674866"));

        adapter.notifyDataSetChanged();
    }

}
