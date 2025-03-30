package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

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

        System.out.print("Search for? ");
        int ans = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < numbers.size(); i++){
            if (ans == numbers.get(i)){
                System.out.println(ans + " is at index " + i);
            }
        }

    }
}
