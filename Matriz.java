package arreglos;

import java.util.Scanner;

public class Matriz {

    int[][] numeros = new int[3][3];
    Scanner leer = new Scanner(System.in);

    public void llenarMatriz() {
        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {
                System.out.println("ingresar numero para la matriz");
                numeros[i][j] = leer.nextInt();
            }
        }
    }


    public void imprimirMatriz() {
        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {
                System.out.println("\t" + numeros[i][j]);

            }
        }
    }
}
