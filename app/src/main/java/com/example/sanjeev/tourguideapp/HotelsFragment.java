package com.example.sanjeev.tourguideapp;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

// Will contain famous list of hotels in Karnal.
public class HotelsFragment extends Fragment {
    public HotelsFragment(){
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(R.drawable.noormahal, "Noor Mahal"));
        listItems.add(new ListItem(R.drawable.leelagrandhotel, "Leela Grande Hotel"));
        listItems.add(new ListItem(R.drawable.hoteljewels, "Hotel Jewels"));
        listItems.add(new ListItem(R.drawable.hotelpremplaza, "Hotel Prem Plaza"));
        listItems.add(new ListItem(R.drawable.deventurehotel, "Deventure Hotel"));

        CustomAdapter adapter = new CustomAdapter(getActivity(), listItems);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}
