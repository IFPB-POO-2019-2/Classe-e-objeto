package com.ifpb.primeiroexemplo.modelo;

import java.time.LocalDate;

public class Aluno {

    /*
    Atributos - o que a classe tem
     */
    private long matricula;
    private String nome;
    // Costante - final
    private final String cpf;
    private LocalDate nascimento;
    private String curso;
    // atributo estático - pertence à classe
    private static int contAluno;

    /*
    Construtor - cria os objetos - inicializa os atributos
     */
    public Aluno(long matricula, String nome, String cpf,
                 LocalDate nascimento, String curso){

        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.curso = curso;
        contAluno++;

    }

    // Sobrecarga de operador - overload
    public Aluno(){
        cpf = null;
        contAluno++;
    }

    // Getter - retorna o valor do atributo
    public long getMatricula(){
        return matricula;
    }

    // Setter - altera o valor do atributo
    public void setMatricula(long matricula){
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Método estático - pertence à classe
    public static int getContAluno(){
        return contAluno;
    }

}