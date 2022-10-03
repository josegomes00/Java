package com.fujioka.exercicio;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int refri = 3;
        double qtdGasolina;
        double litroGasolina = 2.5;
        double total;

        System.out.println("Digite a qtd de litros de gasolina que foi necessário para abastecer o carro:");
        qtdGasolina = scan.nextDouble();

        total = (qtdGasolina*litroGasolina) + 2*refri;
        System.out.println("TOTAL CONTA:");
        System.out.println("2x Refri = " + 2*refri);
        System.out.printf(qtdGasolina + " litros de Gasolina = " + "%.2f %n",qtdGasolina*litroGasolina);
        System.out.println("TOTAL = " + total);

    }
}
