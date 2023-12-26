package Td1.LesTableaux;
import java.util.Scanner;
public class MoyEtd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le nombre d'étudiants : ");
            int n = scanner.nextInt();

            double[] moyennes = new double[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Entrez la moyenne de l'étudiant " + (i + 1) + " : ");
                moyennes[i] = scanner.nextDouble();
            }

            System.out.print("Entrez le seuil : ");
            double seuil = scanner.nextDouble();

            int nombreEtudiants = 0;

            for (int i = 0; i < n; i++) {
                if (moyennes[i] >= seuil) {
                    nombreEtudiants++;
                }
            }


            System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale à " + seuil + " est de " + nombreEtudiants);
        }
    }


