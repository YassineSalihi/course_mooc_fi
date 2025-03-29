import java.util.Scanner;

public class AvgNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int numInput = 0;

        while (true){
            System.out.println("Give a number: ");
            int input = Integer.parseInt(sc.nextLine());
            if (input == 0){
                break;
            }
            numInput = numInput + 1; // An7ssb bih Lma9am
            sum = sum + input;


        }
        System.out.println(sum);
        System.out.println(numInput);
        System.out.print( "Average of the numbers: " + (float)sum / numInput);
    }
}
