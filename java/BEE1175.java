/* 
    BEECROWD 1175 | Troca em Vetor I

    Faça um programa que leia um vetor N[20]. Troque a seguir, 
    o primeiro elemento com o último, o segundo elemento com o penúltimo, etc., 
    até trocar o 10º com o 11º. Mostre o vetor modificado.

    Entrada:
        A entrada contém 20 valores inteiros, positivos ou negativos.
    
    Saída:
        Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor e Y é o valor armazenado naquela posição.
 */



import java.util.Scanner;

public class BEE1175 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int N[] = new int[20];

        for(int i = 0; i < N.length; i++) {
            N[i] = teclado.nextInt();
        }
        
        for(int i = 0; i < (N.length / 2); i++) {
            int N_inicial = N[i];
            N[i] = N[N.length - 1 - i];
            N[N.length - 1 - i] = N_inicial;
        }
        
        for(int i = 0; i < N.length; i++) {
            System.out.println("N[" + i + "] = " + N[i]);
        }

        teclado.close();
    }
}
