package com.beaconofhope.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * Created by Nick on 15/05/2017.
 */
@Document
public @Data class   Message {
    @Id
    String id;
    String text;
    Date timeOfPublication;
    User publisher;
    Float upvotes;
    Float downvotes;
}
