package com.example.controllers;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.dao.AdminDao;
import com.example.logic.Admin;

/* CLASE para responder a Solicitudes  desde ADMIN */

@Controller
public class AdminController {
	
	@Autowired
	AdminDao adminDao;
	
	/* Request para obtener lista de Usuarios */

	@RequestMapping(value="admin/list_admin", produces="text/html;charset=UTF-8")
	@ResponseBody
	public String listContact(ModelAndView model) throws IOException{
		List<Admin> listContact = adminDao.listAllAdmin();
		//model.addObject("listAdmin", listContact);
		//model.setViewName("admin/admin_page"); 
		String response="";
		int cont = 0;
		for(Admin admin : listContact){
			response += "<tr>" +
			"<td>"+ (++cont) +"</td>" +
			"<td>"+admin.getNombre()+"</td>" +
			"<td>"+admin.getApellidoAdmin()+"</td>" +
			"<td>"+admin.getCorreoAdmin()+"</td>" +
			"</tr>";			
		}
		
		return response; 
	}
	
	/* Request para cargar la pagina del Admin */
	@RequestMapping(value="admin", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView model) throws IOException{
		
		model.setViewName("admin/usuarios_admin");	 		
		return model;
	}
	
	/* Request para agregar Usuario a la BD */
	@RequestMapping(value="admin/saveAdmin", method=RequestMethod.POST)
	@ResponseBody 
	public String saveAdmin(@RequestBody MultiValueMap<String,String> params) throws IOException{    
       System.out.println("controoller!!");
		Admin admin = new Admin();
            		
		admin.setNombre(params.getFirst("nombre"));
		admin.setApellidoAdmin(params.getFirst("apellidoAdmin"));
		admin.setCelularAdmin(params.getFirst("celularAdmin"));
		admin.setCorreoAdmin(params.getFirst("correoAdmin"));
		admin.setDireccionAdmin(params.getFirst("direccionAdmin"));
		admin.setContrasenaAdmin(params.getFirst("contrasenaAdmin"));
		admin.setEstadoAdmin(params.getFirst("estadoAdmin"));
		
		adminDao.addAdmin(admin);
		return "true";
	} 	

}
