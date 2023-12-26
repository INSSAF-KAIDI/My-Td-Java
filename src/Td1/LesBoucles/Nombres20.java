package Td1.LesBoucles;
import java.util.Scanner;
public class Nombres20 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Initialiser le maximum
            int maximum = Integer.MIN_VALUE;

            // Lire les 20 nombres
            for (int i = 0; i < 20; i++) {
                // Lire le nombre
                System.out.print("Entrez le nombre n°" + (i + 1) + " : ");
                int nombre = scanner.nextInt();

                // Mettre à jour le maximum si nécessaire
                if (nombre > maximum) {
                    maximum = nombre;
                }
            }

            // Afficher le maximum
            System.out.println("Le maximum est : " + maximum);
        }
    }


