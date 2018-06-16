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

        listItems.add(new ListItem(R.drawable.noormahal, getString(R.string.hotel1)));
        listItems.add(new ListItem(R.drawable.leelagrandhotel, getString(R.string.hotel2)));
        listItems.add(new ListItem(R.drawable.hoteljewels, getString(R.string.hotel3)));
        listItems.add(new ListItem(R.drawable.hotelpremplaza, getString(R.string.hotel4)));
        listItems.add(new ListItem(R.drawable.deventurehotel, getString(R.string.hotel5)));

        CustomAdapter adapter = new CustomAdapter(getActivity(), listItems);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}
