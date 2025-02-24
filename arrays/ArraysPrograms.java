import java.util.Arrays;

public class ArraysPrograms {

    // The sum and the mean
    public void SumAndMean(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of array elements is " + sum + " and the mean is " + (sum / n));
    }

    // Find the index of greatest element
    public void FindIndex(int[] arr) {

        int great = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[great]) {
                great = i;
            }
        }
        System.out.println("The greatest element is " + arr[great] + " at index " + great);
    }

    // Find the second greatest element
    public void SecondGreatElement(int[] arr) {

        int great = Math.max(arr[0], arr[1]);
        int secGreat = Math.min(arr[0], arr[1]);

        System.out.println(arr.length);
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > great) {
                int temp = great;
                great = arr[i];
                secGreat = temp;
            } else if (arr[i] > secGreat && arr[i] < great) {
                secGreat = arr[i];
            }
        }
        System.out.println("The second greatest element is " + secGreat);
    }

    // Check the array is sorted or not
    public boolean isSorted(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }

        return true;
    }

    // Copy the array using another array
    public int[] deepCopy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }

    // Copy the array with reverse order
    public int[] deepCopyJReverse(int[] arr) {
        int n = arr.length;
        int[] copy = new int[n];
        for (int i = 0; i < n; i++) {
            copy[i] = arr[n - 1 - i];
        }
        return copy;
    }

    // Array left rotation by one
    public int[] LeftRotationOneTime(int[] arr) {
        int size = arr.length;
        int firstInd = arr[0];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = firstInd;
        return arr;
    }

    // Array left rotation by K
    public int[] LeftRotationKTime(int[] arr, int k) {
        int size = arr.length;
        k = k % size;
        for (int i = 0; i < k; i++) {
            int firstInd = arr[0];
            for (int j = 0; j < size - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[size - 1] = firstInd;
        }
        return arr;
    }

    // Reverse an array without extra space
    public int[] twoPointerReverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i++] = arr[j];
            arr[j--] = temp;
        }
        return arr;
    }

    // Binary search in an array
    public String binarySearch(int[] arr, int key) {
        if (isSorted(arr)) {
            int start = 0, end = arr.length - 1;
            for (int i = 0; i < arr.length; i++) {
                int mid = start + end;
                if (arr[mid] == key) {
                    return key + " is available on index " + mid;
                }
                if (arr[mid] > key) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return "Sort your array first or if array is sort then provide valid key";
    }

    // Move zeros as the end without using extra space.
    public int[] moveZeroAtLast(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 1)
                i++;
            if (arr[j] == 0)
                j--;
            if (arr[i] == 0 && arr[j] == 1) {
                int temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        return arr;
    }

    // Sort an array using bubble sort
    public int[] bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    // Concatenate array
    public int[] ConcatenateArray(int[] arr, int size) {

        int[] concatArr = new int[2 * size];
        for (int i = 0; i < arr.length; i++) {
            concatArr[i] = arr[i];
            concatArr[size + i] = arr[i];
        }
        return concatArr;
    }

    // find the length of the array
    public int findLength(int[] arr) {
        int length = 0;
        for (int i : arr) {
            length++;
        }

        return length;
    }


    public static void main(String[] args) {
        
        ArraysPrograms use = new ArraysPrograms();
        int[] arr = new int[]{7,4,6,1,8,5};

        System.out.println(use.findLength(arr));

    }
    
}