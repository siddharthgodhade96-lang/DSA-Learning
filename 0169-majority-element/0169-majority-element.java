class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int major=nums[0];
        int majorCount= 0;

        for(int i=0;i<n;i++) {
            if(majorCount == 0) {
                major=nums[i];
            }
            if(major == nums[i]){
                majorCount++;
            } else {
                majorCount--;
            }
        }
        return major;
    }
}