package Td1.LesConditions;
import java.util.Scanner;
public class NbrJourMois {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lire le mois
            System.out.print("Entrez le numéro du mois (1-12) : ");
            int mois = scanner.nextInt();

            // Lire l'année
            System.out.print("Entrez l'année : ");
            int annee = scanner.nextInt();

            // Calculer le nombre de jours
            int nombreDeJours = 31;
            if (mois == 2) {
                // Février
                if (annee % 4 == 0 && (annee % 100 != 0 || annee % 400 == 0)) {
                    nombreDeJours = 29;
                } else {
                    nombreDeJours = 28;
                }
            } else if (mois == 4 || mois == 6 || mois == 9 || mois == 11) {
                nombreDeJours = 30;
            }


            System.out.println("Le mois " + mois + " de l'année " + annee + " a " + nombreDeJours + " jours.");
        }
    }


