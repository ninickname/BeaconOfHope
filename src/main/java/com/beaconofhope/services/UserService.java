package com.beaconofhope.services;

import com.beaconofhope.models.User;

/**
 * Created by Nick on 11/02/2017.
 */

public interface UserService {


    public User getUserByPhone(String phoneNumber);
}
