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
        list.add(new ListItem("Karnal Haveli", images[0], "Karnal Haveli is known as North India's first Haveli known for its multi cuisine food, cultural celebrations, vents, shopping, entertainment, children play area & international standards for a comfortable stay. Spread across 9 acres of lush green landscapes, the hotel's primary concern has always been to promote Punjabi cultural experience. Serving 100% organic cooked food, the place has been attracting a plethora of business and leisure travellers on a regular basis.", "geo:29.7564607,76.9686003"));
        list.add(new ListItem("Neelkanth Star Dhaba", images[1], "Neelkanth Star is a Stylish & Simple 24x7 happening place to come & enjoy with family based on National Highway # 1 between New Delhi & Chandigarh in Karnal.Pure Vegetarian variety of Foods makes us different from the race of traditional restaurants.", "geo:29.6563603,76.9383792"));
        list.add(new ListItem("CHD Daana Paani", images[2], "Daana Paani is a one-stop food destination, offering the tempting flavours of street foods, ethnic favourites and international cuisines with brands like Pizza Hut, Subway, Ni Hao, Vaango, Haldiram, Costa Coffee, Baskin Robins, Chawla’s, Paratha Express to name a few. Modern architecture with a Lively Bollywood theme of Daana Paani embedded with features like handicap friendly structure, children’s play area, ample parking space, Wi-Fi enabled among many others make it a preferred destination for travellers on NH-1 as well as residents of Karnal.", "geo:29.7483396,76.9672051"));
        list.add(new ListItem("KFC Karnal", images[3], "Fast-food chain known for its buckets of fried chicken, plus wings & sides.", "geo:29.7021194,76.9193211"));
        adapter.notifyDataSetChanged();

    }
}
