package db.nosql;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import db.nosql.paymentRecord.PaymentRecord;
import db.nosql.paymentRecord.PaymentRecordRepository;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
      private static final Logger log = LoggerFactory.getLogger(Main.class);


      @Bean
      public CommandLineRunner savePaymentRecord(PaymentRecordRepository repository){
      
          return(args)->{
              PaymentRecord payment1 = new PaymentRecord();
              payment1.setAmount(30.25);
              payment1.setPassengerName("Sarah");
              payment1.setPaymentDate(new Date());
              payment1.setPaymentID(0325567);
      
              PaymentRecord payment2 = new PaymentRecord();
              payment1.setAmount(50.62);
              payment1.setPassengerName("Mike");
              payment1.setPaymentDate(new Date());
              payment1.setPaymentID(364785);
      
      
          };
      }
      @Bean
      public CommandLineRunner showPayment(PaymentRecordRepository repository) {
          return (args)->{
              List<PaymentRecord> listofPayment = repository.findAll();
              for(PaymentRecord pr : listofPayment) {
                  log.info(pr.toString());
      
              }
          };
      
      }
}

