package registrandovendas;

public class Main {
    public static void main(String[] args) {

        //– Criar um produto que não está em promoção
        //– Criar um vendedor
        //– Criar uma venda
        Produto p1 = new Produto("1212", "Utilitário", 150, 100, false);
        Vendedor v1 = new Vendedor("José", "2022111510027", "Av.Mato Grosso");
        Venda ve1 = new Venda();

        //– Setar o produto e o vendedor na venda
        //– Informar que a venda é referente a dois itens
        //– Calcular o valor da venda
        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda

        ve1.setProduto(p1);
        ve1.setVendedor(v1);
        ve1.setQtdItens(2);
        ve1.calcularValor();
        System.out.println("Valor da Comissão do Vendedor: R$" + ve1.calcularComissao());
        ve1.imprimeVenda();
        System.out.println();

        //– Criar um produto que está em promoção, com valor de custo = 80 e valor de venda = 100
        //– Criar outro vendedor
        //– Criar outra venda

        Produto p2 = new Produto("1213", "Utilitários", 100, 80, true);
        Vendedor v2 = new Vendedor("Clara", "2022111510027", "Av.Mato Grosso");
        Venda ve2 = new Venda();

        //- Setar o produto e o vendedor na venda
        //– Informar que a venda é referente a três itens
        //– Efetuar um desconto de 10%
        //– Calcular o valor da venda

        ve2.setProduto(p2);
        ve2.setVendedor(v2);
        ve2.setQtdItens(3);
        ve2.efetuarDesconto(10);
        ve2.calcularValor();

        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda
        System.out.println("Valor da Comissão do Vendedor: R$" + ve2.calcularComissao());
        ve2.imprimeVenda();
        System.out.println();

        //– Criar outra venda
        //– Setar o produto e o vendedor do slide anterior na nova venda
        //– Informar que a venda é referente a dois itens
        //– Efetuar um desconto de 30% (perceba que esse desconto vai fazer com que o produto seja vendido abaixo do preço de custo!!!!!)

        Venda ve3 = new Venda();
        ve3.setProduto(p2);
        ve3.setVendedor(v2);
        ve3.setQtdItens(2);
        ve3.efetuarDesconto(30);

        //– Calcular o valor da venda
        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda

        ve3.calcularValor();
        System.out.println("Valor da Comissão do Vendedor: R$" + ve3.calcularComissao());
        //O Valor do Produto vai ficar de 90 reais por conta do desconto aplocado na linha 43!!
        ve3.imprimeVenda();

    }
}
