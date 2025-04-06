package part.partthree;

import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Press empty string \" \" to exit.");

        while(true){
            String text = sc.nextLine();
            if (text.isEmpty()){
                System.out.println("byyye!");
                break;
            }

            String[] splitText = text.split(" ");
            for (int i = 0; i < splitText.length; i++){
                System.out.println(splitText[i]);
            }
        }


    }
}
