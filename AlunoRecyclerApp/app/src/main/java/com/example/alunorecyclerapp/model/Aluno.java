package com.example.alunorecyclerapp.model;

public class Aluno {

    private String nome;
    private String grupo;

    public Aluno(String nome, String grupo) {
        this.nome = nome;
        this.grupo = grupo;
    }

    public Aluno() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}
