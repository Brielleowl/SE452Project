package db.nosql.luggageStatusRecord;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "luggagestatusRecord")
public class LuggagestatusRecord {

    @Id
    private long passengerID;

    private String status;


}

