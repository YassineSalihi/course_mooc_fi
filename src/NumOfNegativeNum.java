import java.util.Scanner;

public class NumOfNegativeNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfNegativeNum = 0;
        while (true){
            System.out.println("Give Number: ");
            int input = Integer.parseInt(sc.nextLine());

            if (input < 0){
                numOfNegativeNum = numOfNegativeNum + 1;
                continue;
            }

            if (input == 0){
                break;
            }
        }

        System.out.println(numOfNegativeNum);
    }
}
