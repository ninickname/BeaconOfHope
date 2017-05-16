package com.beaconofhope.controllers.rest;

import com.beaconofhope.models.Message;
import com.beaconofhope.models.User;
import com.beaconofhope.repositories.MessageRepository;
import com.beaconofhope.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Nick on 11/02/2017.
 */


@RestController
@RequestMapping("/message/")
public class MessageController {

    @Autowired
    MessageRepository messageRepo;

    @RequestMapping("getMessages")
    public List<Message> getMessages(){

        return messageRepo.findAll();
    }



}
