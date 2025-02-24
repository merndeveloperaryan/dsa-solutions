import java.util.Arrays;

public class LoopsPrograms {

    // Sum of to N terms
    public static int sumOfNumbers(int number) {

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    } 

    // Factorial of a number 
    public static int factorialOfNumber(int number) {

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    } 

    // Sum of even and odd given in range.
    public static void sumOfEvenAndOdd(int range) {

        int evenSum = 0, oddSum = 0;
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) evenSum += i;
            else oddSum += i;
        }
        
        System.out.println("The sum of even is " + evenSum + " and the oddSum is " + oddSum);
    } 

    // Print all the factors of given number
    public static void factorsOfNumber(int number) {
        int factor = 2;
        if (number == 1 || number == 2 || number == 3) System.out.print(number);
        else {
            while (number > 1) {
                if (number % factor == 0) {
                    number /= factor;
                    System.out.print(factor + " ");
                }else factor++;
            }
        }
    }

    // Sum of all factors
    public static int sumOfFactors(int number) {
        int factor = 2;
        int sum = 0;
        if (number == 1 || number == 2 || number == 3) System.out.print(number);
        else {
            
            while (number > 1) {
                if (number % factor == 0) {
                    number /= factor;
                    sum += factor;
                }else factor++;
            }
        }

        return sum;
    }

    // check number is prime or not
    public static boolean isPrime(int number) {

        if (number == 2 || number == 3 || (number%2 != 0 && number%3 != 0)) return true;

        return false;
    }

    // Calculate power of a number
    public static void calculatePower(int num, int power) {
        int ans = 1;
        for (int i = 0; i < power; i++) {
            ans *= num;
        }
        System.out.println(ans);
    }

    // Print fibonacci series
    public static void fibonacciSeries(int seriesLength) {
        
        if (seriesLength >= 1) System.out.print(0 + " ");
        if (seriesLength == 2) System.out.print(1 + " ");
        if (seriesLength > 2) {
            int a = 0, b = 1;
            for (int i = 0; i < seriesLength - 2; i++) {
                int last = a + b;
                a = b;
                b = last;
                System.out.print(b + " ");
            }
        }

    }

    // separate digits of a number
    public static int[] separateDigits(int number, int digitCount) {

        int[] arr = new int[digitCount];
        while (number != 0) {
            int lastDigit = number % 10;
            arr[digitCount-- - 1] = lastDigit;
            number /= 10;
        }

        return arr;
    }

    // Sum of digits of a number
    public static int sumOfDigits(int number) {

        int sum = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }

        return sum;
    }

    // Reverse a number 
    public static int reverseNumber(int number) {

        int rev = 0;
        while (number != 0) {
            int lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;
            number /= 10;
        }

        return rev;
    }

    // check if a number is palindromic.
    public static boolean isPalindromic(int number) {

        int rev = 0;
        int save = number;
        while (number != 0) {
            int lastDigit = number % 10;
            rev = (rev * 10) + lastDigit;
            number /= 10;
        }
        number = save;
        if (number == rev) return true;

        return false;
    }

    // check number is strong or not
    public static boolean isStrong(int number) {

        int sum = 0;
        int save = number;
        while (number != 0) {
            int lastDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact *= i;
            }
            sum += fact;
            number /= 10;
        }
        number = save;
        if (number == sum) return true;

        return false;
    }

    // check number is automorphic number or not
    public static boolean isAutomorphic(int number) {

        int count = 0;
        int square = number * number;
        int save = number;
        while (number != 0) {
            number /= 10;
            count++;
        }
        number = save;
        int remainder = square % (int)Math.pow(10, count);
        if (number == remainder) return true;

        return false;
    }


    // Pattern programming
    // squarePattern
    public static void squarePattern(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print rightTriangle
    public static void rightTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print invertRightTriangle
    public static void invertRightTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // print mirroredRightTriangle
    public static void mirroredRightTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // print invertedMirroredRightTriangle
    public static void invertedMirroredRightTriangle(int length) {
        for (int i = length; i >= 1; i--) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    // print equilateral triangle
    public static void equilateralTriangle(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print v shape or boundary elements.
    public static void vShape(int length) {
        for (int i = length; i >= 1; i--) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Print X shape or print diagonal elements.
    public static void xShape(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (j == i || (j + i == length - 1)) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // print z shape
    public static void zShape(int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == 0  || (j + i == length - 1) || i == length-1) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // print Y shape
    public static void yShape(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                if (j == i || (j + i == length - 1)) {
                    System.out.print("* ");
                }
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Print table of any number 
    public static void tableOfNumber(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X " + num + " = " + (i * num));
        }
    }

    // find string length 
    public static int stringLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }

        return length;
    }



    public static void main(String[] args) {
        
        
    }
    
}