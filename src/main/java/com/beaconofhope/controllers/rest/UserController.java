package com.beaconofhope.controllers.rest;

import com.beaconofhope.models.User;
import com.beaconofhope.repositories.UserRepository;
import com.beaconofhope.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Nick on 11/02/2017.
 */


@RestController
@RequestMapping("/user/")
public class UserController {

    @Autowired
    UserRepository userRepo;

    @RequestMapping("getUsers")
    public List<User> getUsers(){
        return userRepo.findAll();
    }



}
