package part.partthree;

import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Enter Names: ");

       while (true){
           String input = read.nextLine();
           if(input.isEmpty()){
               System.out.println("bye bye!");
               break;
           }

           names.add(input);
       }

        System.out.println(names.get(names.size() - 1)); // u can use getLast() instead.
        System.out.println(names.getLast());
        System.out.println("-----------------------");
        System.out.println(names.get(0)); // u can use getFirst() instead.
        System.out.println(names.getFirst());

    }
}
