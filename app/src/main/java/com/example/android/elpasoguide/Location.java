package com.example.android.elpasoguide;

/**
 * Created by lisa.gray on 7/10/18.
 * Represents a Location object that will contain details to help user learn about each place.
 */

public class Location {

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * Title of location
     */
    private String mLocationTitle;
    /**
     * Type of location - short description
     */
    private String mLocationType;
    /**
     * Price range of the location
     */
    private String mLocationPrice;
    /**
     * Address for location
     */
    private String mLocationAddress;
    /**
     * Image associated with each location
     */
    private int mLocationImageID = NO_IMAGE_PROVIDED;

    /**
     * Create a new Location object, includes image.
     *
     * @param locationTitle   is the name of the location
     * @param locationType    is a description of the location
     * @param locationPrice   is the price range of the location
     * @param locationAddress is the physical address of the location
     * @param locationImageID is the drawable resource ID associated with the image of the location
     */

    public Location(String locationTitle, String locationType, String locationPrice, String locationAddress, int locationImageID) {
        mLocationTitle = locationTitle;
        mLocationType = locationType;
        mLocationPrice = locationPrice;
        mLocationAddress = locationAddress;
        mLocationImageID = locationImageID;
    }

    /**
     * Create a new Location object, does not include image.
     *
     * @param locationTitle   is the name of the location
     * @param locationType    is a description of the location
     * @param locationPrice   is the price range of the location
     * @param locationAddress is the physical address of the location
     */

    public Location(String locationTitle, String locationType, String locationPrice, String locationAddress) {
        mLocationTitle = locationTitle;
        mLocationType = locationType;
        mLocationPrice = locationPrice;
        mLocationAddress = locationAddress;
    }

    /**
     * Get the title of the location
     */
    public String getLocationTitle() {
        return mLocationTitle;
    }

    /**
     * Get the type/short description of the location
     */
    public String getLocationType() {
        return mLocationType;
    }

    /**
     * Get the price point of the location
     */
    public String getLocationPrice() {
        return mLocationPrice;
    }

    /**
     * Get the address of the location
     */
    public String getLocationAddress() {
        return mLocationAddress;
    }

    /**
     * Get the image resource ID of the location
     */
    public int getLocationImageID() {
        return mLocationImageID;
    }

    /**
     * Returns whether or not there is an image for this word
     */
    public boolean hasImage() {
        return mLocationImageID != NO_IMAGE_PROVIDED;
    }

}
