/*
    BEECROWD 1184 | Abaixo da Diagonal Principal

    Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão abaixo da diagonal principal da matriz, conforme ilustrado abaixo (área verde).

    Entrada:
        A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

    Saída:
        Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
    
        
    ** Obs: para visualizar a imagem descrita no problema, acessar o link: https://www.beecrowd.com.br/judge/pt/problems/view/1184 **

 */

import java.util.Scanner;

public class BEE1184 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float matriz[][] = new float[12][12];
        char O = teclado.nextLine().charAt(0);

        for(int l = 0; l < 12; l++) {
            for(int c = 0; c < 12; c++) {
                matriz[l][c] = teclado.nextFloat();
            }
        }

        float res = 0;
        for(int l = 1; l < 12; l++) {
            for(int c = 0; c < l; c++) {
                res += matriz[l][c];
            }
        }

        if(O == 'S') {
            System.out.printf("%.1f\n", res);
        } else {
            System.out.printf("%.1f\n", res = res / ((144 - 12) / 2));
        }

        teclado.close();
    }
}
