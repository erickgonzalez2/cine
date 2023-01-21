package com.backend.cine.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="empleados")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column	
	private Long id_empleado;
	
	private String nombre;
	
	private String apellido_paterno;
	
	private String apellido_materno;
	
	private String puesto;
	
	private Long edad;
	
	private String telefono;
	
	private String direccion;
	
	private String email;
	
	private boolean estado;
	
	
	
	public Long getId_empleado() {
		return id_empleado;
	}


	public void setId_empleado(Long id_empleado) {
		this.id_empleado = id_empleado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido_paterno() {
		return apellido_paterno;
	}


	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}


	public String getApellido_materno() {
		return apellido_materno;
	}


	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}


	public Long getEdad() {
		return edad;
	}


	public void setEdad(Long edad) {
		this.edad = edad;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	

}
