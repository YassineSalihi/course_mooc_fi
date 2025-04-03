package part.partthree;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 3;
        numbers[2] = 5;
        numbers[3] = 7;
        numbers[4] = 9;

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Give two indices to swap: ");
        int index1 = Integer.parseInt(sc.nextLine());
        int index2 = Integer.parseInt(sc.nextLine());

        int helper = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = helper;

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }


    }
}
