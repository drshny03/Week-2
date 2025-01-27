package com.tit.ridehailingapp;

// Interface GPS
interface GPS {
    String getCurrentLocation();

    void updateLocation(String newLocation);
}