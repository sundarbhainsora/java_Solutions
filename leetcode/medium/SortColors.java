/* we can use the Dutch National Flag algorithm . This algorithm is efficient and sorts the array in-place with a single pass.
 leetcode problem 75. Sort Colors.
Created by SundarBhainsora
*/
class Solution {
    public void sortColors(int[] nums) {
       int low =0;
       int mid=0;
       int high=nums.length-1;
       while (mid<=high){
        if(nums[mid]==0){
            int temp=nums[low];
            nums[low]=nums[mid];
            nums[mid]=temp;
            low++;
            mid++;
        }else if(nums[mid]==1){
            mid++;
        }else{
             int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
        }
       }
    }
}
