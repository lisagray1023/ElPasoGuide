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
public class OutdoorsFragment extends Fragment {


    public OutdoorsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        //Create an ArrayList of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(getString(R.string.wet_n_wild),
                getString(R.string.wet_type),
                getString(R.string.three_dollar_signs), getString(R.string.wet_address)));
        locations.add(new Location(getString(R.string.wyler_tramway), getString(R.string.wyler_type),
                getString(R.string.two_dollar_signs), getString(R.string.wyler_address)));
        locations.add(new Location(getString(R.string.franklin_mountains), getString(R.string.franklin_type),
                getString(R.string.one_dollar_sign), getString(R.string.franklin_address)));
        locations.add(new Location(getString(R.string.spray_parks), getString(R.string.spray_type),
                getString(R.string.free), getString(R.string.spray_website)));


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
