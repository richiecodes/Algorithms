package leetcode.FindNumbersWithEvenNumberOfDigits;

import com.richiecodes.util.Console;

import java.util.Arrays;

public class Solution {

    public static int findNumbers(int[] nums) {
        int output = 0;

        for(var num : nums) {
            if(String.valueOf(num).length() % 2 == 0) {
                output += 1;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        int[] in = Console.getArray();
        int ans = findNumbers(in);

        System.out.printf("\n\nInput: %s\n\n\nOutput: %s\n\n", Arrays.toString(in), ans);
    }
}
