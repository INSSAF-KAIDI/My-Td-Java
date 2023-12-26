package Td1.LesConditions;
import java.util.Scanner;
public class MentionEtd {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lire la moyenne
            System.out.print("Entrez la moyenne de l'étudiant : ");
            double moyenne = scanner.nextDouble();

            // Calculer la mention
            String mention = "";
            if (moyenne >= 16) {
                mention = "Très bien";
            } else if (moyenne >= 14) {
                mention = "Bien";
            } else if (moyenne >= 12) {
                mention = "Assez bien";
            } else {
                mention = "Passable";
            }

            System.out.println("La mention de l'étudiant est : " + mention);
        }
    }


