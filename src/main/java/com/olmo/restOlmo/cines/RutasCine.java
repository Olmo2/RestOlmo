package com.olmo.restOlmo.cines;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olmo.restOlmo.usuarios.Usuario;



@RestController
public class RutasCine {
	
	@GetMapping("/cines")
	public List<Cine> cines() {
		/*Lo ideal sería tener un servicio e inyectarlo, para el ejemplo no nos hace falta*/
		
		List<Cine> cines = new ArrayList<Cine>();
		List<Sala> salas1 = new ArrayList<Sala>();	
		List<Sala> salas2 = new ArrayList<Sala>();
		
		Sala sala1 = new Sala();
		sala1.setNumero("1");
		sala1.setCapacidad("1000");
		
		Sala sala2 = new Sala();
		sala2.setNumero("2");
		sala2.setCapacidad("50");
		
		Sala sala3 = new Sala();
		sala3.setNumero("3");
		sala3.setCapacidad("96");
		
		salas1.add(sala1);
		salas1.add(sala2);
		
		
		
		
		Cine cine1 = new Cine();
		cine1.setNombre("Yelmo");
		cine1.setCif("123456897-K");
		cine1.setSalas(salas1);
		
		salas2.add(sala3);
		
		Cine cine2 = new Cine();
		cine2.setNombre("Cinesa");
		cine2.setCif("84561237-T");
		cine2.setSalas(salas2);
		
		cines.add(cine1);
		cines.add(cine2);
	
		
		return cines;
	}
	
	@PostMapping("/addCine")
	public ResponseEntity<Cine> addCine(@RequestBody Cine cine){
		
		
		
		 return new ResponseEntity<Cine>(cine,HttpStatus.I_AM_A_TEAPOT);
		
		
	}
	

}
