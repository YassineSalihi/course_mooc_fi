import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int sum = 0;
        while (true){
            System.out.println("Give a Number");
            int number = Integer.parseInt(read.nextLine());

            if (number == 0){
                break;
            }

            sum = sum + number;
        }

        System.out.println(sum);
    }
}
