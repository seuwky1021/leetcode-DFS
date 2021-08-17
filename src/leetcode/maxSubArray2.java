package leetcode;

public class maxSubArray2 {
    public int maxSubArray2(int[] nums){
        int maxAns=nums[0];
        int pre=0;
        int length=nums.length;
        for(int x:nums){
            pre=Math.max(x,pre+x);
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
