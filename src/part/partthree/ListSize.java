package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Names: ");
        ArrayList<String> nameList = new ArrayList<>();

        while (true){
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("bye bye!");
                break;
            }

            nameList.add(input);
        }

        System.out.println("IN total: " + nameList.size());
    }
}
