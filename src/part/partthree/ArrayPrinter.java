package part.partthree;

public class ArrayPrinter {

    public static void printNeatly(int[] array){

        int index = 0;
        while (index < array.length){
            //if (array[index] != array[array.length - 1]) {
                System.out.print(array[index]);
                if (array[index] == array[array.length - 1]){
                    break;  // bro ana dki nowaay;
                }
            System.out.print(", ");
           // }
            index = index + 1;
        }

    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }
}
