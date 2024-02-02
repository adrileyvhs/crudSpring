package com.developer.crudspring.dto;
import jakarta.persistence.Column;
import java.time.LocalDate;
public class AlunoDto{
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataNascimento;
}
