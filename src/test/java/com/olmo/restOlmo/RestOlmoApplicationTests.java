package com.olmo.restOlmo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.olmo.restOlmo.chinos.Chino;

@SpringBootTest
class RestOlmoApplicationTests {

	@Test
	void pruebaGet() throws URISyntaxException {

		// URL a la que se conecta
		URI url = new URI("http://localhost:9090/chino");

		// Tipo de peticion que hace GET/POST/PUT/DELETE
		RequestEntity<Chino> request = new RequestEntity<Chino>(HttpMethod.GET, url);

		// Objeto response que da la respuesta a la peticion
		ResponseEntity<Chino> response;

		RestTemplate ejecutor = new RestTemplate();
		response = ejecutor.exchange(request, Chino.class);

		System.out.println(response.getBody());
		System.out.println(response.hasBody());

		assertTrue(response.hasBody());
	}

	@Test
	void pruebaPost() throws URISyntaxException {
		
		Chino chino = new Chino();
		chino.setNombre("Chao-pao-pao");
		chino.setCoronavirus(true);

		// URL a la que se conecta
		URI url = new URI("http://localhost:9090/addChino");

		// Tipo de peticion que hace GET/POST/PUT/DELETE
		RequestEntity<Chino> request = new RequestEntity<Chino>(chino,HttpMethod.POST, url);

		// Objeto response que da la respuesta a la peticion
		ResponseEntity<Chino> response;

		RestTemplate ejecutor = new RestTemplate();
		response = ejecutor.exchange(request, Chino.class);
		
		System.out.println(response.getBody());
		System.out.println(response.hasBody());
		System.out.println(request.getBody());

		

	}

}
