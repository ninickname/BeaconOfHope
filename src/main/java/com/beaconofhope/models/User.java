package com.beaconofhope.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//import javax.persistence.OneToMany;

@Document
public @Data  class User {
	@Id
	String id;
	String name;

    String email;
    String password;
    String phoneNumber;
    String userName;

}
