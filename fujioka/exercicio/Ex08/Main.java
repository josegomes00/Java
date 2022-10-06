package com.fujioka.exercicio.Ex08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome = "";
        String sexo;
        String nomeMenorMulher = "";
        String nomePacienteMaisVelho = "";

        double peso;
        double altura;
        double menorAlturaMulher = 0;

        int idade;
        int qtdPaciente = 0;
        int mediaIdadeHomens = 0;
        int qtdHomens = 0;
        int qtdMulheres = 0;
        int qtdMulheresEspecial = 0;
        int qtdPessoasEspecial = 0;
        int maiorIdade = 0;

        ArrayList<Double> listaAlturaMulheres = new ArrayList<Double>();
        ArrayList<String> listaNomeMulheres = new ArrayList<String>();
        ArrayList<String> listaBaixinhasRepetidas = new ArrayList<String>();
        ArrayList<String> listaVelhosRepetidos = new ArrayList<String>();

         while (!nome.equalsIgnoreCase("fim")){
             System.out.println("DIGITE O NOME DO "+(qtdPaciente + 1)+"º PACIENTE");
             nome = scan.next();
             nome = nome.toUpperCase();

             if (nome.equalsIgnoreCase("fim")){
                 break;
             }

             System.out.println("DIGITE O SEXO (M ou F) DO "+(qtdPaciente + 1)+"º PACIENTE");
             sexo = scan.next();
             sexo = sexo.toUpperCase();

             while (!sexo.equalsIgnoreCase("M") || !sexo.equalsIgnoreCase("F")){
                 if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")){
                     break;
                 }else {
                     System.out.println("SEXO INVÁLIDO, TENTE NOVAMENTE (M ou F):");
                     sexo = scan.next();
                     sexo = sexo.toUpperCase();
                 }
             }

             System.out.println("DIGITE A IDADE DO "+(qtdPaciente + 1)+"º PACIENTE");
             idade = scan.nextInt();

             System.out.println("DIGITE O PESO DO "+(qtdPaciente + 1)+"º PACIENTE(KG)");
             peso = scan.nextDouble();

             System.out.println("DIGITE A ALTURA DO "+(qtdPaciente + 1)+"º PACIENTE (METROS)");
             altura = scan.nextDouble();

             Ex08Class P = new Ex08Class(nome,sexo,idade,peso,altura);

             //System.out.println("");
             System.out.println("NOME DO "+ (qtdPaciente + 1) + "º PACIENTE: " + P.getNome());
             System.out.println("SEXO DO "+ (qtdPaciente + 1) + "º PACIENTE: " + P.getSexo());
             System.out.println("IDADE DO "+ (qtdPaciente + 1) + "º PACIENTE: " + P.getIdade() + " anos");
             System.out.println("PESO DO "+ (qtdPaciente + 1) + "º PACIENTE: " + P.getPeso() + "kg");
             System.out.println("ALTURA DO "+ (qtdPaciente + 1) + "º PACIENTE: " + P.getAltura() + "m");
             //System.out.println("");

             //COLETANDO QTD PACIENTES
             qtdPaciente++;

             //COLETANDO MEDIA IDADE HOMENS
             if(P.getSexo().equalsIgnoreCase("M")){
                 mediaIdadeHomens += P.getIdade();
                 qtdHomens++;
             }
             //OPERANDO COM MULHERES
             else if (P.getSexo().equalsIgnoreCase("F")) {
                 qtdMulheres++;
                 //COLETANDO MULHER MAIS BAIXA
                 listaAlturaMulheres.add(P.getAltura());
                 listaNomeMulheres.add(P.getNome());
                 menorAlturaMulher = Collections.min(listaAlturaMulheres);

                 for (int i = 0; i < qtdMulheres; i++){
                     if (menorAlturaMulher == listaAlturaMulheres.get(i)){
                         nomeMenorMulher = listaNomeMulheres.get(i);
                     }
                 }

                 //COLETANDO QTD MULHERES COM ALTURA ENTRE 1,60 E 1,70 E PESO ACIMA DE 70kg
                 if (P.getAltura() >= 1.60 && P.getAltura() <= 1.70 && P.getPeso() > 70){
                     qtdMulheresEspecial++;
                 }
             }

             //COLETANDO QTD DE PESSOAS COM IDADE ENTRE 18 E 25 ANOS
             if (P.getIdade() >= 18 && P.getIdade() <=25){
                 qtdPessoasEspecial++;
             }

             //COLETANDO NOME PACIENTE MAIS VELHO
             for(int i = 0; i < qtdPaciente; i++){
                 if(maiorIdade <= P.getIdade()){
                     if (P.getIdade() >= maiorIdade){
                         maiorIdade = P.getIdade();
                         nomePacienteMaisVelho = P.getNome();
                     }
                 }
             }
         }
         if (qtdPaciente == 0){
             System.out.println("NÃO EXISTEM PACIENTES NO CONSULTÓRIO");
         }else {
             //QTD PACIENTES//
             System.out.println("QUANTIDADE DE PACIENTES = " + qtdPaciente);

             //MEDIA IDADE HOMENS//
             if (qtdHomens == 0){
                 System.out.println("NÃO EXISTEM HOMENS NA SALA");
             }else {
                 mediaIdadeHomens = mediaIdadeHomens/qtdHomens;
                 System.out.println("MEDIA IDADE DOS HOMENS = " + mediaIdadeHomens);
             }

             //QTD MULHERES COM ALTURA ENTRE 1,60 E 1,70 E PESO ACIMA DE 70kg//
             if (qtdMulheres == 0){
                 System.out.println("NÃO EXISTEM MULHERES NA SALA");
             }else {
                 System.out.println("QTD MULHERES COM ALTURA ENTRE 1,60 E 1,70 E PESO ACIMA DE 70kg = " + qtdMulheresEspecial);
             }

             //PESSOAS COM IDADE ENTRE 18 E 25 ANOS//
             System.out.println("PESSOAS COM IDADE ENTRE 18 E 25 ANOS = " + qtdPessoasEspecial);

             //PACIENTE MAIS VELHO//
             System.out.println("NOME PACIENTE MAIS VELHO = " + nomePacienteMaisVelho);

             //MULHER MAIS BAIXA//
             if (qtdMulheres == 0){
                 System.out.println("NÃO EXISTEM MULHERES NA SALA");
             }else {
                 System.out.println("MULHER MAIS BAIXA = " + nomeMenorMulher);
             }
         }
    }
}
