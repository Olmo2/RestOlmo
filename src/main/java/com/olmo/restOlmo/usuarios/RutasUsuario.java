package com.olmo.restOlmo.usuarios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.olmo.restOlmo.reloj.Reloj;

@RestController
public class RutasUsuario {
	
	@Autowired
	UsuarioDAO  usuarioDAO;
	
	
	@GetMapping("/usuarios")
	public List<Usuario> usuarios() {
		/*Lo ideal sería tener un servicio e inyectarlo, para el ejemplo no nos hace falta*/
		
		
		
		
		List<Usuario> listaUsuarios = (List<Usuario>)usuarioDAO.findAll();
	
		
		
		
		return listaUsuarios;
	}
	
	
	@GetMapping("usuarios/{id}")
	ResponseEntity<Usuario> findOne(@PathVariable String id){
		
		Optional<Usuario> user = usuarioDAO.findById(id);
		
		if(user.isPresent()) {
			return new ResponseEntity<Usuario>(user.get(),HttpStatus.OK);
		}else
			return new ResponseEntity<Usuario>(HttpStatus.I_AM_A_TEAPOT);
		
	}

}
