package Td1.LesConditions;
import java.util.Scanner;
public class MaxTroisNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre le premier nombre : ");
        int a = scanner.nextInt();

        System.out.print("Entre le deuxième nombre : ");
        int b = scanner.nextInt();

        System.out.print("Entre le troisième nombre : ");
        int c = scanner.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println("Le maximum est " + max);
    }
}
