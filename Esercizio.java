//LEGGERE LE ISTRUZIONI NEL FILE README.md

import java.util.Scanner;
import java.util.Random;

// Classe principale, con metodo main
class Esercizio {

    public static Scanner in = new Scanner( System.in );

    public static void assegnaMatrice(int[][] M, int nR, int nC, int val) {
        for (int i = 0; i < nR; ++i) {
            for (int j = 0; j < nC; ++j) {
                M[i][j] = val;
            }
        }
    }

    public static void azzeraMatrice(int[][] M, int nR, int nC) {
        assegnaMatrice(M, nR, nC, 0);
    }

    public static void riempiCasuale(int[][] M, int nR, int nC, int valMin, int valMax) {
        Random rand = new Random();
        int val, i, j;
        for (i = 0; i < nR; ++i) {
            for (j = 0; j < nC; ++j) {
                val = rand.nextInt(valMax + 1 - valMin) + valMin;
                M[i][j] = val;
            }
        }
    }

    public static void main(String args[]) {
        int nR, nC, val, valMin, valMax;
        System.out.println("Inserire il numero di righe da cui è composta la matrice: ");
        do {
            nR = Integer.parseInt(in.nextLine());
        } while (nR<0);
        System.out.println("Inserire il numero di colonne da cui è composta la matrice: ");
        do {
            nC = Integer.parseInt(in.nextLine());
        } while (nC<0);
        int[][] M = new int [nR][nC];

        System.out.println("\n------ RIEMPIMENTO MATRICE ------");
        System.out.println("Inserisci un valore per riempire la matrice: ");
        val = Integer.parseInt(in.nextLine());
        assegnaMatrice(M, nR, nC, val);
        UtilsMatrice.visualizza(M);

        System.out.println("\n------ AZZERAMENTO MATRICE ------");
        azzeraMatrice(M, nR, nC);
        UtilsMatrice.visualizza(M);

        System.out.println("\n------ RIEMPIMENTO CASUALE MATRICE ------");
        System.out.println("Inserire il valore minimo che può assumere il numero che riempirà la matrice: ");
        valMin = Integer.parseInt(in.nextLine());
        System.out.println("Inserire il valore massimo che può assumere il numero che riempirà la matrice: ");
        do {
            valMax = Integer.parseInt(in.nextLine());
        } while (valMax < valMin);
        riempiCasuale(M, nR, nC, valMin, valMax);
        UtilsMatrice.visualizza(M);
    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md