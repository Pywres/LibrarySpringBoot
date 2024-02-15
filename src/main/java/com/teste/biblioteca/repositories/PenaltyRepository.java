package com.teste.biblioteca.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.biblioteca.models.PenaltyModel;

public interface PenaltyRepository extends JpaRepository<PenaltyModel, UUID>{

}
