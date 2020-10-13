package edu.depaul.cdm.se452.demo.flight;
import org.springframework.data.repository.CrudRepository;


public interface FlightRepository extends CrudRepository<Flight,Long>{
    Flight findByCode(String code);
;}
