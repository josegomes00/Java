package com.fujioka.exercicio;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario;
        double prestacao;
        double porcentagem;

        while (true){
            System.out.println("Digite o Valor do Salário:");
            salario = scan.nextDouble();

            System.out.println("Digite o Valor da Prestação:");
            prestacao = scan.nextDouble();

            porcentagem = (salario * 30)/100;

            if (prestacao > porcentagem){
                System.out.println("Empréstimo Recusado");
            }else {
                System.out.println("Empréstimo Aceito");
            }
        }
    }
}
