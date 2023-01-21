package com.backend.cine.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.backend.cine.models.entity.Empleado;

public interface IEmpleadoDao extends CrudRepository <Empleado,Long>{

}
