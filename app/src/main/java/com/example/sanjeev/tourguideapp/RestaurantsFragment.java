package com.example.sanjeev.tourguideapp;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

// Contains famous restaurants in Karnal
public class RestaurantsFragment extends Fragment {

    private MyAdapter adapter;
    private List<ListItem> list;

    public RestaurantsFragment() {

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
        int[] images = {R.drawable.karnalhaveli, R.drawable.neelkanthstardhaba,
                R.drawable.chddaanapaani, R.drawable.kfckarnal};
        list.add(new ListItem("Karnal Haveli", images[0]));
        list.add(new ListItem("Neelkanth Star Dhaba", images[1]));
        list.add(new ListItem("CHD Daana Paani", images[2]));
        list.add(new ListItem("KFC Karnal", images[3]));

        adapter.notifyDataSetChanged();

    }
}
