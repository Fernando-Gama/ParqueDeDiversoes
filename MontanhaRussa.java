public class MontanhaRussa extends Atracao {
    private Double alturaMinima;

    public MontanhaRussa(String nome, Integer capacidade, Double preco, Double alturaMinima) {
        super(nome, capacidade, preco);
        setAlturaMinima(alturaMinima);
    }

    public Double getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(Double alturaMinima) {
        this.alturaMinima = alturaMinima;
    }
    @Override
    public  void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Altura minima: " + getAlturaMinima());
    }
}
