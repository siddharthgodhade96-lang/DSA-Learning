class Solution {
    public boolean canJump(int[] nums) {
       int n =nums.length;
        int maxFind=0;
        for(int i=0;i<n;i++) {
            if(i > maxFind) return false;
            else {
                maxFind = Math.max(maxFind,nums[i]+i);
                }
        }
        return true;       
    }
}