package com.coffee.controllers;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coffee.entities.Client;
import com.coffee.entities.TypeClient;
import com.coffee.repositories.ClientRepository;

@RestController
public class ClientController {

	private final ClientRepository clientRepository;

	public ClientController(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}
	
	@GetMapping("/get-all-client")
	public Collection<Client> getAllClients() {
		return clientRepository.findAll();
	}
	
	public Collection<Client> getAllClientPerType(TypeClient typeClient){
		return clientRepository.findAll().stream()
				.filter(cli -> cli.getTypeClient().equals(typeClient))
				.collect(Collectors.toList());
	}
	
	@GetMapping("/get-client/{id}")
	public Client getClient(@PathVariable("id") Integer id) {
		return clientRepository.getOne(id);
	}
	
	@PostMapping("/save-client")
	public boolean saveClient(@RequestBody Client client) {
		return clientRepository.save(client) != null;
	}
}
