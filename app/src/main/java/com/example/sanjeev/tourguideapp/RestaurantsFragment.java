package com.example.sanjeev.tourguideapp;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


// Contains famous restaurants in Karnal
public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<ListItem> listItems = new ArrayList<>();
        listItems.add(new ListItem(R.drawable.karnalhaveli, "Karnal Haveli"));
        listItems.add(new ListItem(R.drawable.neelkanthstardhaba, "Neelkanth Star Dhabha"));
        listItems.add(new ListItem(R.drawable.chddaanapaani, "Daana Paani"));
        listItems.add(new ListItem(R.drawable.kfckarnal, "KFC Karnal"));

        CustomAdapter adapter = new CustomAdapter(getActivity(), listItems);
        ListView listView = rootView.findViewById(R.id.listView);
        listView.setAdapter(adapter);

        return rootView;
    }
}
