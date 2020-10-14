package db.nosql.VIPpassenger;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "VIPpassenger")
public class VIPpassenger{
    @Id
    private long vipID;
    private String vipPassengerName;
    private Date registrationTime;
    private long airlinrID;

}

