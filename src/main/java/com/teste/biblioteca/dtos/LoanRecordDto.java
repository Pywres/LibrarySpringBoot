package com.teste.biblioteca.dtos;

import com.teste.biblioteca.models.BooksModel;
import com.teste.biblioteca.models.ClientModel;

import jakarta.validation.constraints.NotNull;

public record LoanRecordDto(@NotNull BooksModel booksModel,@NotNull ClientModel clientModel, String description) {

}
