// ===================================================
// 🛡️                LeetCode Problem 1: Two Sum                🛡️
// ===================================================
//
// Author: Divyansh Jindal
// GitHub: https://github.com/DevDivyanshJindal
//
// Section 1: Local Testing
// This code is intended for use on your PC or laptop 
// using VS Code or any code editor of your choice. 
// Ensure that the file name matches the class name for 
// proper execution and testing.

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                return new int[] { map.get(numbers[i]), i }; 
            }
            map.put(target - numbers[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solution.twoSum(numbers, target);
        
        System.out.println("index1=" + result[0] + ", index2=" + result[1]);
    }
} // Make sure this closing brace matches the class definition

// Section 2: LeetCode
// Uncomment the specified lines below when submitting 
// to LeetCode. Ensure the solution meets LeetCode's 
// input and output requirements for optimal performance.
//
// import java.util.HashMap;
// import java.util.Map;
//
// public class Solution {
//     public int[] twoSum(int[] numbers, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < numbers.length; i++) {
//             if (map.containsKey(numbers[i])) {
//                 return new int[] { map.get(numbers[i]), i }; // 0-based index
//             }
//             map.put(target - numbers[i], i);
//         }
//         throw new IllegalArgumentException("No two sum solution");
//     }
//
//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int[] numbers = {2, 7, 11, 15};
//         int target = 9;
//         
//         int[] result = sol.twoSum(numbers, target);
//         
//         System.out.println("index1=" + result[0] + ", index2=" + result[1]);
//     }
// }
