import java.util.Scanner;

public class FromWhereToWhere {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("where to : ");
        int endNumGiven = Integer.parseInt(sc.nextLine());
        System.out.print("Where from? ");
        int startNumGiven = Integer.parseInt(sc.nextLine());
        for (int i = startNumGiven; i <= endNumGiven; i++){
            System.out.println(i);
        }


    }
}
