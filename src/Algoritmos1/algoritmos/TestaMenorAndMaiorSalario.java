package Algoritmos1.algoritmos;

public class TestaMenorAndMaiorSalario {

    public static void main(String[] args) {

        double salario[] = new double[4];

        salario[0] = 3200.00;
        salario[1] = 6000.00;
        salario[2] = 5000.00;
        salario[3] = 2200.00;

        int menorSalario = 0;
        int maiorSalario = 0;

        for (int atual = 0; atual <= salario.length -1; atual++) {
            if (salario[atual] < salario[menorSalario]) {
                menorSalario = atual;
            }
            if (salario[atual] > salario[maiorSalario]) {
                maiorSalario = atual;
            }
        }
        System.out.println(menorSalario);
        System.out.println("O menor salário é: " + salario[menorSalario]);
        System.out.println(maiorSalario);
        System.out.println("O maior salário é: " + salario[maiorSalario]);
    }
}

