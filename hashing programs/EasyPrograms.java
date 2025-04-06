import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EasyPrograms {

    // Simple hashing programs
    // L1. Two sum.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[] { i, map.get(comp) };
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] { 1, 1 };
    }

    // L771. Jewels and Stones
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            set.add(ch);
        }
        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (set.contains(ch)) {
                count++;
            }
        }
        return count;
    }

    // L1832. Check if the sentence is pangram.
    public static boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            set.add(c);
        }
        if (set.size() == 26) {
            return true;
        }
        return false;
    }

    // L1748. Sum of unique elements.
    public static int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (map.containsKey(nums[i])) {
                count++;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1)
                sum += (e.getKey());
        }
        return sum;
    }

    

    public static void main(String[] args) {

    }
}