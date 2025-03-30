package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers:");
        System.out.println("Press -1 to exit.");

        while (true){
            int input = Integer.parseInt(sc.nextLine());
            if (input == -1 ){
                //System.out.println("byyye!");
                break;
            }

            numbers.add(input);
        }

        System.out.print("From where? ");
        int start = Integer.parseInt(sc.nextLine());
        System.out.print("To Where? ");
        int end = Integer.parseInt(sc.nextLine());

        for (int i = start; i <= end; i++){
            System.out.println(numbers.get(i));
        }


    }
}
