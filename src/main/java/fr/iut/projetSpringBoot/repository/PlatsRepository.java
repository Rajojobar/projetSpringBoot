
package fr.iut.projetSpringBoot.repository;

import org.springframework.data.domain.Page;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.iut.projetSpringBoot.model.Plat;

public interface PlatsRepository extends JpaRepository<Plat, Integer> {

    @Query( "SELECT p FROM Plat p WHERE p.nom LIKE :x" )
    Page<Plat> rechercheParNom ( @Param("x") String mc, Pageable pageable);


    @Query( "SELECT p FROM Plat p WHERE p.nom LIKE :x" )
    List<Plat> rechercheParNom (String mc);
}
