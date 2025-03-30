package part.partthree;


import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> nameList= new ArrayList<>();

        while(true){

            System.out.println("enter name: ");
            String input = sc.nextLine();
            if(input.isEmpty()){
                System.out.println("bye bye!");
                 break;
            }

            nameList.add(input);
        }
        System.out.println(nameList.get(2));
    }
}
