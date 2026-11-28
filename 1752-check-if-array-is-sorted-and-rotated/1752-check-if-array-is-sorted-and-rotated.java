class Solution {
    public boolean check(int[] nums) {
        return sort(nums, 0, 0);
    }

    public boolean sort(int[] arr, int index, int count) {

        // Base condition
        if(index == arr.length) {
            return count <= 1;
        }

        // Check current and next element (circular)
        if(arr[index] > arr[(index + 1) % arr.length]) {
            count++;
        }

        if(count > 1) return false;

        return sort(arr, index + 1, count);
    }
}