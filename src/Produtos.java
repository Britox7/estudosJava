public class Produtos {
    private float precoCompra;
    private float precoVenda;
    private int estoque;
    private String nome;
    private String marca;

    public Produtos (float precoCompra, float precoVenda, int estoque, String nome, String marca){
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
        this.nome = nome;
        this.marca = marca;
    }

    public float getPrecoCompra() {
        return this.precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return this.precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void aumentarPrecoVenda(){
        setPrecoVenda(getPrecoCompra() * 1.10f);
    }

    public void comprar(){
        setEstoque(getEstoque() + 1);
    }

    public void vender(){
        setEstoque(getEstoque() - 1);
    }
}