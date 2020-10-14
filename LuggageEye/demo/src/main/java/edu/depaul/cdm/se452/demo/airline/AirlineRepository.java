package edu.depaul.cdm.se452.demo.airline;
import org.springframework.data.repository.CrudRepository;


public interface AirlineRepository extends CrudRepository<Airline,Long>{
    Airline findByCode(String code);
;}
