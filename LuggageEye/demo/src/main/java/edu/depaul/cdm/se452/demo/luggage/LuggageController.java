package edu.depaul.cdm.se452.demo.luggage;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
// @RequestMapping("luggage")
@Controller
public class LuggageController {
    //@Autowired
    //private LuggageRepository luggageRepo;
    @Autowired
    private LuggageService luggageservice;

    @GetMapping("/home")
    public ModelAndView showLuggage() {
        ModelAndView mv = new ModelAndView("list-luggage");
        mv.addObject("luggage", luggageservice.findAll());
        return mv;
    }
    // @GetMapping("/home")
    // public String showAllLuggage(Luggage luggage) {
    //     return "list-luggage";

    // }
   
    @GetMapping("/luggageStatus/{id}")
    public String showLuggageStatus(@PathVariable("id") long luggageId, Model model) {
        Luggage luggage = luggageservice.findById(luggageId);
        model.addAttribute("luggage", luggage);
        return "luggage-status";
    }
    @GetMapping("/addLuggage")
    public String addLuggage(Luggage luggage){
        return "add-luggage";
    }
    @PostMapping("/addLuggage")
    public String addLuggage(@Valid Luggage luggage, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-luggage";
        }
        luggageservice.update(luggage);
        model.addAttribute("luggage", luggageservice.findAll());
        return "redirect:/home";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long luggageId, Model model) {
        luggageservice.deleteById(luggageId);
        return "redirect:/home";
    }


   
}