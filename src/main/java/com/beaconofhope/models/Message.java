package com.beaconofhope.models;

import java.util.Date;

/**
 * Created by Nick on 15/05/2017.
 */
public class Message {

    String id;
    String text;
    Date timeOfPublication;
    User publisher;
    Float upvotes;
    Float downvotes;
}
