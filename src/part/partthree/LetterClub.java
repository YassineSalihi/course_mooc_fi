package part.partthree;

import java.util.Scanner;

public class LetterClub {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("");

        while (true) {
            String text = sc.nextLine();

            if (text.isEmpty()){
                System.out.println("byyye!");
                break;
            }

            String[] splitedText = text.split(" ");
                for (String sp : splitedText){
                    if (sp.contains("av")){
                        System.out.println(sp);
                    }
                }

        }

    }


}

