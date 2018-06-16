package com.example.sanjeev.tourguideapp;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AboutFragment extends Fragment {

    public AboutFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(R.drawable.karnalinfo, getString(R.string.karnal_rail_info)));
        listItems.add(new ListItem(R.drawable.busstand, getString(R.string.karnal_busstand_info)));
        listItems.add(new ListItem(R.drawable.airport, getString(R.string.airport_info)));

        CustomAdapter adapter = new CustomAdapter(getActivity(), listItems);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);


        return rootView;
    }

}
