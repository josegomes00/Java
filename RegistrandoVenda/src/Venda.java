import javax.swing.plaf.TreeUI;

public class Venda {


    private Vendedor vendedor;
    private double desconto;
    private int quantidadeItens;
    private double valor;
    private Produto produto ;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public void efetuarDesconto(double desconto) {
        this.desconto += (produto.getValorVenda() * desconto) /100;


        if ((this.produto.getValorVenda() - this.desconto) < produto.getValorCusto()){
            System.out.println("Desconto não aplicado pois o valor do desconto torna o preço do produto abaixo do valor de custo do produto.");
        }else{
            this.produto.setValorVenda(this.produto.getValorVenda()- this.desconto);
            System.out.println("O valor da vendo com o desconto fica: " + produto.getValorVenda());
        }
    }

    public void caucularValor(){
        valor += (produto.getValorVenda() - desconto) * quantidadeItens;
    }


    public void caucularComissao(){
        if (this.produto.isPromocao() == true) {
            vendedor.setComissao( (produto.getValorVenda() * (vendedor.getComissao()/100) )/2 );
        }else {
            vendedor.setComissao(produto.getValorVenda() * (vendedor.getComissao()/100) );
        }
    }

    public void imprimir(){
        System.out.println("Vendedor : " + " nome: "+ vendedor.getNome() + " codigo: " + vendedor.getCodigo() + " comissão: " + vendedor.getComissao());
        System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
        System.out.println("Produto: " + " codigo: " + produto.getCodigo() + " descrição: " + produto.getDescricao());
        System.out.println("Valor da venda do produto: " + produto.getValorVenda());
        System.out.println("Produto com promoção: " + produto.isPromocao());
        System.out.println("Valor de desconto sobre o produto: " + desconto);
        System.out.println("Valor total da venda: " + valor);
    }


}
