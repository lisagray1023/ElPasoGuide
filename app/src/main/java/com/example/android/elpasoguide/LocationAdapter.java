package com.example.android.elpasoguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by lisa.gray on 7/12/18.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    /**
     * Create a new WordAdapter object
     *
     * @param context   is the current context (ie Fragment) that the adapter is being created in
     * @param locations is the list of Location objects to be displayed
     */

    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Check if the existing view is being reused, otherwise inflate the view
        View locationItemView = convertView;
        if (locationItemView == null) {
            locationItemView = LayoutInflater.from(getContext()).inflate(R.layout.location_item, parent, false);
        }

        //Get the Location object located at this postion in the list
        Location currentLocation = getItem(position);

        //Find the TexView in the location_item.xml layout with the ID location_title_view
        TextView locationTitleView = (TextView) locationItemView.findViewById(R.id.location_title_view);
        //Get the location title from the current Location object and set this text on the TextView
        locationTitleView.setText(currentLocation.getLocationTitle());

        //Find the TexView in the location_item.xml layout with the ID location_type_view
        TextView locationTypeView = (TextView) locationItemView.findViewById(R.id.location_type_view);
        //Get the location type from the current Location object and set this text on the TextView
        locationTypeView.setText(currentLocation.getLocationType());

        //Find the TexView in the location_item.xml layout with the ID location_price_view
        TextView locationPriceView = (TextView) locationItemView.findViewById(R.id.location_price_view);
        //Get the location price from the current Location object and set this text on the TextView
        locationPriceView.setText(currentLocation.getLocationPrice());

        //Find the TexView in the location_item.xml layout with the ID location_address_view
        TextView locationAddressView = (TextView) locationItemView.findViewById(R.id.location_address_view);
        //Get the location address from the current Location object and set this text on the TextView
        locationAddressView.setText(currentLocation.getLocationAddress());

        //Find the ImageView in the location_item.xml layoug with the ID image
        ImageView image = (ImageView) locationItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            //Get the image from the current Location object and set this image on the ImageView
            image.setImageResource(currentLocation.getLocationImageID());
            //Make sure the view is visible
            image.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView
            image.setVisibility(View.GONE);
        }

        //Return the whole location itme layout containing 4 TextViews + 1 ImageView (for some categories)
        //so that it can be shown in the ListView
        return locationItemView;

    }
}
