public class Main {
    public static void main(String[] args) {

        //– Criar um produto que não está em promoção
        //– Criar um vendedor
        //– Criar uma venda
        //– Setar o produto e o vendedor na venda
        //– Informar que a venda é referente a dois itens
        //– Calcular o valor da venda
        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda

        Produto produto01 = new Produto(1,"Produto teste",10.00,4.50,false);
        Vendedor vendedor01 = new Vendedor("Vendedor teste",1,"JoaoPessoa");
        Venda venda01 = new Venda();

        venda01.setProduto(produto01);
        venda01.setVendedor(vendedor01);
        venda01.setQuantidadeItens(2);
        venda01.caucularValor();
        venda01.caucularComissao();
        System.out.println("Comissao do vendedor: " +venda01.getVendedor().getComissao() + "%");
        venda01.imprimir();

        System.out.println();
        System.out.println();

        //(Continuação...) O método main deve:
        //– Criar um produto que está em promoção, com valor
        //de custo = 80 e valor de venda = 100
        //– Criar outro vendedor
        //– Criar outra venda
        //– Setar o produto e o vendedor na venda
        //– Informar que a venda é referente a três itens
        //– Efetuar um desconto de 10%
        //– Calcular o valor da venda
        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda

        Produto produto02 = new Produto(2,"Produto02",100.00,80.00,true);
        Vendedor vendedor02 = new Vendedor("Vendedor02",2,"JoaoPessoa");
        Venda venda02 = new Venda();
        venda02.setProduto(produto02);
        venda02.setVendedor(vendedor02);
        venda02.setQuantidadeItens(3);
        venda02.setDesconto(10);
        venda02.efetuarDesconto(venda02.getDesconto());
        venda02.caucularValor();
        System.out.println("Comissao do " + vendedor02.getNome() +": "+ venda02.getVendedor().getComissao() + "%");
        venda02.imprimir();

        //(Continuação...) O método main deve:
        //– Criar outra venda
        //– Setar o produto e o vendedor do slide anterior na nova venda
        //– Informar que a venda é referente a dois itens
        //– Efetuar um desconto de 30% (perceba que esse desconto vai fazer com que o produto seja vendido
        //abaixo do preço de custo!!!!!)
        //– Calcular o valor da venda
        //– Imprimir o valor da comissão do vendedor
        //– Imprimir a venda

        System.out.println();
        System.out.println();


        Venda venda03 = new Venda();
        venda03.setVendedor(vendedor02);
        venda03.setProduto(produto02);
        venda03.setQuantidadeItens(2);
        venda03.setDesconto(30);
        venda03.efetuarDesconto(venda03.getDesconto());
        venda03.caucularValor();
        System.out.println("Comissao do " + vendedor02.getNome() +": "+ venda03.getVendedor().getComissao());
        venda03.imprimir();
    }
}