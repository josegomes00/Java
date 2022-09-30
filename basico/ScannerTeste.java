package com.loiane.basicoJava;

import sun.security.krb5.internal.crypto.EType;

import java.util.Scanner;

public class ScannerTeste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qualquer coisa:");
        String algumaCoisa = scan.nextLine();

        System.out.println("Você digitou: " + algumaCoisa);

        System.out.println("Digite seu nome:");
        String nome = scan.next();

        System.out.println("Digite sua idade:");
        int idade = scan.nextInt();

        System.out.println("Digite a sua altura:");
        double altura = scan.nextDouble();

        System.out.println("Seu nome é " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Mede " + altura + " metros");


    }

}
