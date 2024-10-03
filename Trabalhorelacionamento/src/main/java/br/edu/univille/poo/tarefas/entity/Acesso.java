package br.edu.univille.poo.tarefas.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Acesso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNivel;
    private String tipo;

    @OneToMany(mappedBy = "Acesso")
    private List<Compartilhamento> compartilhamentos;

}