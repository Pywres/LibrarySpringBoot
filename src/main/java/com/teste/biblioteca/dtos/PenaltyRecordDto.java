package com.teste.biblioteca.dtos;

import com.teste.biblioteca.models.LoanModel;

import jakarta.validation.constraints.NotNull;

public record PenaltyRecordDto(@NotNull LoanModel loanModel, String description) {

}
