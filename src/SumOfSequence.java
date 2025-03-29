import java.util.Scanner;

public class SumOfSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Last Number? ");
        int givenNum = Integer.parseInt(sc.nextLine());
        System.out.print("first number? ");
        int i = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while(i <= givenNum){
            sum = sum + i;
            i++;
           /* System.out.println(i);
            System.out.println("----");
            System.out.println(sum);*/
        }
        System.out.println("The sum is "+ sum);
    }
}
