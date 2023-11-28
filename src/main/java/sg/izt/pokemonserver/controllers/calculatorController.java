package sg.izt.pokemonserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sg.izt.pokemonserver.repo.nationalDexrepo;

@Controller
@RequestMapping("/calculator")
public class calculatorController {

    @Autowired
    nationalDexrepo ndex;


    @GetMapping("/home")
    public String calcHome(){

        return "calchome";
    }
    
}
