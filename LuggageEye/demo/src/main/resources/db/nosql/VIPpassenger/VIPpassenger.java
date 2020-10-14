package db.nosql.VIPpassenger;

import java.util.Date;
import java.util.List;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import db.nosql.paymentRecord.PaymentRecord;
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
	public List<PaymentRecord> findAll() {
		return null;
	}

}

