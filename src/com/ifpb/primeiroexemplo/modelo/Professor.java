package com.ifpb.primeiroexemplo.modelo;

import java.time.LocalDate;

public class Professor extends Pessoa {

    private float salario;
    private String titulacao;

    public Professor(long matricula, String cpf, String nome,
                     LocalDate nascimento, float salario, String titulacao){
        super(matricula, cpf, nome, nascimento);
        this.salario = salario;
        this.titulacao = titulacao;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public void imprimirDados(){
        System.out.println("--- DADOS DO PROFESSOR ---");
        System.out.println("Matrícula: "+getMatricula());
        System.out.println("CPF: "+getCpf());
        System.out.println("Nome: "+getNome());
        System.out.println("Nascimento: "+getNascimento());
        System.out.println("Salário: "+salario);
        System.out.println("Titulação: "+titulacao);
    }

}
