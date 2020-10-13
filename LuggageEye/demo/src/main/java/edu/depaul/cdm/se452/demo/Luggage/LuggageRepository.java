package edu.depaul.cdm.se452.demo.luggage;
import org.springframework.data.repository.CrudRepository;


public interface LuggageRepository extends CrudRepository<Luggage,Long>{
        Luggage findByCode(String code);
;}