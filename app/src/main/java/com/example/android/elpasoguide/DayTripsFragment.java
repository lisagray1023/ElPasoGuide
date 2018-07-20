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
public class DayTripsFragment extends Fragment {


    public DayTripsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create an ArrayList of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.carlsbad_caverns), getString(R.string.carlsbad_type),
                getString(R.string.two_dollar_signs), getString(R.string.carlsbad_address)));
        locations.add(new Location(getString(R.string.white_sands), getString(R.string.white_sands_type),
                getString(R.string.one_dollar_sign), getString(R.string.white_sands_address)));
        locations.add(new Location(getString(R.string.hueco_tanks),
                getString(R.string.hueco_type),
                getString(R.string.one_dollar_sign), getString(R.string.hueco_address)));
        locations.add(new Location(getString(R.string.cloudcroft), getString(R.string.cloudcroft_type),
                getString(R.string.varies), getString(R.string.cloudcroft_website)));


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
