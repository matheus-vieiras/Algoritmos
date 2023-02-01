package Algoritmos1.algoritmos.classes;

public class TestaOrdenacao {
    public static void main(String[] args) {

        Produtos[] produtos = {
                new Produtos("Lamborghini", 1000000),
                new Produtos("Jipe", 46000),
                new Produtos("Brasília", 16000),
                new Produtos("Smart", 46000),
                new Produtos("Fusca", 17000)
        };

//        selectionSort(produtos, produtos.length);
        novoSort(produtos, produtos.length);

        for (Produtos produto : produtos) {
            System.out.println(produto.getNome() + " custa " + produto.getPreco());
        }
    }

    private static void novoSort(Produtos[] produtos, int qtdDeElementos) {
        for (int atual = 0; atual < qtdDeElementos; atual++) {
            int analise = atual;
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                Produtos produtoAnalise = produtos[analise];
                Produtos produtoAnaliseMenos1 = produtos[analise - 1];
                produtos[analise] = produtoAnaliseMenos1;
                produtos[analise -1] = produtoAnalise;
                analise--;
            }
        }

    }

    private static void selectionSort(Produtos[] produtos, int qtdDeElementos) {
        for (int atual = 0; atual < qtdDeElementos; atual++) {
            int menor = buscaMenor(produtos, atual, qtdDeElementos - 1);
            Produtos produtoAtual = produtos[atual];
            Produtos produtoMenor = produtos[menor];
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }
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


}

