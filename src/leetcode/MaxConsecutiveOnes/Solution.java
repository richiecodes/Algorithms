package leetcode.MaxConsecutiveOnes;

import com.richiecodes.util.Console;

import java.util.Arrays;

public class Solution {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int consecutives = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 1) {
                consecutives += 1;
                count = Math.max(count, consecutives);
            } else {
                consecutives = 0;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] in = Console.getArray();
        int ans = findMaxConsecutiveOnes(in);

        System.out.printf("\n\n\nInput array: %s\n\nOutput: %s", Arrays.toString(in), ans);
    }
}
