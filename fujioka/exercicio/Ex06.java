package com.fujioka.exercicio;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qntReprovados = 0;
        int qntExame = 0;
        int qntAprovados = 0;
        int qntAlunos = 0;
        double mediaClasse = 0.0;
        double nota1;
        double nota2;
        double mediaAluno;


        for (int i = 1; i<7; i++){
            System.out.println("DIGITE A 1ª NOTA DO ALUNO " + i);
            nota1 = scan.nextDouble();
            System.out.println("DIGITE A 2ª NOTA DO ALUNO " + i);
            nota2 = scan.nextDouble();
            mediaAluno = (nota1 + nota2)/2;
            mediaClasse += mediaAluno;
            qntAlunos += 1;

            if (mediaAluno >= 7 && mediaAluno <=10){
                System.out.printf("ALUNO " + i + " APROVADO COM MÉDIA " + "%.2f %n",mediaAluno);
                qntAprovados += 1;
            }else if (mediaAluno >=3 && mediaAluno < 7 ){
                System.out.printf("ALUNO " + i + " EM EXAME COM MÉDIA " + "%.2f %n",mediaAluno);
                qntExame += 1;
            } else if (mediaAluno < 3) {
                System.out.printf("ALUNO " + i + " REPROVADO COM MÉDIA " + "%.2f %n",mediaAluno);
                qntReprovados += 1;
            }


        }
        mediaClasse = mediaClasse / qntAlunos;
        System.out.println("ALUNOS APROVADOS: "+qntAprovados);
        System.out.println("ALUNOS EM EXAME: "+qntExame);
        System.out.println("ALUNOS REPROVADOS: "+qntReprovados);
        System.out.printf("MÉDIA DA CLASSE: %.2f %n",mediaClasse);
    }
}