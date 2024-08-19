/*
leetcode problem 2433. Find The Original Array of Prefix Xor
created by sundar bhainsora.
*/
class Solution {
    public int[] findArray(int[] pref) {
        int n=pref.length;
        int arr[]=new int[n];
        arr[0]=pref[0];
        for(int i=1;i<n;i++){
         arr[i]=pref[i]^pref[i-1];
        }return arr;
    }
}

         /* one more way to solve this question 
         int n=pref.length;
       for(int i=n-1;i>0;i--){
        pref[i]=pref[i]^pref[i-1];
       } return pref;
    }
}
*/
