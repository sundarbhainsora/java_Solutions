/**
 * leetcode problem 53. Maximum Subarray
 * Created by SundarBhainsora
 */

//here we uae kadane's algorithm  which is a dynamic programming technique used to find the maximum subarray sum within a given array of numbers.
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int curSum=0;
        for(int i=0;i<nums.length;i++){
            curSum +=nums[i];
            if(curSum>maxSum){
                maxSum=curSum;

            }
             if(curSum<0){
                curSum=0;
            }
            
        }return maxSum;
    }
}
