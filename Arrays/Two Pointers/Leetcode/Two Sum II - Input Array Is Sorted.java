//Day3-->Array Techniques(Two Pointers)
//Leetcode Problem Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

--> Problem
Given a 1-indexed sorted array numbers of integers, find two numbers such that they add up to a specific target.
Return the indices (1-based) of the two numbers.
-->Two Pointer Approach
==>Idea
*Since the array is sorted, we can use two pointers to find the required pair efficiently.
*Start one pointer at the beginning of the array.
*Start another pointer at the end of the array.
*Calculate the sum of the elements at these two pointers.
==>Logic
*If the sum equals the target, return their 1-based indices.
*If the sum is greater than the target, move the right pointer left to decrease the sum.
*If the sum is smaller than the target, move the left pointer right to increase the sum.
*This continues until the pair is found.

###################################################################################################################
Java Implementataion:

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            if(nums[low]+nums[high]==target){
                return new int[]{low+1,high+1};
            }
            else if(nums[low]+nums[high]>target){
                high=high-1;
            }
            else{
                low=low+1;
            }
        }
       return new int[]{-1,-1};
    }
}

#####################################################################################################################

| Type             | Complexity |
| ---------------- | ---------- |
| Time Complexity  |   O(n)     |
| Space Complexity |   O(1)     |
