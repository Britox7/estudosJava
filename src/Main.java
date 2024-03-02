public class Main {
    public static void main(String[] args) {
        Produtos produto = new Produtos(1550.0f, 2000.0f, 15, "MotoG54", "Motorola");

        System.out.println("Produto antes do método\n");
        detalhes(produto);

        produto.aumentarPrecoVenda();
        produto.comprar();
        produto.vender();

        System.out.println("Produto depois do método\n");
        detalhes(produto);

    }

    private static void detalhes (Produtos produto) {
        System.out.println("Marca: " + produto.getMarca());
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço de Compra: " + produto.getPrecoCompra());
        System.out.println("Preço de Venda: " + produto.getPrecoVenda());
        System.out.println("Produtos no estoque: " + produto.getEstoque());
        System.out.println("--------------");
    }
}
