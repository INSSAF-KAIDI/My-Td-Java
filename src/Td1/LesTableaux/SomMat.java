package Td1.LesTableaux;
import java.util.Scanner;
public class SomMat {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez la taille des matrices : ");
            int n = scanner.nextInt();

            // Créer les matrices
            double[][] matrice1 = new double[n][n];
            double[][] matrice2 = new double[n][n];

            // Demander à l'utilisateur de saisir les éléments de la première matrice
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Entrez l'élément (" + i + ", " + j + ") de la première matrice : ");
                    matrice1[i][j] = scanner.nextDouble();
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("Entrez l'élément (" + i + ", " + j + ") de la deuxième matrice : ");
                    matrice2[i][j] = scanner.nextDouble();
                }


            }}}