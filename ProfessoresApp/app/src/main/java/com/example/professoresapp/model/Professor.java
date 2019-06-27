package com.example.professoresapp.model;

public class Professor {

    private String nome;
    private String curso;

    public Professor(String nome, String curso) {
        this.nome = nome;
        this.curso = curso;
    }

    public Professor() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
