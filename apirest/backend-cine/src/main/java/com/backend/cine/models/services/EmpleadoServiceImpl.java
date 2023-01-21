package com.backend.cine.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.cine.models.dao.IEmpleadoDao;
import com.backend.cine.models.entity.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{

	
	@Autowired
	private IEmpleadoDao empleadoDao;
	
	public List<Empleado>findAll(){
		return (List<Empleado>) empleadoDao.findAll();
	}
}
