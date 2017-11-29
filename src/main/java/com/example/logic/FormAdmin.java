package com.example.logic;

public class FormAdmin {
	
	private  String idAdmin;
	private  String nombre;
	private  String apellidoAdmin;
	private  String celularAdmin;
	private  String correoAdmin;
	private  String direccionAdmin;
	private  String contrasenaAdmin;
	private  String estadoAdmin;
	
	public FormAdmin(){
		
	}
	
	public FormAdmin(String idAdmin, String nombre, String apellidoAdmin, String celularAdmin, String correoAdmin,
			String direccionAdmin, String contrasenaAdmin, String estadoAdmin) {
		super();
		this.idAdmin = idAdmin;
		this.nombre = nombre;
		this.apellidoAdmin = apellidoAdmin;
		this.celularAdmin = celularAdmin;
		this.correoAdmin = correoAdmin;
		this.direccionAdmin = direccionAdmin;
		this.contrasenaAdmin = contrasenaAdmin;
		this.estadoAdmin = estadoAdmin;
	}
	
	public String getIdAdmin() {
		return idAdmin;
	}
	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoAdmin() {
		return apellidoAdmin;
	}
	public void setApellidoAdmin(String apellidoAdmin) {
		this.apellidoAdmin = apellidoAdmin;
	}
	public String getCelularAdmin() {
		return celularAdmin;
	}
	public void setCelularAdmin(String celularAdmin) {
		this.celularAdmin = celularAdmin;
	}
	public String getCorreoAdmin() {
		return correoAdmin;
	}
	public void setCorreoAdmin(String correoAdmin) {
		this.correoAdmin = correoAdmin;
	}
	public String getDireccionAdmin() {
		return direccionAdmin;
	}
	public void setDireccionAdmin(String direccionAdmin) {
		this.direccionAdmin = direccionAdmin;
	}
	public String getContrasenaAdmin() {
		return contrasenaAdmin;
	}
	public void setContrasenaAdmin(String contrasenaAdmin) {
		this.contrasenaAdmin = contrasenaAdmin;
	}
	public String getEstadoAdmin() {
		return estadoAdmin;
	}
	public void setEstadoAdmin(String estadoAdmin) {
		this.estadoAdmin = estadoAdmin;
	}
}
