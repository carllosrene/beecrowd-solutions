/*
    BEECROWD 1181 | Linha na Matriz

    Neste problema você deve ler um número, indicando uma linha da matriz na qual uma operação deve ser realizada, um caractere maiúsculo, indicando a operação que será realizada, e todos os elementos de uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média dos elementos que estão na área verde da matriz, conforme for o caso. A imagem abaixo ilustra o caso da entrada do valor 2 para a linha da matriz, demonstrando os elementos que deverão ser considerados na operação.

    Entrada:
        A primeira linha de entrada contem um número L (0 ≤ L ≤ 11) indicando a linha que será considerada para operação. A segunda linha de entrada contém um único caractere Maiúsculo T ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz, sendo que a mesma é preenchida linha por linha, da linha 0 até a linha 11, sempre da esquerda para a direita.

    Saída:
        Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.
    
        
    ** Obs: para visualizar a imagem descrita no problema, acessar o link: https://www.beecrowd.com.br/judge/pt/problems/view/1181 **

 */

import java.util.Scanner;

public class BEE1181 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        float matriz[][] = new float[12][12];
        int L;
        char T;

        L = Integer.parseInt(teclado.nextLine());
        T = teclado.nextLine().charAt(0);

        for(int l = 0; l < 12; l++) {
            for(int c = 0; c < 12; c++) {
                matriz[l][c] = teclado.nextFloat();
            }
        }

        float res = 0;
        for(int c = 0; c < 12; c++) {
            res += matriz[L][c];
        }
        if(T == 'S') {
            System.out.printf("%.1f\n", res);
        } else {
            System.out.printf("%.1f\n", res / 2);
        }

        teclado.close();
    }
}
