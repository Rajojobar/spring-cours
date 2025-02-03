package fr.iut.blablamvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.iut.blablamvc.repository.ProduitRepository;

@Controller
public class ProduitsController {

    private ProduitRepository produitRepository;

    ProduitsController(ProduitRepository produitRepository){
        this.produitRepository = produitRepository;
    }
    
    @GetMapping("/produits")
    public String ListerProduits(ProduitRepository produitRepository, Model model){

        model.addAttribute("produits", produitRepository.findAll());
        model.addAttribute("nbProduits", produitRepository.count());

        return "produits";
    }

    {
        Pageable Pageable = PageRequest.of(page, size);
        
    }
}
