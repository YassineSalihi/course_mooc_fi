package part.partthree;

import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        for (int value : numbers){
            if (value >= lowerLimit && value <= upperLimit){
                System.out.println(value);
            }
        }
    }

    public static int sum(ArrayList<Integer> numbers){
        int somme = 0;
        for (int value : numbers){
            somme = somme + value;
        }

        return somme;
    };


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
        System.out.println(sum(numbers));
    }
}
