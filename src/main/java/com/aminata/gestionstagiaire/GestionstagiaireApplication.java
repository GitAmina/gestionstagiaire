package com.aminata.gestionstagiaire;

import com.aminata.gestionstagiaire.entites.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication

public class GestionstagiaireApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(GestionstagiaireApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Stagiaire.class);
		repositoryRestConfiguration.exposeIdsFor(Badge.class);
		repositoryRestConfiguration.exposeIdsFor(Departement.class);
		repositoryRestConfiguration.exposeIdsFor(Direction.class);
		repositoryRestConfiguration.exposeIdsFor(Historique.class);
		repositoryRestConfiguration.exposeIdsFor(Notification.class);
		repositoryRestConfiguration.exposeIdsFor(Piece.class);
		repositoryRestConfiguration.exposeIdsFor(Service.class);
		repositoryRestConfiguration.exposeIdsFor(Stage.class);
		repositoryRestConfiguration.exposeIdsFor(Utilisateur.class);
	}
}