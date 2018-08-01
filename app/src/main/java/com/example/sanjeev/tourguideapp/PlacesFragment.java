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

// Will contain famous places in Karnal
public class PlacesFragment extends Fragment {

    private MyAdapter adapter;
    private List<ListItem> list;

    public PlacesFragment() {

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
        int[] images = {R.drawable.kalandershahtomb, R.drawable.karnalake, R.drawable.pukkapul,
                R.drawable.cantonmentchurchtower};
        list.add(new ListItem("Kalander Shah Tomb", images[0], "Kalander Shah's tomb is situated just outside the town. The well-sculptured grave is made of marble. The tomb was built by Ghias-ud-din, Emperor of Delhi, in the memory of Bo-Ali-Qualander Shah, a famous Muslim savant and sage, who influenced the thinking of his age and was very widely respected by all communities.", "geo:29.713105,77.0222702"));
        list.add(new ListItem("Karna Lake", images[1], "Karna Lake is a major tourist attraction in the Karnal district of Haryana. It is located at a distance of 125 km from both Chandigarh and Delhi, thus serving as a midway halt while traveling between the two cities on the famous Grand Trunk Road. Folklore has it that Karna, a famous character from Indian history, who played a major role in the war of Mahabharat, used to bathe in this lake.", "geo:29.7434595,76.9752332"));
        list.add(new ListItem("Pukka Pul", images[2], "The Pukka Pul also known as the Sayad’s Shrine is situated at a distance of 7 km from the district of Karnal, near the Mughal Bridge. Devotees from all around the world gather here to make offerings and move ahead towards good in life leaving behind the bad. This tomb is also believed to have powers of sending away ghosts along with curing ailments. A fair is also held at this tomb every Thursday during which lamps are lit all over the place.", "geo:29.6270454,76.9779021"));
        list.add(new ListItem("Cantonment Church Tower", images[3], "The Cantonment Church Tower is a church tower in Karnal city of Haryana, India. It stands near National Highway 1 of India. It has been declared as a historical monument by Indian National Trust for Art and Cultural Heritage. It was the tower of St. James' Church, Karnal, dedicated to St. James, one of disciples of Jesus Christ. The tower is 35m tall, and is surmounted by an ornamental cross.", "geo:29.7036529,76.9857913"));
        adapter.notifyDataSetChanged();
    }
}
