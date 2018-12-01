package com.coffee;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.coffee.entities.Client;
import com.coffee.entities.TypeClient;
import com.coffee.repositories.ClientRepository;

@SpringBootApplication
public class CoffeeHotelSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoffeeHotelSpringBootApplication.class, args);
	}
	
	@Bean
    ApplicationRunner init(ClientRepository repository) {
        return args -> {
        	Client client1 = new Client();
        	Client client2 = new Client();
        	client1.setId(1);
        	client2.setId(2);
        	client1.setNombre("Sophos");
        	client2.setNombre("Accenture");
        	client1.setApellido("Nope");
        	client2.setApellido("Too");
        	client1.setCedula(23040);
        	client2.setCedula(230404);
        	client1.setTypeClient(TypeClient.LOCAL);
        	client2.setTypeClient(TypeClient.FOREIGN);
        	client1.setTelefono("4553334");
        	client2.setTelefono("0443434");
            Stream<Client> stream = Stream.of(client1, client2);
            
            stream.forEach(client -> {
            	repository.save(client);
            });
            
            repository.findAll().forEach(System.out::println);
        };
    }
}
