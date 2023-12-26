package Td1.LesConditions;
import java.util.Scanner;
public class OperatNbr {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez le premier nombre : ");
            int a = scanner.nextInt();

            System.out.print("Entrez le deuxième nombre : ");
            int b = scanner.nextInt();


            System.out.println("Que voulez-vous savoir ?");
            System.out.println("1. Si la somme a + b est paire");
            System.out.println("2. Si le produit ab est pair");
            System.out.println("3. Le signe de la somme a + b");
            System.out.println("4. Le signe du produit ab");
            System.out.print("Votre choix : ");
            int choix = scanner.nextInt();


            switch (choix) {
                case 1:
                    System.out.println("La somme a + b est paire : " + (a + b % 2 == 0));
                    break;
                case 2:
                    System.out.println("Le produit ab est pair : " + (a * b % 2 == 0));
                    break;
                case 3:
                    System.out.println("Le signe de la somme a + b est : " + (a + b >= 0 ? "positif" : "négatif"));
                    break;
                case 4:
                    System.out.println("Le signe du produit ab est : " + (a * b >= 0 ? "positif" : "négatif"));
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir entre 1 et 4.");
                    break;
            }
        }
    }


