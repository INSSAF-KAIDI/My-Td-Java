package Td1.LesConditions;
import java.util.Scanner;
public class NbrForme {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lire l'entier
            System.out.print("Entrez un entier de trois chiffres non nuls : ");
            int n = scanner.nextInt();

            // Calculer le nombre de permutations
            int nombreDePermutations = factorial(9);

            // Parcourir toutes les permutations
            for (int i = 0; i < nombreDePermutations; i++) {
                // Générer la permutation
                int[] permutation = permutation(n);

                // Afficher la permutation
                System.out.println(permutation[0] + permutation[1] + permutation[2]);
            }
        }

        // Calculer le factoriel
        private static int factorial(int n) {
            if (n == 0) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        // Générer une permutation
        private static int[] permutation(int n) {
            int[] permutation = new int[3];

            // Choisir le premier chiffre
            permutation[0] = n % 10;
            n /= 10;

            // Choisir le deuxième chiffre
            permutation[1] = n % 10;
            n /= 10;

            permutation[2] = n % 10;

            return permutation;
        }
    }


