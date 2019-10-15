package com.ifpb.primeiroexemplo.visao;

import com.ifpb.primeiroexemplo.modelo.Aluno;
import com.ifpb.primeiroexemplo.modelo.Pessoa;
import com.ifpb.primeiroexemplo.modelo.Professor;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Pessoa professor = new Professor(1234L, "111.111.111-01", "João",
                LocalDate.now(), 2000, "Mestrado");

        Pessoa aluno = new Aluno(4321L, "222.222.222-02", "Maria",
                LocalDate.now(), "ADS");

        professor.imprimirDados();
        aluno.imprimirDados();



    }

}