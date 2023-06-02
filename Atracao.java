public class Atracao {

    protected String nome;
    protected Integer capacidade;
    protected Double preco;
    private static Double arrecadacao;

    public Atracao(String nome, Integer capacidade, Double preco) {
        setNome(nome);
        setCapacidade(capacidade);
        setPreco(preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(Integer capacidade) {
        this.capacidade = capacidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    /*"exibir_detalhes" que imprime as informações da atração,
    incluindo o nome, capacidade e os atributos específicos de cada atração .A classe atração terá um
    método chamado “arrecadacao_maxima”, que calcula o valor máximo que pode ser arrecadado com
    cada atração.*/
    public void exibirDetalhes(){
        System.out.println("Nome: " + getNome()
                            + "\nCapacidade: " + getCapacidade()
                            + "\nPreço: " + getPreco());

    }

    public static Double getArrecadacao() {
        return arrecadacao;
    }

    public void ArrecadacaoMaxima(){
        arrecadacao += capacidade * preco;
    }

}
