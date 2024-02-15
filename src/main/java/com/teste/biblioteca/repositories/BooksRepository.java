package com.teste.biblioteca.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teste.biblioteca.models.BooksModel;

public interface BooksRepository extends JpaRepository<BooksModel, UUID>{

}
