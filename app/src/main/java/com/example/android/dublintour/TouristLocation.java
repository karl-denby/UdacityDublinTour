package com.example.android.dublintour;

import android.graphics.drawable.Drawable;
import android.location.Location;

/**
 * Created by karl_denby on 12/07/2016.
 */
public class TouristLocation {
    private String mPlaceName;
    private String mPlaceDescription;
    private Location mLocationCoordinates;
    private int mPlaceThumbnail;

    public void TouristLocation(String placeName, String placeDescription, Location locationCoordinates, int placeThumbnail) {
        mPlaceName = placeName;
        mPlaceDescription = placeDescription;
        mLocationCoordinates = locationCoordinates;
        mPlaceThumbnail = placeThumbnail;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public String getPlaceDescriptiong() {
        return mPlaceDescription;
    }

    public Location getLocationCoordinates() {
        return mLocationCoordinates;
    }

    public int getPlaceThumbnail() {
        return mPlaceThumbnail;
    }
}
