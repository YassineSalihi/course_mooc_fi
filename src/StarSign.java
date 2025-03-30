public class StarSign {

    public static void printStars (int number){
        for (int i = 1; i <= number; i++){
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSquare(int size){

        int i = 0;
        while (i < size){
            printStars(size);
            //System.out.println("");
            i++;
        }
    }

    public static void printRectangle(int width, int height){

        int i = 0;
        while (i < height){
            printStars(width);
            i++;
        }
    }

    public static void printTriangle(int size){

        int i = 1;
        while (i <= size){
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("=====================");
        printSquare(4);
        System.out.println("=====================");
        printRectangle(17, 3);
        System.out.println("=====================");
        printTriangle(4);
    }
}
