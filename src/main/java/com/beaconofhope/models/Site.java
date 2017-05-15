package com.beaconofhope.models;

import org.springframework.data.mongodb.core.geo.GeoJsonPoint;

import java.util.List;

/**
 * Created by Nick on 15/05/2017.
 */
public class Site {
    String macAdress;
    String name;
    String description;
    GeoJsonPoint location;
    List<Message> messages;
}
