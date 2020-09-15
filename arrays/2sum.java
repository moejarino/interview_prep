import java.util.*;

// Given an array of integers, return whether or not two numbers sum to a given target, k.
// Note: you may not sum a number with itself.

class twosum {
    public static void main(String[] args)
    {
        int[] input = {12, 3, 1, 2, -6, 5, -8, 6};
        int k = 4;
        twoSum(input, k);

    }

    //Time O(N) | Space O(N)
    public static List<int[]> twoSum(int[] nums, int k) {

        List<Integer[]> pairs = new ArrayList<Integer[]>();

        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int leftNum = nums[left];
            int rightNum = nums[right];

            if (leftNum + rightNum == k) {
                Integer[] pair = {leftNum, rightNum};
                //System.out.println(Arrays.toString(pair));
                pairs.add(pair);
                left++;
                right--;
            } else if (leftNum + rightNum < k)
                left++;
            else {
                right--;
            }
        }
        return pairs;
        }
    }
