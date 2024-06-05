package tn.esprit.rh.achat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.rh.achat.entities.CategorieProduit;
//testwebhookbeforevalidationtommorow

@Repository
public interface CategorieProduitRepository extends JpaRepository<CategorieProduit, Long>{

}
