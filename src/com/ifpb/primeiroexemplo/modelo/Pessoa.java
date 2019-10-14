package com.ifpb.primeiroexemplo.modelo;

import java.time.LocalDate;

public abstract class Pessoa {

    private long matricula;
    private String cpf;
    private String nome;
    private LocalDate nascimento;

    public Pessoa(long matricula, String cpf, String nome, LocalDate nascimento) {
        this.matricula = matricula;
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    //Método final não pode ser sobrescrito - não pode combinar com abstract
    public final long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    //Depois aprenderemos a fazer da maneira correta.
    public abstract void imprimirDados();

}
