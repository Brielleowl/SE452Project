package db.nosql.paymentRecord;

import java.util.Date;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "paymentRecord")
public class PaymentRecord{
    @Id
    private long paymentID;
    private String passengerName;
    private Date paymentDate;
    private double amount;

}

