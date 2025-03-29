import java.util.Scanner;

public class CountingToHundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter NUmber: ");
        int numGiven = Integer.parseInt(sc.nextLine());
        for (int i = numGiven; i <= 100; i++){
            System.out.println(i);
        }
     }
}
