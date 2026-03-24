public class EvenorOdd {
    public static void main(String[] args) {
        int number = 7; // input value
        boolean isEven = (number % 2 == 0);

        if (isEven) {
            System.out.println("Number is Even");
        } else {
            System.out.println("Number is Odd");
        }
    }
}