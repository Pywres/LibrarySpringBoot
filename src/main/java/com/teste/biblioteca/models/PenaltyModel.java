package com.teste.biblioteca.models;

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
@Table(name = "TB_PENALTY")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode

public class PenaltyModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idPenalty;

    @ManyToOne
    @JoinColumn(name = "ID_LOAN")
    private LoanModel loanModel;
    
    private String description;

}
