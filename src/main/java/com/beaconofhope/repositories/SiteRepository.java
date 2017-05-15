package com.beaconofhope.repositories;

import com.beaconofhope.models.Message;
import com.beaconofhope.models.Site;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by Nick on 12/11/2016.
 */

@RepositoryRestResource(collectionResourceRel = "sites", path = "site")
public interface SiteRepository extends MongoRepository<Site, String> {

}
