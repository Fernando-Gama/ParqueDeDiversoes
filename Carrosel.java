public class Carrosel extends Atracao{
    private Integer idadeMinima;

    public Carrosel(String nome, Integer capacidade, Double preco, Integer idadeMinima) {
        super(nome, capacidade, preco);
        setIdadeMinima(idadeMinima);
    }

    public Integer getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(Integer idadeMinima) {
        this.idadeMinima = idadeMinima;
    }
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Idade minima: ");
    }
}
