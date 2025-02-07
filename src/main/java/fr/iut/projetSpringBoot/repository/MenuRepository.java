package fr.iut.projetSpringBoot.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.iut.projetSpringBoot.model.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {

    @Query( "SELECT p FROM Menu p WHERE p.nom LIKE :x" )
    Page<Menu> rechercheParNom ( @Param("x") String mc, Pageable pageable);


    @Query( "SELECT p FROM Menu p WHERE p.nom LIKE :x" )
    List<Menu> rechercheParNom (String mc);
}
