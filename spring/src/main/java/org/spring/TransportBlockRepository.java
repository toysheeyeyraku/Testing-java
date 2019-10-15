package org.spring;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import model.TransportBlock;

public interface TransportBlockRepository extends MongoRepository<TransportBlock, String> {

    public List<TransportBlock> findByType(String type);
   
    
}