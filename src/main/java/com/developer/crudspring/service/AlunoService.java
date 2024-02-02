package com.developer.crudspring.service;
import com.developer.crudspring.dto.AlunoDto;
import com.developer.crudspring.entities.Aluno;
import java.util.List;
public interface AlunoService {
    Aluno create(AlunoDto alunoDto );
    Aluno get(Long id);
    List<Aluno>getAll();
    void Delete(Long id);
    Aluno Update(Long id, AlunoDto alunoDto);
}
