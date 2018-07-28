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

        list.add(new ListItem("Airport", images[0]));
        list.add(new ListItem("Bus Stand", images[1]));
        list.add(new ListItem("Railway Station", images[2]));

        adapter.notifyDataSetChanged();
    }

}
