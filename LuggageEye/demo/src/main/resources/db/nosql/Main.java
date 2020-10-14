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
import db.nosql.VIPpassenger.VIPpassenger;
import db.nosql.VIPpassenger.VIPpassengerRepository;
import db.nosql.luggageCheckIn.LuggageCheckIn;
import db.nosql.luggageStatusRecord.LuggagestatusRecord;


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
              payment2.setAmount(50.62);
              payment2.setPassengerName("Mike");
              payment2.setPaymentDate(new Date());
              payment2.setPaymentID(364785);

              VIPpassenger vip1 = new VIPpassenger();
              vip1.setAirlinrID(0326542);
              vip1.setRegistrationTime(new Date());
              vip1.setVipID(24800);
              vip1.setVipPassengerName("Mike");

              VIPpassenger vip2 = new VIPpassenger();
              vip2.setAirlinrID(99654);
              vip2.setRegistrationTime(new Date());
              vip2.setVipID(35621);
              vip2.setVipPassengerName("Samira");

              LuggagestatusRecord status1 = new LuggagestatusRecord();
              status1.setPassengerID(032674);
              status1.setStatus("delayed");

              LuggagestatusRecord status2 = new LuggagestatusRecord();
              status2.setPassengerID(034521);
              status2.setStatus("Arrived");

              LuggagestatusRecord status3 = new LuggagestatusRecord();
              status3.setPassengerID(45623);
              status3.setStatus("Scanned");

              LuggageCheckIn luggageChech1 = new LuggageCheckIn();
              luggageChech1.setCheckInDate(20200506);
              luggageChech1.setCheckInID(25642);
              luggageChech1.setPassengerName("Brielle");

              LuggageCheckIn luggageChech2 = new LuggageCheckIn();
              luggageChech2.setCheckInDate(20191208);
              luggageChech2.setCheckInID(98231);
              luggageChech2.setPassengerName("John");

      
      
          };
      }
      @Bean
      public CommandLineRunner showPayment(PaymentRecordRepository repository) {

        
          return (args)->{
              List<PaymentRecord> paymentRecord = repository.findAll();
              for(PaymentRecord pr : paymentRecord) {
                  log.info("start to find all data");
                  log.info(pr.toString());
      
              }
          };
      
      }
      @Bean
      public CommandLineRunner showVIP(VIPpassengerRepository repository) {

        
        return (args)->{
            List<VIPpassenger> VIPpassengerRecord = repository.findAll();
            for(VIPpassenger record : VIPpassengerRecord) {
                log.info("start to find all data");
                log.info(record.toString());
    
            }
        };
    
    }
}

