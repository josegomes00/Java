package com.fujioka.exercicio;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeCliente;
        double diaria = 40.0;
        double mais10Dias = 8.0;
        double menosOu10Dias = 15.0;
        double contaCliente = 0.0;
        double totalPousada = 0.0;
        int qtdDias = 0;
        int clientes;
        int countClientes = 0;

        System.out.println("INFORME O NÚMERO DE CLIENTES PARA FAZER A CONTA: ");
        clientes = scan.nextInt();

        while (countClientes < clientes){
            System.out.println("INFORME O NOME DO CLIENTE: ");
            nomeCliente = scan.next();
            nomeCliente = nomeCliente.toUpperCase();

            System.out.println("INFORME A QUANTIDADE DE DIAS QUE O CLIENTE PASSOU NA POUSADA: ");
            qtdDias = scan.nextInt();

            if (qtdDias <= 10){
                contaCliente = (qtdDias * 40) + menosOu10Dias;
            }else {
                contaCliente = (qtdDias * 40) + mais10Dias;
            }

            totalPousada += contaCliente;

            System.out.println("O CLIENTE " + nomeCliente + " PASSOU " + qtdDias + " DIA(s)");
            System.out.printf("CONTA TOTAL CLIENTE = %.2f %n",contaCliente);

            countClientes++;

        }
        System.out.printf("TOTAL ARRECADADO DA POUSADA: %.2f %n", totalPousada);
    }
}
