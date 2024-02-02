package com.developer.crudspring.service;

import com.developer.crudspring.dto.AlunoDto;
import com.developer.crudspring.dto.MatriculaDto;
import com.developer.crudspring.entities.Aluno;
import com.developer.crudspring.entities.Matricula;

import java.util.List;

public interface MatriculaService {
    Matricula create(MatriculaDto matriculaDto );
    Matricula get(Long id);
    List<Matricula>getAll();
    void Delete(Long id);
    Aluno Update(Long id, AlunoDto alunoDto);
}
