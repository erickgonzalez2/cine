package com.backend.cine.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.backend.cine.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository <Usuario, Long> {

}
