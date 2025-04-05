package part.partthree;

public class Printer {

    public static void printArrayInStars(int[] array){

        int index = 0;
        for (int i = 0; i < array.length; i++){

            for (int j = 0; j < array[i]; j++){
                System.out.print("*");
                index = index + 1;
            }
            System.out.println();

        }    // I AM A FREAKIN' GENIUS

    }


    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
}
