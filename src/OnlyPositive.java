import java.util.Scanner;

public class OnlyPositive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Give a number: ");
            int num = Integer.parseInt(input.nextLine());
            int res = num * num;
            //System.out.println(res); here it calculate even negative number

            if (num == 0){
                break;
            }

            if (num < 0){
                System.out.println("Unsuitable number");
                continue;
            }

            System.out.println(res);
        }
    }
}
