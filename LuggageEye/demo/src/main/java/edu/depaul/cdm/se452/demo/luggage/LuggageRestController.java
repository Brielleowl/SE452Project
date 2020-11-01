package edu.depaul.cdm.se452.demo.luggage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("list-luggages")
public class LuggageRestController {
    @Autowired
    private MockLuggageService mockLuggageService;
    @GetMapping
    public List<Luggage> getAll() {
        return mockLuggageService.findAll();

    }


    @PostMapping
    public Luggage add(@RequestBody Luggage luggage) {
            return mockLuggageService.update(luggage);
    }
    @GetMapping("/{id}")
    public Luggage find(@PathVariable long id) {
        return mockLuggageService.findById(id);
    }
    @PutMapping("/{id}")
    public Luggage update(@RequestBody Luggage updateLuggag, @PathVariable long id){
        Luggage luggage = mockLuggageService.findById(id);
        luggage.setId(id);
        luggage.setStatus("In transit");
        luggage.setPassengerID(12345);
        luggage.setWeight(50);
        return luggage;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        mockLuggageService.deleteById(id);
    }

    
}
