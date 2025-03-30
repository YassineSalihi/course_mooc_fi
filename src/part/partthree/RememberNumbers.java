package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class RememberNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers:");
        System.out.println("Press -1 to exit.");
        while (true){
            int input = Integer.parseInt(sc.nextLine());
            if (input == -1 ){
                System.out.println("byyye!");
                break;
            }

            numbers.add(input);
        }

        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

    }
}
