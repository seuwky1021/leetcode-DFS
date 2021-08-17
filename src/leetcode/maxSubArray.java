package leetcode;

class Solution {
    public int maxSubArray(int[] nums) {
        int maxAns=nums[0];
        int pre=0;
        int length=nums.length;
        for(int i=0;i<length;i++){
            pre=Math.max(nums[i],pre+nums[i]);
            maxAns=Math.max(maxAns,pre);
        }
        return maxAns;
    }

    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));
    }
}