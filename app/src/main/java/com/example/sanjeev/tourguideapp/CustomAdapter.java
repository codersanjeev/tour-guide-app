package com.example.sanjeev.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

// Custom ArrayAdapter for Hotels list, Places list and Restaurants list.
public class CustomAdapter extends ArrayAdapter<ListItem> {

    CustomAdapter(Context context, ArrayList<ListItem> listItems) {
        super(context, 0, listItems);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_item, parent, false);
        }

        ListItem currentItem = getItem(position);

        TextView titleTextView = listItemView.findViewById(R.id.textView);
        ImageView imageView = listItemView.findViewById(R.id.imageView);

        assert currentItem != null;
        titleTextView.setText(currentItem.getTitle());

        imageView.setImageResource(currentItem.getImageResourceId());

        return listItemView;
    }
}
