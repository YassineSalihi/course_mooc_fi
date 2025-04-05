package part.partthree;

public class SumOfArray {

    public static int sumOfNumbersInArray(int[] array){

        int index = 0;
        int sum = 0;
        while (index < array.length){
            sum = sum + array[index];
            index = index + 1;
        }
       //System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {

        int[] numbers = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(numbers));

    }
}
