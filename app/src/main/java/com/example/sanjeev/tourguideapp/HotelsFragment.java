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

        list.add(new ListItem("Noor Mahal", images[0], "Noor Mahal is inspired by India’s rich heritage and captures the royalty created by Indian maharajas over the centuries. The hotel has been designed with intricate details to capture the authentic essence of traditional Mughal and Rajputana styles of architecture. With this unique combination of traditional royal essence and modern amenities, the NOORMAHAL hotel exudes warmth and comfort for all its guests. Besides the conventional luxuries of a five star hotel, NOORMAHAL also offers many other lavish amenities that makes it one of the most sought after weekend getaways to unwind, relax and enjoy with your family & friends!", "geo:29.6981682,77.0281626"));
        list.add(new ListItem("Leela Grand Hotel", images[1], "Located 3 km from Karnal train station and 7 km from Karna Lake, this casual hotel with a mock-palace facade is in a commercial area close to Karnal city centre. Featuring free Wi-Fi, the subdued rooms have polished marble floors, seating areas and classic dark wood furnishings. All are equipped with flat-screen TVs, minifridges and electronic safes. Upgraded rooms add sofas and rainfall showerheads. Room service is available. Multi-cuisine dining is available, plus there's a terrace.", "geo:29.6949206,76.9927682"));
        list.add(new ListItem("Hotel Jewels", images[2], "Warmly decorated, unpretentious rooms offer flat-screen TVs, free Wi-Fi and minifridges. Suites add separate living areas, and upgraded 2-bedroom suites have wet bars and pantries. Room service is available 24/7.", "geo:29.69988,76.9864482"));
        list.add(new ListItem("Hotel Prem Plaza", images[3], "Sophisticated rooms are warmly decorated, featuring free Wi-Fi and flat-screen TVs, plus minibars, and tea and coffeemaking facilities. Upgraded rooms add sitting areas with leather sofas. Room service is available 24/7. Amenities include an international restaurant, a streamlined bar and a pastry shop. Parking is complimentary.", "geo:29.6918962,76.9758297"));
        list.add(new ListItem("Deventure Hotel", images[4], "Set in a contemporary building with tall glass doors and a garden, this relaxed hotel is 4 km from Karnal train station. It's 9 km from Karna Lake and 3 km from Karan Park. Casual rooms offer free Wi-Fi, flat-screen TVs and private bathrooms. All have views of the garden. Warm suites add seating areas. Room service is available.", "geo:29.6699361,76.9895639"));

        adapter.notifyDataSetChanged();
    }
}
