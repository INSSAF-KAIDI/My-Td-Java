package Td1.LesTableaux;
import java.util.Scanner;
public class MaxMinTab {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le nombre d'éléments du tableau : ");
            int n = scanner.nextInt();

            int[] tableau = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Entrez l'élément " + (i + 1) + " du tableau : ");
                tableau[i] = scanner.nextInt();
            }

            int valeurMax = tableau[0];
            int valeurMin = tableau[0];

            for (int i = 1; i < n; i++) {
                if (tableau[i] > valeurMax) {
                    valeurMax = tableau[i];
                }

                if (tableau[i] < valeurMin) {
                    valeurMin = tableau[i];
                }
            }


            System.out.println("La valeur maximale est : " + valeurMax);


            System.out.println("La valeur minimale est : " + valeurMin);
        }
    }


