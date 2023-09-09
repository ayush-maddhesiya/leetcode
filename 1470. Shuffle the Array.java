class Solution {
    public int[] shuffle(int[] nums, int n) {
     int[] ans = new int[2*n];
     int j = 0;
     int i = 0;
     while( i < 2*n){
         ans[i++] = nums[j];
         ans[i++] = nums[j+n];
         j++;
     }  
     return ans;
    }
}
