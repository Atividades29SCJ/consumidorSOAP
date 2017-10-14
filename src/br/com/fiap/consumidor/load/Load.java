package br.com.fiap.consumidor.load;

import javax.xml.ws.Endpoint;

import br.com.fiap.consumidor.service.ConsumidorService;

public class Load {

	public static void main(String[] args) {
		
		ConsumidorService consumidorService = new ConsumidorService();
		Endpoint.publish("http://localhost:8080/service", consumidorService);
		
	}
	
}
