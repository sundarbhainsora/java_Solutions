
/* 
LeetCode Problem 136. Single Number

*/
class Solution {
    public int singleNumber(int[] nums) {
        int value=0;
        for(int i=0;i<nums.length;i++){
            value=value^nums[i]; //XOR oprator it give zero value if both bits are same
        }return value;
    }
}
