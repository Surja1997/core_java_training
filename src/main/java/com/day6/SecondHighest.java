package com.day6;

public class SecondHighest {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 6, 7, 1, 3, 9, 11, 10};
        int a=nums[0],b=nums[0];
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]>b)
            {

                b=nums[i];
            }
        }
        for (int i=0;i<nums.length;i++)
            if (nums[i] > a && nums[i] != b) {

                a = nums[i];
            }
        System.out.println("The second largest element is "+a);
    }
}
