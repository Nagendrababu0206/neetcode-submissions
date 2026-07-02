class Solution {
    public int singleNumber(int[] nums) {
        int i;
        int val=0;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
val=val^nums[i];
        }
        return val;
    }
}
