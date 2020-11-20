package edu.depaul.cdm.se452.demo.luggage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LuggageRepository extends CrudRepository<Luggage, Long>  {
    // List<Luggage> findAll();
    // List<Luggage> findById(long id);
    Luggage findById(long id);
    List<Luggage> findAll();
    void deleteById(long id);
}
