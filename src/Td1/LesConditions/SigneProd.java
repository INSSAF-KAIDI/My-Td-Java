package Td1.LesConditions;
import java.util.Scanner;
public class SigneProd {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lire les deux nombres
            System.out.print("Entrez le premier nombre : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int b = scanner.nextInt();

            // Calculer le signe
            int signe = a * b > 0 ? 1 : -1;


            System.out.println("Le signe du produit est : " + signe);


        }}
