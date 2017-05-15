package com.beaconofhope.repositories;

import com.beaconofhope.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Nick on 12/11/2016.
 */

@RepositoryRestResource(collectionResourceRel = "users", path = "user")
public interface UserRepository extends MongoRepository<User, String> {
    User getUserByPhoneNumber(@Param(value = "phone") String phone);
}
