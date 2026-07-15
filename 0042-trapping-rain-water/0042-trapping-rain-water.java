class Solution {
    public int trap(int[] h) {
        int l=0;
        int r=h.length-1;
        int ans=0;
        int lmax=h[l];
        int rmax=h[r];

        while(l<r) {
            if(lmax<rmax) {
                l++;
                lmax=Math.max(lmax,h[l]);
                ans += lmax-h[l];
            } else {
                r--;
                rmax=Math.max(rmax,h[r]);
                ans += rmax-h[r];
            }
        }
        return ans;
    }
}