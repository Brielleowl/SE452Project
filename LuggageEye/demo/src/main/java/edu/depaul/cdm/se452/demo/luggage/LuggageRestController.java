package edu.depaul.cdm.se452.demo.luggage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("luggage")
public class LuggageRestController {
    @Autowired
    private LuggageService luggageService;
    @GetMapping
    public List<Luggage> getAll() {
        return luggageService.findAll();

    }

    @PostMapping
    public Luggage add(@RequestBody Luggage luggage) {
            return luggageService.update(luggage);
    }
    @GetMapping("/{id}")
    public Luggage find(@PathVariable long id) {
        return luggageService.findById(id);
    }
    @PutMapping("/{id}")
    public Luggage update(@RequestBody Luggage updateLuggag, @PathVariable long id){
        Luggage luggage = luggageService.findById(id);
        luggage.setId(id);
        luggage.setStatus("In transit");
        luggage.setPassengerID(12345);
        luggage.setWeight(50);
        return luggage;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        luggageService.deleteById(id);
    }

    
}
