package com.adaming.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adaming.entities.Utilisateur;

@Repository
public interface UtilsateurRepository extends JpaRepository <Utilisateur, Long>{
	  
	
 

}
