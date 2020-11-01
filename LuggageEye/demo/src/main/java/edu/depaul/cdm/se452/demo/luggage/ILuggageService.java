package edu.depaul.cdm.se452.demo.luggage;

import java.util.List;

public interface ILuggageService {
    public List<Luggage> findAll();
    public Luggage update(Luggage luggage);
  
    public Luggage findById(long luggageId);

    
    public void deleteById(long luggageId);
}
