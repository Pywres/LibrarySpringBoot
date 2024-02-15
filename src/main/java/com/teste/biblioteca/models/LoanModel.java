package com.teste.biblioteca.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TB_LOANS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class LoanModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idLoan;

    @ManyToOne
    @JoinColumn(name = "ID_BOOKS")
    private BooksModel booksModel;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENT")
    private ClientModel clientModel;

    private String description; 

}
