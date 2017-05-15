package com.beaconofhope.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * Created by Nick on 15/05/2017.
 */
@Document
public @Data
class Site {
    @Id
    String macAdress;
    String name;
    String description;
    GeoJsonPoint location;
    List<Message> messages;
}
