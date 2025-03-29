import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int numGiven = Integer.parseInt(sc.nextLine());
        for (int i = 0; i <= numGiven; i++){
            System.out.println(i);
        }
    }
}
