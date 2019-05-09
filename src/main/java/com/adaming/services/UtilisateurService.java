package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Utilisateur;
import com.adaming.repositories.UtilsateurRepository;

@Service
public class UtilisateurService implements IUtilisateurService{
	@Autowired
	UtilsateurRepository utilisateurRepository;
	@Override
	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll();
	}

	@Override
	public Utilisateur findOne(Long id) {
		// TODO Auto-generated method stub
		return  utilisateurRepository.findOne(id);
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return  utilisateurRepository.save(utilisateur);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
	 utilisateurRepository.delete(id);
	}



}
