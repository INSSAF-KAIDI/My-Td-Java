package Td1.LesBoucles;
import java.util.Scanner;
public class PGCD {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez le premier entier : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le deuxième entier : ");
            int b = scanner.nextInt();


            int pgcd = pgcd(a, b);


            System.out.println("Le PGCD de " + a + " et " + b + " est : " + pgcd);
        }

        // Calcule le PGCD de deux entiers a et b
        private static int pgcd(int a, int b) {
            // Si b est nul, le PGCD est a
            if (b == 0) {
                return a;
            }


            return pgcd(b, a % b);
        }
    }


