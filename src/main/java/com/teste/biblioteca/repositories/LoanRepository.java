package com.teste.biblioteca.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.biblioteca.models.LoanModel;

public interface LoanRepository extends JpaRepository<LoanModel, UUID>{

}
