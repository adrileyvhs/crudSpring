package com.developer.crudspring.controller;

import com.developer.crudspring.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunoes")
public class AlunoController {
    @Autowired
    private AlunoService alunoService;
}
