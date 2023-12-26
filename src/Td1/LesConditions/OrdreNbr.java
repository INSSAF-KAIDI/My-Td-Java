package Td1.LesConditions;
import java.util.Scanner;
public class OrdreNbr {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lire les deux variables
            System.out.print("Entrez la première variable : ");
            int a = scanner.nextInt();

            System.out.print("Entrez la deuxième variable : ");
            int b = scanner.nextInt();

            // Trier les deux variables
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }

            // Afficher les deux variables dans l'ordre croissant
            System.out.println("Les deux variables dans l'ordre croissant sont : " + a + " et " + b);
        }
    }


