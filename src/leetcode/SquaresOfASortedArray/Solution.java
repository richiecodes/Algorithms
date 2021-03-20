package leetcode.SquaresOfASortedArray;

import com.richiecodes.util.Console;

import java.util.Arrays;

public class Solution {

    public static int[] sortedSquares(int[] nums) {
        int[] newArr = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i] * nums[i];
        }

        Arrays.sort(newArr);

        return newArr;
    }

    public static void main(String[] args) {
        int[] in = {-7, -3, 2, 3, 11};
        int[] out = sortedSquares(in);

        System.out.printf("\n\nInput: %s\n\n\nOutput: %s", Arrays.toString(in), Arrays.toString(out));
    }
}
