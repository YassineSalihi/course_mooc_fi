import java.util.Scanner;

public class UnluckyNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true){
            System.out.println("Give number: ");
            int num = Integer.parseInt(reader.nextLine());
            if (num == 4){
                break;
            }

            System.out.println("your input is : " + num);
        }

        System.out.println("You out!!");
    }
}
