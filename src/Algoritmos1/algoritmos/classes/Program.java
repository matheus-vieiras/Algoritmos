package Algoritmos1.algoritmos.classes;

public class Program {

    public static void main(String[] args) {

        Produtos[] produtos = {
                new Produtos("Lamborghini", 1000000),
                new Produtos("Jipe", 46000),
                new Produtos("Brasília", 16000),
                new Produtos("Smart", 46000),
                new Produtos("Fusca", 17000)

        };

        int maisBarato = buscaMenor(produtos, 0, 4);
        int maisCaro = buscaMaior(produtos, 0, 4);

        System.out.println(maisBarato);
        System.out.println("O carro " + produtos[maisBarato].getNome()
                + " é o mais BARATO e custa " +
                produtos[maisBarato].getPreco());
        System.out.println(maisCaro);
        System.out.println("O carro " + produtos[maisCaro].getNome()
                + " é o mais CARO e custa " +
                produtos[maisCaro].getPreco());

    }

    private static int buscaMenor(Produtos[] produtos, int inicio, int termino) {
        int maisBarato = inicio;
        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    private static int buscaMaior(Produtos[] produtos, int inicio, int termino) {
        int maisCaro = inicio;
        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() > produtos[maisCaro].getPreco()) {
                maisCaro = atual;
            }
        }
        return maisCaro;
    }


}
