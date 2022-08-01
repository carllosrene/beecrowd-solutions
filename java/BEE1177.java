/*
    BEECROWD 1177 | Preenchimento de Vetor II

    Faça um programa que leia um valor T e preencha um vetor N[1000]
    com a sequência de valores de 0 até T-1 repetidas vezes, 
    conforme exemplo abaixo. Imprima o vetor N.

    Entrada:
        A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

    Saída:
        Para cada posição do vetor, escreva "N[i] = x", 
        onde i é a posição do vetor e x é o valor armazenado naquela posição.

 */

import java.util.Scanner;

public class BEE1177 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N[] = new int[1000];
        int T, V;

        T = teclado.nextInt();
        V = 0;

        for(int i = 0; i < N.length; i++) {
            N[i] = V;
            V++;

            if(V == T) {
                V = 0;
            }

            System.out.println("N[" + i + "] = " + N[i]);
        }

        teclado.close();
    }
}
