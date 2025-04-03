package part.partthree;

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[4];
        numbers[0] = 42;
        numbers[1] = 13;
        numbers[2] = 12;
        numbers[3] = 7;

        System.out.print("Search for? ");
        int inputSearched = Integer.parseInt(sc.nextLine());
        boolean found = false;
        for (int i = 0; i < numbers.length; i++ ){
            if (inputSearched == numbers[i]){
                System.out.println(inputSearched + " is at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println(inputSearched + " was not found.");
        }

    }
}
