import java.util.Scanner;

public class AbsolutValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        if (number < 0){
            System.out.println(-number);
        } else {
            System.out.println(number);
        }

    }
}
