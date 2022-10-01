package com.fujioka.exercicio;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Neste programa, você irá digitar 10 números para verificar se eles são PARES ou IMPARES");

        for(int i = 1; i < 11; i++){
            System.out.println("Digite o " +i+ "º número para saber se é impar ou par.");
            num = scan.nextInt();
            if(num % 2 == 0){
                System.out.println("O "+i+"º número é par!");
            }else {
                System.out.println("O "+i+"º número é impar!");
            }

        }
    }
}