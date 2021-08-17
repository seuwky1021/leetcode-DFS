package jihe;

import java.util.HashMap;

public class HashMap_twoSum {
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> HashTable=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(HashTable.containsKey(target-nums[i])){
                return new int[]{HashTable.get(target-nums[i]),i};

            }
            HashTable.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] s={2,7,11,15};
        int[] sum=twoSum(s,18);
        System.out.println(sum[0]+" "+sum[1]);
    }


}



