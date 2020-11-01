package edu.depaul.cdm.se452.demo.luggage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "datasource", havingValue = "db")
public class LuggageService implements ILuggageService{
    @Autowired
    private LuggageRepository repository;
    @Override
    public List<Luggage> findAll(){
        return repository.findAll();
    }
    @Override
    public Luggage findById(long id){
        return repository.findById(id).get(0);

    }
    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }
    @Override
    public Luggage update(Luggage luggage) {
        repository.save(luggage);
        return luggage;
    }



 
}
