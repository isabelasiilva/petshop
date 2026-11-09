package com.elastech_springboot.petshop.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet {
    private String nome;
    private String especie;
    private int idade;

    public Pet(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }
}
