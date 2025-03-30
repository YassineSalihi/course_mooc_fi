public class StarSignAdvanced {

    public static void printStars (int number){
        for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number){
        //int i = number;
        while (number >= 1 ){
            System.out.print(" ");
            number--;
        }
    }

    public static void printTriangle(int size){
        int i = 1;
        while (i <= size){
            printSpaces(size - i);
            printStars(i);
            i++;
            //size--;
        }
    }

    public static void christmasTree(int height){
        for (int i = 0; i < height; i++){
            printSpaces(height - i - 1);
            printStars(i * 2 + 1);

            /*printSpaces(i + 1/2);
            printStars(3);*/

        }
        // la base :
        for (int i = 0; i < 2; i++){
            //printSpaces(i);
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {

        //printTriangle(4);
        christmasTree(4);
        System.out.println("==================");
        christmasTree(10);
    }
}
