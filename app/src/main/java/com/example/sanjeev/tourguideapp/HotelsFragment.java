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

// Will contain famous list of hotels in Karnal.
public class HotelsFragment extends Fragment {

    private MyAdapter adapter;
    private List<ListItem> list;

    public HotelsFragment(){
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
        int[] images = {R.drawable.noormahal, R.drawable.leelagrandhotel, R.drawable.hoteljewels,
                R.drawable.hotelpremplaza, R.drawable.deventurehotel};

        list.add(new ListItem("Noor Mahal", images[0]));
        list.add(new ListItem("Leela Grand Hotel", images[1]));
        list.add(new ListItem("Hotel Jewels", images[2]));
        list.add(new ListItem("Hotel Prem Plaza", images[3]));
        list.add(new ListItem("Deventure Hotel", images[4]));

        adapter.notifyDataSetChanged();
    }
}
