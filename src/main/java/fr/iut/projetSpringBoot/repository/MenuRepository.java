package fr.iut.projetSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.iut.projetSpringBoot.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
	
}
