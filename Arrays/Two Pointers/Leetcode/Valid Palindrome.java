//Day 5 – Valid Palindrome (Two Pointer Technique)
// Problem
//Given a string `s`, determine if it is a **palindrome**, considering only **alphanumeric characters** and ignoring **cases**.
//A string is a palindrome if it reads the same **forward and backward**.

// LeetCode Problem Link:  
// https://leetcode.com/problems/valid-palindrome/

// ___________________________________________________________________________________________________________________________________

// ## Constraints
// - Ignore **spaces and special characters**
// - Comparison should be **case-insensitive**
// - Only **letters and digits** should be considered

// ____________________________________________________________________________________________________________________________________

// ## Approach – Two Pointer Technique

// 1. Initialize two pointers:
//    - `i = 0` (start of the string)
//    - `j = n - 1` (end of the string)

// 2. Skip non-alphanumeric characters:
//    - Move `i` forward until a **letter or digit** is found
//    - Move `j` backward until a **letter or digit** is found

// 3. Compare characters:
//    - Convert both characters to **lowercase**
//    - If they are not equal → return `false`

// 4. Move pointers inward:
//    - `i++`
//    - `j--`

// 5. Continue until pointers meet.

// ____________________________________________________________________________________________________________________________________

//Implementation

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}


// ____________________________________________________________________________________________________________________________


//| Type             | Complexity |
//| ---------------- | ---------- |
//| Time Complexity  |   O(n)     |
//| Space Complexity |   O(1)     |
