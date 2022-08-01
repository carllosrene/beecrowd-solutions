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
