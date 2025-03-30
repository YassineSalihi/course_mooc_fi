package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();


        System.out.println("enter numbers: ");
        System.out.println("note: if u press 0, u exit;");
        while (true){
            int input = Integer.parseInt(sc.nextLine());
            if (input == 0){
                System.out.println("...bye!");
                break;
            }

            intList.add(input);
        }
        System.out.println(intList.get(1) + intList.get(2));
    }
}
