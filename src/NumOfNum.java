import java.util.Scanner;

public class NumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfNum = 0;
        while (true){
            System.out.println("GIve a number: ");
            int input = Integer.parseInt(sc.nextLine());

            if (input == 0){
                break;
            }

            numOfNum = numOfNum + 1;

        }
        System.out.println("Number of inputs: " + numOfNum);
    }
}
