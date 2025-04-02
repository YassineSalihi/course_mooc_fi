package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfList {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers: ");
        System.out.println("Press -1 to exit.");

        while (true){
            int input = Integer.parseInt(read.nextLine());
            if (input == -1 ){
                //System.out.println("byyye!");
                break;
            }

            numbers.add(input);
        }
        float avg = 0;
        int sum = 0;
        for (int number : numbers){

            sum = sum + number;
            avg = (float) sum / numbers.size();
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

    }
}
