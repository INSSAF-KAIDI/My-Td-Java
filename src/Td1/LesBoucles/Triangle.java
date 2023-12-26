package Td1.LesBoucles;
import java.util.Scanner;
public class Triangle {
    
        public static void main(String[] args) {
            
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le nombre de lignes : ");
            int n = scanner.nextInt();

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }

                System.out.println();
            }
        }
    }


