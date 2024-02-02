package com.developer.crudspring.entities;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_avaliacao")
public class AvaliacaoFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Aluno aluno;
    private LocalDateTime dataAvaliacao = LocalDateTime.now();
    @Column(name = "Peso_Atual")
    private double peso;
    @Column(name = "Altura_Atual")
    private double altura;
}
