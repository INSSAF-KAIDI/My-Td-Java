package Td1.LesBoucles;
import java.util.Scanner;
public class SommesEntiersImpairs {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez un entier : ");
            int n = scanner.nextInt();


            int somme = 0;


            for (int i = 1; i < n; i += 2) {

                somme += i;
            }


            System.out.println("La somme des entiers impairs inférieurs à " + n + " est : " + somme);
        }
    }


