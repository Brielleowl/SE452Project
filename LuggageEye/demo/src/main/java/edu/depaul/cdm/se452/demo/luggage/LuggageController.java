package edu.depaul.cdm.se452.demo.luggage;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LuggageController {

    @Autowired
    private ILuggageService luggageService;

    @GetMapping("list-luggage")
    public ModelAndView showLuggages() {
        ModelAndView mv = new ModelAndView("list-luggage");
        mv.addObject("luggages", luggageService.findAll());
        return mv;
    }
    
    @Autowired
    private LuggageRepository repo;

    @GetMapping("/checkinluggage")
    public String loginForm(Model model) {
        model.addAttribute("checkinluggage", new Luggage());
        return "checkinluggage";
    }

    @PostMapping("/checkinluggage")
    public String greetingSubmit(@ModelAttribute Luggage luggage, Model model) {
        luggage.createLuggageID();
        luggage.generateConfirmationNumber();
        model.addAttribute("luggage", luggage);
        repo.save(luggage);
        return "confirmation";
    }
   


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") long luggageId, Model model) {
        luggageService.deleteById(luggageId);
        return "redirect:/list-luggage";
        //return "list-luggage";
    }


   
}