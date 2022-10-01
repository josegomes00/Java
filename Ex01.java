package com.fujioka.exercicio;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int creditosGalacticos;
        int percentualAumento;

        float totalValor;

        System.out.println("Digite o valor dos créditos galácticos de um Star trooper:");
        creditosGalacticos = scan.nextInt();
        System.out.println("Digite o percentual de aumento(%):");
        percentualAumento = scan.nextInt();

        totalValor = ((creditosGalacticos * percentualAumento) / 100) + creditosGalacticos;

        System.out.println("O Valor com aumento é de " + totalValor);

    }

}
