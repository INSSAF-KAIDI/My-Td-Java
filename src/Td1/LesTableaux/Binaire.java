package Td1.LesTableaux;
import java.util.Scanner;
public class Binaire {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un entier : ");
            int n = scanner.nextInt();

            java.lang.String representationBinaire = "";
            while (n > 0) {
                representationBinaire = (n % 2) + representationBinaire;
                n = n / 2;
            }

            System.out.println("La représentation binaire de " + n + " est : " + representationBinaire);
        }
    }


