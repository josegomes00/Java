package com.fujioka.exercicio.Ex08;

import com.testes.Ex08Class;

public class Main {
    public static void main(String[] args) {
        Ex08Class P1 = new Ex08Class("Lucas","M",18,80,1.66);
        Ex08Class P2 = new Ex08Class("Maria","F",18,55.30,1.60);
        Ex08Class P3 = new Ex08Class("Jose","M",50,94.96,1.65);

        //M = MASCULINO
        //F = FEMININO


        String[] nome = {P1.getNome(),P2.getNome(),P3.getNome()};
        System.out.println("Existem "+ nome.length + " pacientes na clinica");

        String[] sexo = {P1.getSexo(),P2.getSexo(),P3.getSexo()};
        int[] idadeM = {P1.getIdade(), P2.getIdade(), P3.getIdade()};
        int somaIdade = 0;
        int qtdHomens= 0;
        for(int i = 0; i < nome.length; i++){
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




        double[] qtdMulherAltura = {P1.getAltura(), P2.getAltura(),P3.getAltura()};
        double[] qtdMulherPeso = {P1.getPeso(), P2.getPeso(),P3.getPeso()};
        int qtdALturaPeso = 0;
        int qtdMulheres = 0;
        for(int i = 0; i < sexo.length; i++){
            if (sexo[i] == "F") {
                if (qtdMulherAltura[i] > 1.60 && qtdMulherAltura[i] < 1.70 && qtdMulherPeso[i] > 70) {
                    qtdALturaPeso += 1;
                }
                qtdMulheres += 1;
            }
        }if (qtdMulheres > 0){
            System.out.println("A quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70Kg é: " + qtdALturaPeso);
        }else {
            System.out.println("NÃO EXISTEM MULHERES NA SALA");
        }

        int[] idades = {P1.getIdade(),P2.getIdade(),P3.getIdade()};
        int qtdIdade = 0;
        for(int i = 0; i < idades.length;i++){
            if(idades[i] >= 18 && idades[i] <= 25){
                qtdIdade += 1;
            }

        }
        System.out.println("A quantidade de pessoas com idade entre 18 e 25 anos é: " + qtdIdade);

        int idadesEspecial[] = {P1.getIdade(),P2.getIdade(),P3.getIdade()};
        String[] nomesEspecial = {P1.getNome(),P2.getNome(),P3.getNome()};

        int maiorIdade = 0;
        String nomeMaiorIdade = "";

        for(int i = 0; i < idadesEspecial.length; i++) {

            if (maiorIdade < idadesEspecial[i]) {

                maiorIdade = idadesEspecial[i];
                nomeMaiorIdade = nomesEspecial[i];

            }
        }

        System.out.println("O paciente com a idade mais avançada é: " + nomeMaiorIdade);

        if (qtdMulheres > 0){
            double[] qtdMulherAlturaSpecial = {P1.getAltura(),P2.getAltura(),P3.getAltura()};
            String[] sexoPacientes = {P1.getSexo(), P2.getSexo(), P3.getSexo()};
            String[] nomesPacientes = {P1.getNome(), P2.getNome(), P3.getNome()};


            double menorAltura = P1.getAltura();
            String nomeMenorAltura = "";

            for(int i = 0; i< qtdMulherAlturaSpecial.length; i++){

                if(sexoPacientes[i] == "F"){

                    if(menorAltura > qtdMulherAlturaSpecial[i]){
                        menorAltura = qtdMulherAlturaSpecial[i];
                        nomeMenorAltura = nomesPacientes[i];

                    }
                }
            }

            System.out.println("O nome da mulher com a menor altura é:" + nomeMenorAltura);

        }


    }
}
