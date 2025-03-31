import java.util.Arrays;
import java.util.Scanner;

public class BaseProgram {

    // Sum of two integers.
    public static int sumOfTwoIntergers(int a, int b) {
        return a + b;
    }

    // Sum of two integers with appropriate message
    public static void sumWithMessage(int a, int b) {
        System.out.println("The sum of two numbers is : " + (a + b));
    }

    // Take two integers with user and print their answer in console with
    // appropriate message.
    public static void numberWithMessage(int a, int b) {
        System.out.println("a is : " + a + " and b is : " + b);
    }

    // Accept String name and integer age and print as it is in the console
    public static void printNameAndAge(String name, int age) {
        System.out.println("Name is " + name + " and age is " + age);
    }

    // Swap two integers.
    public static void swapTwoNumbers(int a, int b) {
        System.out.println("Before swapping values are " + a + " and " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("Swaped values are " + a + " and " + b);
    }

    // Swap two integers value without using third variable.
    public static void swapTwoNumbersWithoutUsingThirdVariable(int a, int b) {
        System.out.println("Before swapping values are " + a + " and " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Swaped values are " + a + " and " + b);
    }

    // Accept the length and width of a rectangle as double. Calculate and print
    // area and parameter.
    public static void printAreaAndParameterOfRectangle(int length, int width) {
        System.out.println("Area is : " + (length * width));
        System.out.println("Parameter is : " + (2 * (length + width)));
    }

    // Accept the principle amount, the rate of interest, and the time period in
    // years. Calculate and print Compound Interest.
    public static void compoundInterest(int pa, int rate, int time) {
        double A = pa * Math.pow((1 + (rate / 100.0)), time);
        System.out.println("Compound Interest is " + (A - pa));
    }

    // Accepts the length of sides of a triangle. Calculate area using Heron's
    // formula and print it
    public static void areaOfTriangleUsingHeronFormula(double first, double second, double third) {
        double s = (first + second + third) / 2;
        double area = Math.sqrt(s * (s - first) * (s - second) * (s - third));
        System.out.println("Area of a triangle is : " + area);
    }

    // Accept two numbers and determine which one is greater. Print the greatest
    // number
    public static void greatestOfTwo(int a, int b) {
        if (a > b)
            System.out.println(a + " is greatest");
        else
            System.out.println(b + " is greatest");
    }

    // Accept a number and check number is odd and even.
    public static void isOdd(int number) {
        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // Accept an age of voter and checks voter is valid or not.
    public static void isValidVoter(int age) {
        if (age >= 18)
            System.out.println("Valid voter");
        else
            System.out.println("Not eligible to vote");
    }

    // Accept a day number between 1 to 7. Print the corresponding day name.
    // Otherwise give a error message
    public static void printDaysNameAccordingNumber(int dayName) {
        switch (dayName) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Give valid number between 1 to 7");
                break;
        }
    }

    // Accept a year from the user and check leap year or not.
    public static void isLeapYear(int year) {
        if (year % 100 == 0) {
            if (year % 400 == 0)
                System.out.println("Leap year");
            else
                System.out.println("Not leap");
        } else {
            if (year % 4 == 0)
                System.out.println("Leap year");
            else
                System.out.println("Not leap");
        }
    }

    // 15. Calculate electricity bill. Take Units from the user and calculate
    // according to these steps.
    // - first 100 units → 4.2 rupees
    // - next 100 units → 6 rupees.
    // - next 200 units → 8 rupees.
    // - above 400 units → 13 rupees.
    public static void calculateElectricityBill(double unit) {
        double bill = 0;
        if (unit > 400) {
            bill += (unit - 400) * 13;
            unit = 400;
        }
        if (unit <= 400 && unit >= 200) {
            bill += (unit - 200) * 8;
            unit = 200;
        }
        if (unit <= 200 && unit >= 100) {
            bill += (unit - 100) * 6;
            unit = 100;
        }
        if (unit <= 100) {
            bill += unit * 4.2;
        }

        System.out.println("Total electricity bill is : " + bill);
    }

    // Checks if character is vowel or consonant.
    public static void isVowelOrConsonant(char character) {
        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {

            switch (character) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                    System.out.println("vowel");
                    break;

                default:
                    System.out.println("consonant");
                    break;
            }
        } else {
            System.out.println("Enter alphabets only");
        }
    }

    // Take a n integer input from the user and print hello world n times.
    public static void printNTimesHello(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello");
        }
    }

    // Print natural numbers up to a given limit.
    public static void printNaturalNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }

    // Write a program to calculate natural numbers up to limit n.
    public static void calculateNaturalNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    // Factorial of a number.
    public static int factorialOfN(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact += i;
        }
        return fact;
    }

    // Check given number is prime or not
    public static boolean isPrime(int number) {
        if (number < 2)
            return false;
        if (number <= 3)
            return true;
        if (number % 2 == 0 || number % 3 == 0)
            return false;
        return true;
    }

    // Print all factors of a number.
    public static void printAllFactors(int number) {
        int factor = 2;
        while (factor <= number) {
            while (number % factor == 0) {
                System.out.println(factor);
                number /= factor;
            }
            factor++;
        }
    }

    public static int sumOfAllFactors(int number) {
        int sum = 0;
        int factor = 2;
        while (factor <= number) {
            while (number % factor == 0) {
                sum += factor;
                number /= factor;
            }
            factor++;
        }
        return sum;
    }

    // Calculate a power of a number.
    public static int calculatePowerOfANumber(int number, int power) {
        int ans = 1;
        for (int i = 0; i < power; i++) {
            ans *= number;
        }
        return ans;
    }

    // Fibonacci series Generator using loop.
    public static void printFibonacciSeries(int term) {
        int a = 0, b = 1;
        if (term == 1)
            System.out.print(a);
        if (term >= 2)
            System.out.print(a + ", " + b + ", ");
        for (int i = 0; i < term - 2; i++) {
            int c = b;
            b = a + b;
            System.out.print(b + ", ");
            a = c;
        }
    }

    // Find number of integers with exactly x divisors.
    public static int exactXDivisors(int xDivisors, int rangeVal) {
        int noOfDigits = 0;
        if (xDivisors == 1)
            return ++noOfDigits;
        if (xDivisors == 2) {
            for (int i = 2; i <= rangeVal; i++) {
                if (isPrime(i)) {
                    noOfDigits += 1;
                }
            }
            return noOfDigits;
        }
        int count = 0;

        for (int i = 4; i <= rangeVal; i++) {
            for (int j = 1; j <= rangeVal; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == xDivisors) {
                noOfDigits += 1;
            }
            count = 0;
        }

        return noOfDigits;
    }

    // Find prime factors of a number.
    public static void primeFactors(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            while (number % i == 0) {
                number /= i;
                System.out.println(i);
            }
        }
        if (number > 1) {
            System.out.println(number);
        }
    }

    // Sum of even indexed Fibonacci Numbers.
    // public static int sumOfEvenIndexedFibonacci(int lastTerm) {
    // int[] arr = new int[(lastTerm / 2) + 1];
    // int sum = 0;
    // int a = 0, b = 1;
    // if (lastTerm == 1)
    // sum = 0;
    // if (lastTerm >= 2)
    // sum += lastTerm;
    // for (int i = 0; i < lastTerm - 2; i++) {
    // int c = b;
    // b = a + b;
    // System.out.print(b + ", ");
    // a = c;
    // }

    // return sum;
    // }

    // Separate digits of a number.
    public static void separateDigitsOfNumber(int number) {
        while (number >= 1) {
            int lastDigit = number % 10;
            System.out.println(lastDigit);
            number /= 10;
        }
    }

    // Write a program to calculate the sum of all digits of given numbers.
    public static void sumOfAllDigitsOfNumber(int number) {
        int sum = 0;
        while (number >= 1) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        System.out.println(sum);
    }

    // Write a program to print a number in reverse order.
    public static void reverseANumber(int number) {
        int rev = 0;
        while (number >= 1) {
            int lastDigit = number % 10;
            rev = rev * 10 + lastDigit;
            number /= 10;
        }
        System.out.println(rev);
    }

    // Write a program to check number is palindrome or not.
    public static void isPalindromeNumber(int number) {
        int rev = 0;
        int oldVal = number;
        while (number >= 1) {
            int lastDigit = number % 10;
            rev = rev * 10 + lastDigit;
            number /= 10;
        }
        System.out.println(rev == oldVal ? "Palindrome" : "Not Palindrome");
    }

    // Check number is strong or not.
    public static void isStrongNumber(int number) {
        int oldVal = number;
        int sum = 0;
        while (number >= 1) {
            int lastDigit = number % 10;
            int fact = 1;
            for (int i = 2; i <= lastDigit; i++) {
                fact *= i;
            }
            sum += fact;
            number /= 10;
        }
        System.out.println(oldVal == sum ? "Strong" : "Not strong");
    }

    // check given number is automorphic number or not.
    public static void isAutomorphicNumber(int number) {
        int oldVal = number;
        int count = 0;
        while (number >= 1) {
            number /= 10;
            count++;
        }
        int sq = oldVal * oldVal;
        System.out.println(sq % Math.pow(10, count) == oldVal ? "Automorphic" : "Not automorphic");
    }

    // Check a number is harshad (Niven) number or not.
    public static void isHarshadNumber(int number) {
        int oldVal = number;
        int sum = 0;
        while (number >= 1) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        System.out.println(oldVal % sum == 0 ? "Harshad Number" : "Not Harshad");
    }

    // Check if a number is a perfect square.
    // public static boolean isPerfectSquare(int number) {

    // }

    // Abundant number checker.
    public static void isAbundantNumber(int number) {
        int sum = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum > number ? "Abundant" : "Not abundant");

    }

    // Check if a number is neon number.
    public static void isNeonNumber(int number) {
        int sq = number * number;
        int oldVal = number;
        int sum = 0;

        while (sq != 0) {
            int lastDigit = sq % 10;
            sum += lastDigit;
            sq /= 10;
        }
        System.out.println(sum == oldVal ? "Neon" : "Not neon");
    }

    // Validate ISBN number.
    // public static boolean isValidISBN(long number) {
    // if(String.valueOf(number).length() < 10) {
    // return false;
    // }

    // int i = 1;
    // long product = 1;
    // long sum = 0;
    // while (number >= 1) {
    // long lastDigit = number % 10;
    // product = lastDigit * i;
    // sum += product;
    // product = 0;
    // number /= 10;
    // i++;
    // }

    // if(sum % 11 == 0) return true;

    // return false;
    // }

    // Write a program that repeatedly prints 'hello' until the user provides
    // incorrect input using a while loop.
    public static void giveMeIncorrectValue() {
        int num;
        while (true) {
            num = (int) (Math.random() * 10);
            System.out.println("Enter a value between 0 to 9");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            if (num == number) {
                System.out.println("correct answer");
                System.exit(0);
            } else
                System.out.println("hello");
        }
    }

    // Write a program to create a calculator.
    public static void calculator() {

        while (true) {

            System.out.println("Enter two number");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.nextLine();
            System.out.println(
                    "Press + for addition\nPress - for subtraction\nPress * for multiply\nPress / for division\nPress $ to exit");
            char ch = sc.nextLine().charAt(0);

            switch (ch) {
                case '+':
                    System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
                    break;
                case '-':
                    System.out.println("The difference of " + a + " and " + b + " is " + (a - b));
                    break;
                case '*':
                    System.out.println("The product of " + a + " and " + b + " is " + (a * b));
                    break;
                case '/':
                    System.out.println("The quotient of " + a + " and " + b + " is " + (double) (a / b));
                    break;
                case '$':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter numbers and operators only");
                    break;
            }
        }
    }

    // Guess the number using do while loop.
    public static void guessNumberGame() {
        int chances = 0;
        Scanner sc = new Scanner(System.in);
        int hiddenNumber = (int) ((Math.random() * 10) + 1);
        while (chances <= 10) {
            System.out.println("You have " + (10 - chances) + " chances left.");
            System.out.println("Give me a number");
            if (hiddenNumber == sc.nextInt()) {
                System.out.println("Sahi jawab 🎉");
                break;
            } else {
                System.out.println("You lost\nTry again");
                chances++;
            }
        }
    }

    // Right triangle pattern ( alphabets , numbers ).
    public static void rightTrianglePattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Inverted right triangle.
    public static void invertedRightTrianglePattern(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Mirrored right triangle.
    public static void mirroredRightTrianglePattern(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print a Isolated triangle.
    public static void isolatedTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print a V shape pattern.
    public static void printVShape(int rows) {
        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // print X shape pattern.
    public static void printXShape(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == j || i + j == rows + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Print only boundary elements.
    public static void printBoundaryElements(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (j == 1 || j == rows)
                    System.out.print("* ");
                else if (i == 1 || i == rows)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Print I letter
    public static void printI(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i == 1 || i == rows || (j == (rows / 2) + 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            boatDrawing();
        }
    }

    // Draw a boat using pattern programming.
    public static void boatDrawing() {
        int rows = 20, cols = 50;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if ((i == 6 && j > 10 && j < 41) || (i == 10 && j > 10 && j < 41)
                        || ((j == 11 || j == 40) && (i > 5 || i < 11)))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // SOLUTIONS OF ARRAY QUESTIONS
    // Take array size and inputs from the user and find the sum and mean of all
    // array elements.
    public static void sumAndMeanOfArrayElements(int size, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum is " + sum + " and the means is " + (sum / size));
    }

    // Find the greatest element in an array and print its index.
    public static void greatestElementOfArray(int[] arr) {
        int great = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[great]) {
                great = i;
            }
        }
        System.out.println("The greatest element is " + arr[great] + " at index " + great);
    }

    // Write a program to find the second greatest element in an array.
    public static void secondGreatestElement(int[] arr) {
        int firstGreat = Math.max(arr[0], arr[1]);
        int secGreat = Math.min(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstGreat) {
                secGreat = firstGreat;
                firstGreat = arr[i];
            } else if (arr[i] < firstGreat && arr[i] > secGreat) {
                secGreat = arr[i];
            }
        }
        System.out.println("Second greatest element is " + secGreat);
    }

    // Check if array is sorted.
    public static boolean isSortedArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Accept an array nums of size n and make a duplicate array of nums, temp.
    // Print all the elements of temp.
    public static void duplicateArray(int size, int[] arr) {
        int[] temp = new int[size];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        System.out.println(Arrays.toString(temp));
    }

    // Write a program to perform a left rotation on an array by one position.
    public static void leftRotationByOne(int[] arr) {
        int holdVal = arr[0];
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = holdVal;
        System.out.println(Arrays.toString(arr));

    }

    // Write a program to perform a left rotation on an array by a specified number
    // of positions K.
    public static void leftRotationByKElements(int[] arr, int k) {
        int size = arr.length;
        if (k > size) {
            k %= size;
        }
        while (k-- > 0) {
            int firstVal = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[size - 1] = firstVal;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Write a program to reverse an array without using any additional space.
    public static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            int holdVal = arr[i];
            arr[i++] = arr[j];
            arr[j--] = holdVal;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Write a program to accept an array and a key. Print the index if found in an array else print -1 using linear search.
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if ( key == arr[i]) {
                return i;
            }   
        }
        return -1;
    }

    // Write a program to accept an array and a key. Print the index if found in an array else print -1 Using binary search.
    public static int binarySearch(int[] arr, int key) {
        int size = arr.length;
        int st = 0, end = size - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if(key == arr[mid]) return mid;
            if(key > arr[mid]) {
                st = mid + 1;
            }else {
                end = mid - 1;
            }

        }
        return -1;
    }

    

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println(binarySearch(arr, 5));
    }
}
