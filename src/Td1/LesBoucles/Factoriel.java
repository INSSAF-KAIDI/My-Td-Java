package Td1.LesBoucles;
import java.util.Scanner;
public class Factoriel {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez un entier : ");
            int n = scanner.nextInt();


            int factoriel = 1;
            for (int i = 2; i <= n; i++) {
                factoriel *= i;
            }

            System.out.println("Le factoriel de " + n + " est : " + factoriel);
        }
    }


