package com.backend.cine.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.cine.models.dao.IUsuarioDao;
import com.backend.cine.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	private IUsuarioDao usuarioDao;
	
	
	@Override
	@Transactional (readOnly = true)
	public List<Usuario> findAll(){
					
		return (List<Usuario>) usuarioDao.findAll();		
	}	
}
