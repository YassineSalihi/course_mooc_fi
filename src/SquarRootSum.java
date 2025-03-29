import java.util.Scanner;

public class SquarRootSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        System.out.print("Enter number 1: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter number 2: ");
        num2 = Integer.parseInt(sc.nextLine());// program can be developped
        int sum = (int) Math.sqrt(num1 + num2);
        System.out.println(sum);

    }
}
