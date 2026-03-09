//Day 3 – Remove Duplicates from Sorted Array (Two Pointer Technique)
// Problem
//Given a **sorted array**  arr, remove the duplicate elements and return the array containing **only unique elements**.
//The relative order of elements should remain the same.

###########################################################################################################################

// Approach – Two Pointer Technique

// Since the array is **already sorted**, duplicate elements will appear **next to each other**.  
// We can use the **two pointer technique** to keep track of unique elements.

// **** Steps

// 1. Create a result list to store unique elements.
// 2. Initialize a pointer `i = 1` to track the position of the next unique element.
// 3. Traverse the array using pointer `j`.
// 4. Compare the current element with the previous unique element:
//    - If they are **different**, place the element at index `i` and increment `i`.
// 5. After processing the array, copy the first `i` elements into the result list.

##########################################################################################################################

//Java Implementation

import java.util.*;
class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        int i = 1;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i-1]){
                arr[i] = arr[j];
                i++;
            }
        }
        for(int k = 0; k < i; k++){
            res.add(arr[k]);
        }
        return res;
    }

  #######################################################################################################################


// | Type             | Complexity                 |
// | ---------------- | -------------------------- |
// | Time Complexity  |   O(n)                     |
// | Space Complexity |   O(k)   (for result list) |


  
}
