<h2>Sobre o projeto:</h2>
<p>
  Este projeto consiste na criação de uma classe, classe essa que vai simular a criação de qualquer produto que desejarmos, sendo ele carro, moto, celular e etc...
  Dentro desse projeto temos conceitos de encapsulamento, instanciamento, construtores, get e set.
</p>

https://github.com/Britox7/estudosJava/assets/101662003/0ac459a4-85c1-471a-beb1-c51786b32521

<h2>
  Explicação:
</h2>
<p>
  A primeira coisa vista dentro da classe são os seus atributos: precoCompra, precoVenda, estoque, nome e marca.
</p>
<div class="snippet-clipboard-content notranslate position-relative overflow-auto"><pre class="notranslate">
  <code>
  public class Produtos {
    private float precoCompra;
    private float precoVenda;
    private int estoque;
    private String nome;
    private String marca;
</code>
</div>
<p>
   Os mesmos estão privados com a utilização do Private, portanto só podemos acessar diretamente esses atributos estando dentro da própria classe. 
   Caso queiramos acessá-los em outra classe, devemos utilizar os métodos get e set. Falarei um pouco mais sobre esses métodos mais adiante. 
</p>

<h4>Construtor</h4>
<div class="snippet-clipboard-content notranslate position-relative overflow-auto"><pre class="notranslate">
  <code>
     public Produtos (float precoCompra, float precoVenda, int estoque, String nome, String marca){
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
        this.nome = nome;
        this.marca = marca;
      }
  </code>
</div> 
  <p>
    Esse é o método construtor da classe principal Produtos.
    Teremos como parámetro desse método construtor, as variáveis que serviram para guardar os valores quando tivermos o objeto instanciado na classe main.
    O método construtor servirá como um modelo para os objetos que iremos criar a partir dele, mas vale lembrar que pra criarmos um objeto ele tem que seguir
    o tipo declarado dentro do construtor.
  </p>
  <p>Variáveis: float precoCompra, float precoVenda, int estoque, String nome, String marca</p>

  <p>
    Agora teremos a criação dos métodos da classe. Incluindo os métodos get e set
  </p>

  <div class="snippet-clipboard-content notranslate position-relative overflow-auto"><pre class="notranslate">
    <code>
     public float getPrecoCompra() {
        return this.precoCompra;
    }
    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }
     </code>
  </div>

  <p>
    Esses métodos conhecidos como "getters e setters", fazem parte do conceito de encapsulamento, eles permitem acessar e modificar valores de uma classe privada.
    Temos o método getPrecoCompra(), ele irá acessar o valor atual do atribúto precoCompra, e o método setPrecoCompra() irá alterar o valor atual do método
    precoCompra
  </p>

  <p>
    Teremos o mesmo comportamento para os os métodos: getPrecoVenda, setPrecoVenda, getEstoque, setEstoque, getNome, setNome, getMarca e setMarca.
  </p>
  
  <p>
    Teremos agora os métodos aumentarPrecoVenda, comprar e vender. Eles iram realizar tarefas especificadas.
  </p>
  <p>
    aumentarPrecoVenda irá multiplicar o atributo precoComprar em 1.10 para termos no final o preço de venda
  </p>
  <p>
    comprar irá adicionar +1 item ao atributo estoque
  </p>  
  <p>
    vender irá subtrair -1 ao atributo estoque
  </p>

  </br>

  <h3>Classe de execução</h3>
  <p>Abaixo temos a classe de execução do programa, onde nela, seram mostrados as infomações atribuidas ao produto no nosso objeto instanciado</p>

  <div class="snippet-clipboard-content notranslate position-relative overflow-auto"><pre class="notranslate">
  <code>
     public class Main {
        public static void main(String[] args) {
          Produtos produto = new Produtos(1550.0f, 0, 15, "MotoG54", "Motorola");
            System.out.println("PRODUTO ANTES DO MÉTODO\n");
            detalhes(produto);
            produto.aumentarPrecoVenda();
            produto.comprar();
            produto.vender();
            System.out.println("PRODUTO DEPOIS DO MÉTODO\n");
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
  </code>
</div>
  
