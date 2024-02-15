package com.teste.biblioteca.models;

import java.io.Serializable;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "TB_BOOKS")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class BooksModel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idBooks;
    private String title;
    private String category;
    private String author;
    private boolean isAvailability;
    private int numberPages;
    private String description;

}
