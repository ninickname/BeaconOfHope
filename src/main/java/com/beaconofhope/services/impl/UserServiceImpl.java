package com.beaconofhope.services.impl;

import com.beaconofhope.models.User;
import com.beaconofhope.repositories.UserRepository;
import com.beaconofhope.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Nick on 11/02/2017.
 */

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepository userRepository;

    @Override
    public User getUserByPhone(String phoneNumber) {
        return userRepository.getUserByPhoneNumber(phoneNumber);
    }
}
