import java.util.Arrays;

/**
 * @author simple_huang@foxmail.com on 2018/3/16.
 */
public class TwoSum {
    /**
     Given an array of integers, return indices of the two numbers such that they add up to a specific target.

     You may assume that each input would have exactly one solution, and you may not use the same element twice.

     Example:
     Given nums = [2, 7, 11, 15], target = 9,

     Because nums[0] + nums[1] = 2 + 7 = 9,
     return [0, 1].
     */
    /**
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    System.out.println(nums[i] + " " + nums[j]);
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no solution");
    }

    public static void main(String[] args) {

    }
}
