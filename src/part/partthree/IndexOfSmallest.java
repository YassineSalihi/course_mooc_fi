package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers:");
        System.out.println("Press 9999 to exit.");

        while (true){
            int input = Integer.parseInt(sc.nextLine());
            if (input == 9999 ){
                //System.out.println("byyye!");
                break;
            }

            numbers.add(input);
        }
        int smallest = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (smallest > num) {
                smallest = num;
            }
        }

        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < numbers.size(); i++){
            if (smallest == numbers.get(i)){
                System.out.println("Found at index: " + i);
            }
        }
        //System.out.println("Found at index: " + i);

    }
}
