package Td1.LesConditions;
import java.util.Scanner;
public class LangHeure {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Entrez l'heure (0-23) : ");
            int heure = scanner.nextInt();

            System.out.print("Choisissez la langue (f pour français, a pour anglais) : ");
            char langue = scanner.next().charAt(0);
            if (heure >= 0 && heure <= 18) {
                if (langue == 'f') {
                    System.out.println("Bonjour");
                } else {
                    System.out.println("Good Morning");
                }
            } else if (heure >= 18 && heure <= 22) {
                if (langue == 'f') {
                    System.out.println("Bonsoir");
                } else {
                    System.out.println("Good Evening");
                }
            } else {
                if (langue == 'f') {
                    System.out.println("Bonne nuit");
                } else {
                    System.out.println("Good Night");
                }
            }
        }
    }


