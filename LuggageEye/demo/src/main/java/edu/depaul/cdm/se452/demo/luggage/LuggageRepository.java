package edu.depaul.cdm.se452.demo.luggage;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LuggageRepository extends JpaRepository<Luggage, Long>  {
    List<Luggage> findById(long id);
}
