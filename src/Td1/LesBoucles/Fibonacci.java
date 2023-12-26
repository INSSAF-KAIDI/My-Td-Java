package Td1.LesBoucles;
import java.util.Scanner;
public class Fibonacci {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Entrez un entier n : ");
            int n = scanner.nextInt();

            int terme = fibonacci(n);


            System.out.println("Le nème terme de la suite de Fibonacci est : " + terme);
        }


        private static int fibonacci(int n) {

            if (n <= 1) {
                return n;
            }


            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }


