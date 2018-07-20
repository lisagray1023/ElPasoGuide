package com.example.android.elpasoguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create an ArrayList of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.anson_11), getString(R.string.anson_type),
                getString(R.string.four_dollar_signs), getString(R.string.anson_address), R.drawable.anson_11));
        locations.add(new Location(getString(R.string.ripe_eatery), getString(R.string.ripe_type),
                getString(R.string.three_dollar_signs), getString(R.string.ripe_address), R.drawable.ripe_eatery));
        locations.add(new Location(getString(R.string.crave), getString(R.string.crave_type),
                getString(R.string.two_dollar_signs), getString(R.string.crave_address), R.drawable.crave));
        locations.add(new Location(getString(R.string.hillside_coffee),
                getString(R.string.hillside_type),
                getString(R.string.one_dollar_sign), getString(R.string.hillside_address), R.drawable.hillside));

        //Create a LocationAdapter whose data sourse is the list of Locations above
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);

        //Find the ListView object in the view hierarchy of the Fragment, there should be a ListView
        //with the view id list declared in the location_list.xml layout file
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the LIstView use the LocationAdapter created above so that the ListView will display
        //location items for each Location in that list
        listView.setAdapter(adapter);

        return rootView;
    }

}
