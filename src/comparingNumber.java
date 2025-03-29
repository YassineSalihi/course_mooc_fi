import java.util.Scanner;

public class comparingNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Enter Number 1: ");
        num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Number 2: ");
        num2 = Integer.parseInt(sc.nextLine());

        if (num1 > num2){
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2){
            System.out.println(num1 + " is smaller than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
