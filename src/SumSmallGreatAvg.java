public class SumSmallGreatAvg {

    public static int sum(int number1, int number2, int number3, int number4){
        return number1 + number2 + number3 + number4;
    }

    public static int smallest(int number1, int number2){
        if (number1 > number2){
            return number2;
        }else {
            return number1;
        }
    }

    public static int greatest(int number1, int number2, int number3){
        if (number1>number2){
            return number1;
        } else if (number2>number3) {
            return number2;
        }else {
            return number3;
        }
    }

    public static double average(int number1, int number2, int number3, int number4){
        return 1.0 * sum(number1, number2, number3, number4) / 4;
    }

    public static void main(String[] args) {

        int answer = sum(4, 3, 6, 1);
        System.out.println("Sum: " + answer);
        System.out.println("---------------------");
        int answer2 =  smallest(2, 7);
        System.out.println("Smallest: " + answer2);
        System.out.println("---------------------");
        int answer3 =  greatest(2, 7, 3);
        System.out.println("Greatest: " + answer3);
        System.out.println("---------------------");
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
