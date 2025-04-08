public class Recursion {

    // Print hello n times.
    public static int printNTimesHello(int n) {
        if(n == 0) {
            return 1;
        }
        System.out.println("Hello");
        return printNTimesHello(n - 1);
    }

    // Print natural numbers 1 to n and n to 1
    public static void printNaturalNumbers(int n) {
        if(n == 0) {
            System.out.println(n);
        }
        // System.out.println(n);  5 4 3 2 1
        printNaturalNumbers(n - 1);
    }

    public static void main(String[] args) {
        printNaturalNumbers(5);
    }
}