package com.leetcode.array.medium;

public class RearrangeArrayElementsBySign {

    public static int[] rearrangeArray(int[] nums) {
        int[] array2=new int[nums.length];
        int pos=0;
        int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                array2[pos]=nums[i];
                pos=pos+2;
            }
            else{
                array2[neg]=nums[i];
                neg=neg+2;
            }

        }
        return array2;
    }

}
