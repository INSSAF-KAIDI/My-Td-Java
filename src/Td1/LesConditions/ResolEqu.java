package Td1.LesConditions;
import java.util.Scanner;
public class ResolEqu {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez le coefficient a : ");
            double a = scanner.nextDouble();

            System.out.print("Entrez le coefficient b : ");
            double b = scanner.nextDouble();

            System.out.print("Entrez le coefficient c : ");
            double c = scanner.nextDouble();


            double delta = b * b - 4 * a * c;


            if (delta < 0) {
                System.out.println("L'équation n'a pas de solution réelle.");
            } else if (delta == 0) {
                double x = -b / 2 * a;
                System.out.println("L'équation a une solution unique : x = " + x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("L'équation a deux solutions distinctes : x1 = " + x1 + " et x2 = " + x2);
            }
        }
    }


