class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int totalSum=0;
        for(int num: nums) {
            totalSum +=num;
        }
        return expectedSum-totalSum;
    }
}