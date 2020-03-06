package com.olmo.restOlmo.chinos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.olmo.restOlmo.usuarios.Usuario;



@RestController
public class RutasChinos {

	@GetMapping("/chino")
	public Chino chino() {
		
		Chino chino = new Chino();
		chino.setNombre("Chin-pon");
		chino.setCoronavirus(true);
		
		return chino;
	}
	
	@GetMapping("/chinos")
	public List<Chino> cines() {
		/*Lo ideal sería tener un servicio e inyectarlo, para el ejemplo no nos hace falta*/
		
		List<Chino> chinos = new ArrayList<Chino>();
	
		Chino chino1 = new Chino();
		chino1.setNombre("Chin-pon");
		chino1.setCoronavirus(true);
		
		Chino chino2 = new Chino();
		chino2.setNombre("Chao-pao");
		chino2.setCoronavirus(true);
		
		Chino chino3 = new Chino();
		chino3.setNombre("Pin-chun");
		chino3.setCoronavirus(true);
		
		Chino chino4 = new Chino();
		chino4.setNombre("chon-pin");
		chino4.setCoronavirus(false);
		
		chinos.add(chino1);
		chinos.add(chino2);
		chinos.add(chino3);
		chinos.add(chino4);
	
		
		return chinos;
	}
	
	@PostMapping("/addChino")
	public ResponseEntity<Chino> addCine(@RequestBody Chino chino){
		
		
			return new ResponseEntity<Chino>(chino,HttpStatus.I_AM_A_TEAPOT);
	}
	
	@PutMapping("/chino/{id}")
	public void Chino(@RequestBody Chino chino, @PathVariable int id){
		
		System.out.println(chino);
		System.out.println(id);
		
		/* Me cercioro de que el id sea correcto
		 * chino.setID(id);
		 * Guardo
		 * chinoDAO.save(chino);*/
		
			
	}
	
	@DeleteMapping("/chino/{id}")
	public void delete(@PathVariable int id){
		
		
		System.out.println("Borrado el: " + id);
		
		/* Borrar
		 * chino.deteById(id););*/
		
			
	}
		
	
}
