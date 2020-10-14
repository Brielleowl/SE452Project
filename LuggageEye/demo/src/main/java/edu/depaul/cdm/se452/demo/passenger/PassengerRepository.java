package edu.depaul.cdm.se452.demo.passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger,Long>{
    Passenger findByName(String name);
;}
