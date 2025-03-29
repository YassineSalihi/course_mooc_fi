import java.util.Scanner;

public class RepeatingBreakingRemembering {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.println("Give numbers: ");
        int input;
        int numOfNum = 0;
        int odd = 0, even = 0;
        double avg = 0;
        while (true) {

            input = Integer.parseInt(sc.nextLine());
            if (input == -1) { // exit
                System.out.println("Thx! Bye!");
                break;
            }

            if (input % 2 == 0){
                even = even + 1;
            }else {
                odd = odd + 1;
            }


            sum = sum + input; // somme
            numOfNum++; // number of numbers
            avg = (double)sum / numOfNum;
        }


        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numOfNum);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
