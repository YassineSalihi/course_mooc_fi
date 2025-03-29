import java.util.Scanner;

public class HoleInGround {

    public static void printText(){
        System.out.println("In a hole in the ground there lived a method");
    }

    public static void main(String[] args) {

        System.out.println("How many times? ");
        Scanner sc = new Scanner(System.in);
        int numOfTime = Integer.parseInt(sc.nextLine());
        int i = 0;
        while (i < numOfTime){
            printText();
            i++;
        }

    }
}
