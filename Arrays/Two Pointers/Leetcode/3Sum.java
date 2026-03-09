# Day 3 – 3Sum (Two Pointer Technique)
## Problem
Given an integer array nums, return all the **unique triplets** [nums[i], nums[j], nums[k]] such that:
nums[i] + nums[j] + nums[k] == 0
The solution set must **not contain duplicate triplets**.
LeetCode Problem Link:  
https://leetcode.com/problems/3sum/

-------------------------------

## Constraints
- 3 ≤ nums.length
- The solution must contain **only unique triplets**
- Array may contain **negative numbers, zeros, and positive numbers**

-------------------------------

## Approach

*** Step 1: Sort the Array
Sorting helps in:
- Using the **two pointer technique**
- Easily skipping **duplicate elements**

*** Step 2: Fix One Element
Iterate through the array and treat each element as the **first element** of the triplet.

Skip duplicates to avoid repeated triplets.

*** Step 3: Apply Two Pointers
For each element:
left = i + 1  
right = n - 1  
Calculate the sum:
sum = nums[i] + nums[left] + nums[right]
*** Step 4: Compare the Sum
- If **sum == 0** → add triplet to result
- If **sum < 0** → move left pointer forward
- If **sum > 0** → move right pointer backward

*** Step 5: Skip Duplicate Values
Move pointers until new values appear to ensure **unique triplets**.

---------------------------------

## Java Implementation

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l - 1]) l++;
                    while(l < r && nums[r] == nums[r + 1]) r--;
                }
                else if(sum < 0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return res;
    }


-------------------------------


| Type             | Complexity                       |
| ---------------- | -------------------------------- |
| Time Complexity  |   O(n²)                          |
| Space Complexity |   O(1)   (excluding result list) |







}
