package com.ifpb.primeiroexemplo.visao;

import com.ifpb.primeiroexemplo.modelo.Aluno;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva a matrícula: ");
        long matricula = scanner.nextLong();

        System.out.println("Escreva o nome: ");
        String nome = scanner.next();

        System.out.println("Escreva o CPF: ");
        String cpf = scanner.next();

        System.out.println("Escreva a data de nascimento: ");
        String nascimentoString = scanner.next();

        System.out.println("Escreva o curso: ");
        String curso = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate nascimento = LocalDate.parse(nascimentoString, formatter);

        Aluno aluno = new Aluno(matricula, nome, cpf, nascimento, curso);

        System.out.println("--- Informações do aluno ---");
        System.out.println("CPF: "+aluno.getCpf());
        System.out.println("Matrícula: "+aluno.getMatricula());
        System.out.println("Nome: "+aluno.getNome());
        System.out.println("Nascimento: "+formatter.format(aluno.getNascimento()));
        System.out.println("Curso: "+aluno.getCurso());

    }

}