package com.developer.crudspring.service;

import com.developer.crudspring.dto.AlunoDto;
import com.developer.crudspring.dto.AvaliacaoFisicaDto;
import com.developer.crudspring.entities.Aluno;
import com.developer.crudspring.entities.AvaliacaoFisica;

import java.util.List;

public interface AvaliacaoFisciaService {
    AvaliacaoFisica create(AvaliacaoFisicaDto avaliacaoFisicaDto );
    AvaliacaoFisica get(Long id);
    List<AvaliacaoFisica>getAll();
    void Delete(Long id);
    AvaliacaoFisica Update(Long id, AvaliacaoFisicaDto avaliacaoFisicaDto);
}
