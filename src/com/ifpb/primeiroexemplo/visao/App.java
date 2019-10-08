package com.ifpb.primeiroexemplo.visao;

import com.ifpb.primeiroexemplo.modelo.Aluno;

import java.time.LocalDate;
import java.time.Month;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(201822010002L, "João",
                "111.111.111-01",
                LocalDate.of(2000, Month.APRIL,01),
                "ADS");

        Aluno aluno1 = new Aluno();

        System.out.println("Matrícula: "+aluno.getMatricula());
        System.out.println("Matrícula: "+aluno1.getMatricula());

        System.out.println("Quantidade de alunos: "+Aluno.getContAluno());


//        Como ler os dados
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Escreva sua idade: ");
//        int idade = scanner.nextInt();
//        System.out.println("Idade: "+idade);

    }

}
