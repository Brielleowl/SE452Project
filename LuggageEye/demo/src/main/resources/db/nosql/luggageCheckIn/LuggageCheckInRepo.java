package db.nosql.luggageCheckIn;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LuggageCheckInRepo extends MongoRepository<LuggageCheckIn, String> {

}
