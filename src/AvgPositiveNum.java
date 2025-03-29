import java.util.Scanner;

public class AvgPositiveNum {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        int sum = 0;
        int numInputPositive = 0;

        while (true) {
            System.out.println("Enter number: ");
            int input = Integer.parseInt(reader.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                sum += input;
                numInputPositive++;
            }
        }

        if (numInputPositive > 0) {
            System.out.println("Average of positives is: " + ((float) sum / numInputPositive));
        } else {
            System.out.println("Cannot calculate the average.");
        }

        reader.close();
    }
}
