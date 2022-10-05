package com.fujioka.exercicio.Ex08;

import com.testes.Ex08Class;

public class Main {
    public static void main(String[] args) {
        Ex08Class P1 = new Ex08Class("Lucas","M",18,80,1.66);
        Ex08Class P2 = new Ex08Class("Maria","F",18,55.30,1.60);
        Ex08Class P3 = new Ex08Class("Jose","M",50,94.96,1.65);
        String[] nomePacientes = {P1.getNome(),P2.getNome(),P3.getNome()};
        String[] sexoPacientes = {P1.getSexo(),P2.getSexo(),P3.getSexo()};
        int[] idadePacientes = {P1.getIdade(), P2.getIdade(), P3.getIdade()};
        double[] pesoPacientes = {P1.getPeso(), P2.getPeso(),P3.getPeso()};
        double[] alturaPacientes = {P1.getAltura(), P2.getAltura(),P3.getAltura()};
        

        //M = MASCULINO
        //F = FEMININO

        System.out.println("Existem "+ nomePacientes.length + " pacientes na clinica");

//MEDIA IDADE HOMENS NA SALA
        int somaIdade = 0;
        int qtdHomens= 0;
        for(int i = 0; i < nomePacientes.length; i++){
            if (sexo[i] == "M") {
                somaIdade += idadeM[i];
                qtdHomens +=1;
            }
        }if (qtdHomens > 0){
            int meidaIdadeM = somaIdade / qtdHomens;
            System.out.println("A média de idade dos homens é: "+ meidaIdadeM);
        } else {
            System.out.println("Não existem homens na sala");
        }
//FIM

        
//qnt mulheres > 1.60 and < 1.70
        
        int qtdALturaPeso = 0;
        int qtdMulheres = 0;
        for(int i = 0; i < sexoPacientes.length; i++){
            if (sexo[i] == "F") {
                if (alturaPacientes[i] > 1.60 && alturaPacientes[i] < 1.70 && pesoPacientes[i] > 70) {
                    qtdALturaPeso += 1;
                }
                qtdMulheres += 1;
            }
        }if (qtdMulheres > 0){
            System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70Kg é: " + qtdALturaPeso);
        }else {
            System.out.println("NÃO EXISTEM MULHERES NA SALA");
        }
        
//FIM

        
//PESSOAS COM IDADE >= 18 and <= 25
        
        
        int qtdIdade = 0;
        for(int i = 0; i < idadePacientes.length;i++){
            if(idadePacientes[i] >= 18 && idadePacientes[i] <= 25){
                qtdIdade += 1;
            }

        }
        System.out.println("A quantidade de pessoas com idade entre 18 e 25 anos é: " + qtdIdade);
        
        
//FIM
        
//PACIENTE COM IDADE MAIS AVANÇADA       

        int maiorIdade = 0;
        String nomeMaiorIdade = "";

        for(int i = 0; i < idadePacientes.length; i++) {

            if (maiorIdade < idadePacientes[i]) {

                maiorIdade = idadePacientes[i];
                nomeMaiorIdade = nomePacientes[i];

            }
        }

        System.out.println("O paciente com a idade mais avançada é: " + nomeMaiorIdade);
        
        
//FIM
        
//MULHER COM MENOR ALTURA        

        if (qtdMulheres > 0){
           
            double menorAltura = alturaPacientes[0];
            String nomeMenorAltura = "";

            for(int i = 0; i< alturaPacientes.length; i++){

                if(sexoPacientes[i] == "F"){

                    if(menorAltura > alturaPacientes[i]){
                        menorAltura = alturaPacientes[i];
                        nomeMenorAltura = nomePacientes[i];

                    }
                }
            }

            System.out.println("O nome da mulher com a menor altura é:" + nomeMenorAltura);

        }


    }
    
//FIM    
}
