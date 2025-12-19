public class swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int temp;

        System.out.println("Swapping the numbers using temporary variable");
        System.out.println("Before swapping: a = " + a + " and b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping using temporary variable: a = " + a + " and b = " + b);

        System.out.println("\nSwapping the numbers without using temporary variable");
        System.out.println("Before swapping: a = " + a + " and b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping without temporary variable: a = " + a + " and b = " + b);
    }
}