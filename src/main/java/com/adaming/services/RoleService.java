package com.adaming.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaming.entities.Role;
import com.adaming.repositories.RoleRepository;

@Service
public class RoleService implements IRoleService{
@Autowired
RoleRepository roleRepository;
	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public Role findOne(Long id) {
		// TODO Auto-generated method stub
		return roleRepository.findOne(id);
	}

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		return  roleRepository.save(role);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		roleRepository.delete(id);
	}

}
