package com.backend.cine.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.cine.models.entity.Empleado;
import com.backend.cine.models.services.IEmpleadoService;

@RestController
@RequestMapping("/api")
public class EmpleadoRestController {
	
	
	@Autowired
	private IEmpleadoService empleadoService;
	
	@GetMapping("empleados")
	public List<Empleado> index(){
		return empleadoService.findAll();
	}

}
