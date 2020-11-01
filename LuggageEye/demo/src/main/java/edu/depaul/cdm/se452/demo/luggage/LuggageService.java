package edu.depaul.cdm.se452.demo.luggage;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LuggageService {
    @Autowired
    private LuggageRepository repository;
    public List<Luggage> findAll(){
        return repository.findAll();
    }
    public Luggage findById(long id){
        return repository.findById(id).get(0);

    }
    public void deleteById(long id) {
        repository.deleteById(id);
    }
    public Luggage update(Luggage luggage) {
        repository.save(luggage);
        return luggage;
    }
}
