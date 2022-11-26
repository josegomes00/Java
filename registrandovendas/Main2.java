package registrandovendas;

import java.util.Scanner;

public class Main2 {

    public static void menu() {
        System.out.println("DIGITE [1] PARA CADASTRAR UM VENDEDOR");
        System.out.println("DIGITE [2] PARA REGISTRAR UMA VENDA");
        System.out.println("DIGITE [3] EXIBIR O RESUMO DE UMA VENDA\n");
        System.out.println("DIGITE [100] PARA FINALIZAR O PROGRAMA\n");
    }

    public static void cadastrarVendedor() {
        Scanner scanVendendor = new Scanner(System.in);
        String nome;
        String codigo;
        String endereco;

        System.out.println("Digite o Nome do Vendedor: ");
        nome = scanVendendor.nextLine();
        System.out.println();

        System.out.println("Digite o Código do Vendedor: ");
        codigo = scanVendendor.nextLine();
        System.out.println();

        System.out.println("Digite o Endereço do Vendedor: ");
        endereco = scanVendendor.nextLine();
        System.out.println();

        Vendedor v = new Vendedor(nome, codigo, endereco);
    }


    public static void registrarVenda() {
        Scanner scanVenda = new Scanner(System.in);
        String codigo;
        String descricao;
        int qtdItens;
        double desconto = 0;
        double valorVenda;
        double valorCusto;
        boolean promocao = false;
        String aux;

        System.out.println("Digite o Código do Produto: ");
        codigo = scanVenda.nextLine();
        System.out.println();

        System.out.println("Digite a Descrição do Produto: ");
        descricao = scanVenda.nextLine();
        System.out.println();

        System.out.println("Digite o Valor de Venda do Produto: ");
        valorVenda = scanVenda.nextDouble();

        System.out.println("Digite o Valor de Custo do Produto: ");
        valorCusto = scanVenda.nextDouble();

        System.out.println("O Produto está em Promoção? [S/N]");
        aux = scanVenda.next();
        if (aux.equalsIgnoreCase("S")) {
            desconto = valorVenda - ((valorVenda * 15) / 100);
            promocao = true;
        } else if (aux.equalsIgnoreCase("N")) {
            promocao = false;
        }
        System.out.println();

        System.out.println("Quantidade de Itens: ");
        qtdItens = scanVenda.nextInt();

        Produto p = new Produto(codigo, descricao, valorVenda, valorCusto, promocao);
        Venda ven = new Venda();

        //faltando setar vendedor
        ven.setProduto(p);
        ven.setQtdItens(qtdItens);
        ven.setValor(valorVenda);
        ven.setDesconto(desconto);

    }

    public static void exibirVenda() {

    }

    public static void main(String[] args) {
        int option;
        Scanner scan = new Scanner(System.in);

        do {
            menu();
            option = scan.nextInt();

            switch (option) {
                case 100:
                    System.out.println("Finalizando...");
                    break;

                case 1:
                    cadastrarVendedor();
                    break;

                case 2:
                    registrarVenda();
                    break;

                case 3:
                    exibirVenda();
                    break;

                default:
                    System.out.println("Opção Inválida.");
            }
        }while (option != 100);
    }
}
