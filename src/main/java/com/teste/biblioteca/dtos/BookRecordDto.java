package com.teste.biblioteca.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record BookRecordDto(@NotBlank String title, @NotBlank String category, @NotBlank String author, @NotNull boolean isAvailability, @NotNull int numberPages, @NotBlank String description) {

}
