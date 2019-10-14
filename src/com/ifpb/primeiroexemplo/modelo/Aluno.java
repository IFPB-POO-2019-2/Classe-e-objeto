package com.ifpb.primeiroexemplo.modelo;

import java.time.LocalDate;

public class Aluno extends Pessoa {

    //Atributos - o que a classe tem
    private String curso;

    //Construtor - cria os objetos - inicializa os atributos
    public Aluno(long matricula, String nome, String cpf,
                 LocalDate nascimento, String curso){

        super(matricula, cpf, nome, nascimento);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void imprimirDados(){
        System.out.println("---- DADOS DO ALUNO ----");
        System.out.println("Matrícula: "+getMatricula());
        System.out.println("Nome: "+getNome());
        System.out.println("CPF:" +getCpf());
        System.out.println("Nascimento: "+getNascimento());
        System.out.println("Curso: "+curso);
    }

}