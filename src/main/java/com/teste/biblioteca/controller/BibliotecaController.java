package com.teste.biblioteca.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import com.teste.biblioteca.dtos.BookRecordDto;
import com.teste.biblioteca.dtos.ClientRecordDto;
import com.teste.biblioteca.models.BooksModel;
import com.teste.biblioteca.models.ClientModel;
import com.teste.biblioteca.repositories.BooksRepository;
import com.teste.biblioteca.repositories.ClientRepository;
import com.teste.biblioteca.repositories.LoanRepository;
import com.teste.biblioteca.repositories.PenaltyRepository;

import jakarta.validation.Valid;

@RestController
public class BibliotecaController {

    @Autowired
    BooksRepository booksRepository;
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    LoanRepository loanRepository;
    @Autowired
    PenaltyRepository penaltyRepository;

    @PostMapping("/library/books")
    public ResponseEntity<BooksModel> saveBook(@RequestBody @Valid BookRecordDto bookRecordDto) {
        var booksModel = new BooksModel();
        BeanUtils.copyProperties(bookRecordDto, booksModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(booksRepository.save(booksModel));
    }

    @GetMapping("/library/books")
    public ResponseEntity<List<BooksModel>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(booksRepository.findAll());
    }

    @PostMapping("/library/clients")
    public ResponseEntity<ClientModel> saveClient(@RequestBody @Valid ClientRecordDto clientRecordDto) {
        var clientModel = new ClientModel();
        BeanUtils.copyProperties(clientRecordDto, clientModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(clientRepository.save(clientModel));
    }

    @GetMapping("/library/clients")
    public ResponseEntity<List<ClientModel>> getAllClients() {
        return ResponseEntity.status(HttpStatus.OK).body(clientRepository.findAll());
    }
    }
    
    


