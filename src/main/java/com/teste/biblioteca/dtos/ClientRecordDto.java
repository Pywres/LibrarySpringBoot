package com.teste.biblioteca.dtos;

import jakarta.validation.constraints.NotBlank;

public record ClientRecordDto(@NotBlank String name,@NotBlank String dateBirth, @NotBlank String cpf, @NotBlank String address, @NotBlank String phoneNumber) {

}
