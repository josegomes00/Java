package com.fujioka.exercicio;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome;
        double salario;
        double salarioReajustado;
        nome = "";


        while (!nome.equalsIgnoreCase("fim")){
            System.out.println("Digite o Nome do Funcionário:");
            nome = scan.next();

            if (nome.equalsIgnoreCase("fim")){
                break;
            }

            System.out.println("Digite o Salário do Funcionário:");
            salario = scan.nextDouble();

            if (salario < 500){
                salarioReajustado =  ((salario *20) / 100) + salario;
                System.out.println("Nome: "+nome+"\nSalario: "+salario+"\nSalario Reajustado: "+ salarioReajustado);
            }else {
                System.out.println("Nome: "+nome+"\nSalario: "+salario);
            }

        }
    }
}
