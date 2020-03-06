package com.olmo.restOlmo.reloj;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RutasReloj {

	
	@GetMapping("/unReloj")
	public Reloj unReloj() {
		/*Lo ideal sería tener un bean e inyectarlo, para el ejemplo no nos hace falta*/
		
		
		Reloj reloj = new Reloj();
		reloj.setNombre("Buenos Aires");
		reloj.setHora(12);
		reloj.setMinutos(45);
		reloj.setSegundos(34);
		
		
		return reloj;
	}
	
	@GetMapping("/relojes")
	public List<Reloj> relojes() {
		/*Lo ideal sería tener un servicio e inyectarlo, para el ejemplo no nos hace falta*/
		
		List<Reloj> relojes = new ArrayList<Reloj>();
		
		
		Reloj reloj1 = new Reloj();
		reloj1.setNombre("Buenos Aires");
		reloj1.setHora(12);
		reloj1.setMinutos(45);
		reloj1.setSegundos(34);
		
		Reloj reloj2 = new Reloj();
		reloj2.setNombre("Tokio");
		reloj2.setHora(19);
		reloj2.setMinutos(45);
		reloj2.setSegundos(34);
		
		relojes.add(reloj2);
		relojes.add(reloj1);
	
		
		return relojes;
	}
	
	@PostMapping("/addReloj")
	public Reloj addReloj(@RequestBody Reloj reloj) {
		
		System.out.println("ha llegado un reloj: " + reloj);
		
		return reloj;
		
	}
	
	
}
