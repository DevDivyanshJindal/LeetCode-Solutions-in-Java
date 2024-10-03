import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return new int[] { map.get(numbers[i]), i }; // 0-based index
            }
            map.put(target - numbers[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = sol.twoSum(numbers, target);
        
        System.out.println("index1=" + result[0] + ", index2=" + result[1]);
    }
}
