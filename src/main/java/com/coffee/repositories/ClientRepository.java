package com.coffee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.coffee.entities.Client;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
