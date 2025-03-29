import java.util.Scanner;

public class Squared {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.next());
        int squared = number * number;
        System.out.println("the square number of " + number + " is: " + squared);
    }
}
