package fr.iut.projetSpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.iut.projetSpringBoot.repository.PlatsRepository;

@Controller
@RequestMapping("/plats")
public class PlatsController {

    private PlatsRepository platRepository;

    PlatsController(PlatsRepository platRepository){
        this.platRepository = platRepository;
    }
    
    @GetMapping("/produits")
    public String ListerProduits(PlatsRepository platRepository, Model model){

        model.addAttribute("produits", platRepository.findAll());
        model.addAttribute("nbProduits", platRepository.count());

        return "produits";
    }
}
