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
        for (int atual = 1; atual < qtdDeElementos; atual++) {
            int analise = atual;
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                troca(produtos, analise, analise - 1);
                analise--;
            }
        }

    }

    private static void troca(Produtos[] produtos, int primeiro, int segundo) {
        Produtos primeiroProduto = produtos[primeiro];
        Produtos segundoProduto = produtos[segundo];
        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }

    private static void selectionSort(Produtos[] produtos, int qtdDeElementos) {
        for (int atual = 0; atual < qtdDeElementos; atual++) {
            int menor = buscaMenor(produtos, atual, qtdDeElementos - 1);
            troca(produtos, atual, menor);
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

