import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        List <Atracao> atracoesParque = new ArrayList<>();
        System.out.println("Digite quantas atrações tem no parque de diversão");
        int quantAtracoes = input.nextInt();
        input.nextLine();

        String nome;
        Integer capacidade;
        Double preco;
        String tipoAtracao;
        Integer idadeMinima;
        Double alturaMinima;
        int verdade = 0;

        for(int i = 0; i < quantAtracoes; i++){
            verdade = 0;

            System.out.println("Digite o nome: ");
            nome = input.nextLine();

            System.out.println("Digite a capacidade");
            capacidade = input.nextInt();

            System.out.println("Digite o preco: ");
            preco = input.nextDouble();
            input.nextLine();
            do{
                System.out.println("Digite se é um carrossel ou Montanha Russa: C/M");
                tipoAtracao = input.nextLine();

                if(tipoAtracao.toUpperCase().charAt(0) == 'C'){
                    System.out.println("Digite a idade");
                    idadeMinima = input.nextInt();
                    atracoesParque.add(new Carrosel(nome, capacidade, preco, idadeMinima));
                    verdade = 1;
                }

                else if(tipoAtracao.toUpperCase().charAt(0) == 'M') {
                    System.out.println("Digite a altura minima");
                    alturaMinima = input.nextDouble();
                    atracoesParque.add(new MontanhaRussa(nome, capacidade, preco, alturaMinima));
                    verdade = 1;
                }

            }while (verdade == 0);
            atracoesParque.get(i).ArrecadacaoMaxima();

        }
        System.out.println(Atracao.getArrecadacao());
    }
}