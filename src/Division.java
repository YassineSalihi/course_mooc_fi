public class Division {

    public static void division(int numerator, int denominator){
        System.out.println((float)numerator / denominator); // I dont evaluate the zero case <(")
    }

    public static void divisibleByThreeInRange(int beginning, int end){

        while (beginning <= end){
            if (beginning % 3 == 0){
                System.out.println(beginning);
            }
            beginning++;
        }
    }

    public static void main(String[] args) {

        division(3, 5);
        System.out.println("=============================");
        divisibleByThreeInRange(2, 10);

    }
}
