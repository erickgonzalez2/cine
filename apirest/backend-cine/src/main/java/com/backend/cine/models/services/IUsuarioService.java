package com.backend.cine.models.services;

import java.util.List;

import com.backend.cine.models.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> findAll();
}
