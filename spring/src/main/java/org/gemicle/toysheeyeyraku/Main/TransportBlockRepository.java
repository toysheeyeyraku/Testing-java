package org.gemicle.toysheeyeyraku.Main;

import java.util.List;

import org.gemicle.toysheeyeyraku.model.TransportBlock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface TransportBlockRepository extends MongoRepository<TransportBlock, String> {

    public List<TransportBlock> findByType(String type);
   
    
}