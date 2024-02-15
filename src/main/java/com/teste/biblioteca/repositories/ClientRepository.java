package com.teste.biblioteca.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.biblioteca.models.ClientModel;

public interface ClientRepository extends JpaRepository<ClientModel, UUID>{

}
