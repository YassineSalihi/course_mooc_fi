import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("give a number: ");
        int givenNum = Integer.parseInt(sc.nextLine());
        //int i = 1;
        int fact = 1;
        /*if (givenNum == 0){
            fact = 1;
        }*/

        for (int i = 1; i <= givenNum; i++){
            fact *= i;
            //System.out.println(fact);
        }
        System.out.println(fact);
    }
}
