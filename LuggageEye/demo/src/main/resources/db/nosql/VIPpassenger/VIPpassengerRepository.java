package db.nosql.VIPpassenger;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VIPpassengerRepository extends MongoRepository<VIPpassenger, String> {
    
}

