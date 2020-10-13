package edu.depaul.cdm.se452.demo.crew;
import org.springframework.data.repository.CrudRepository;


public interface CrewRepository extends CrudRepository<Crew,Long>{
    Crew findByCode(String code);
;}