public class NumberSystem {

    // Swap two integers without using third variable using bitwise operator.
    public static void swapTwoNumbersUsingBitwiseOperator(int a, int b) {
        System.out.println(a + " and " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " and " + b);
    }

    // Check even or odd using bitwise.
    public static boolean isEven(int number) {
        if ((number & 1) == 0) {
            return true;
        }
        return false;
    }

    // Decimal to binary
    public static void decimalToBinary(int number) {
        String s = "";
        while (number >= 1) {
            s += (number % 2);
            number /= 2;
        }
        System.out.println();
    }

    // binary to decimal.
    public static void binaryToDecimal(String str) {
        int size = str.length();
        int sum = 0;
        int count = 0;
        for (int i = size - 1; i >= 0; i--) {
            sum += (str.charAt(i) * (int) Math.pow(2, count++));
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        binaryToDecimal("100100");
    }
}