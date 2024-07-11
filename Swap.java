public class Swap {
    public static void main(String[] args) {
        int number = 20;
        int secondNumber = 40;
        int lastNumber = number;
        number = secondNumber;
        secondNumber = lastNumber;
        System.out.println(secondNumber);
        System.out.println(number);
    }
}
