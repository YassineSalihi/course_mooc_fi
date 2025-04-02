package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter names");
        System.out.println("Press \"\" (empty string) to exit.");

        while (true){
            String input = sc.nextLine();
            if (input.isEmpty()){
                System.out.println("I go bye bye!");
                break;
            }

            names.add(input);
        }

        System.out.print("Search for? ");
        String searched = sc.nextLine();

        if (names.contains(searched)){
            System.out.println(searched + " was found!");
        }else {
            System.out.println(searched + " was not found!");
        }

    }
}
