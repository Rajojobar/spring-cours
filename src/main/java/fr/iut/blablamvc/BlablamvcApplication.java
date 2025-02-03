package fr.iut.blablamvc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fr.iut.blablamvc.model.Produit;
import fr.iut.blablamvc.repository.ProduitRepository;

@SpringBootApplication
public class BlablamvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlablamvcApplication.class, args);
	}

	@Bean
	CommandLineRunner initDataBase(ProduitRepository produitRepository) {
		return args -> {
			// produitRepository.save(new Produit("Livre", 20, 5));
			// produitRepository.save(new Produit("Cahier", 5, 10));
			// produitRepository.save(new Produit("Stylo", 2, 15));
			// produitRepository.save(new Produit("Crayon", 1.5, 20));
			// produitRepository.save(new Produit("Avion", 170000, 25));
			// produitRepository.save(new Produit("Taille-crayon", 3, 0));


			// produitRepository.findAll().forEach(System.out::println);
		};
	}
}
