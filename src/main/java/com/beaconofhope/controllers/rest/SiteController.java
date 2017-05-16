package com.beaconofhope.controllers.rest;

import com.beaconofhope.models.Message;
import com.beaconofhope.models.Site;
import com.beaconofhope.repositories.MessageRepository;
import com.beaconofhope.repositories.SiteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Nick on 11/02/2017.
 */


@RestController
@RequestMapping("/site/")
public class SiteController {

    @Autowired
    SiteRepository siteRepo;

    @RequestMapping("getSites")
    public List<Site> getMessages(){

        return siteRepo.findAll();
    }



}
