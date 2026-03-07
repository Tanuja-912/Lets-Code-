//Day1-->Basic Math in java to have an idea on fundamentals
//Lets Reverse a number
//Leetcode Problem Link: https://leetcode.com/problems/reverse-integer/
//Approach: Digit by Digit Reversal (Iterative)


class Solution {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int d = x % 10;
            x = x / 10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev * 10 + d;
        }
        return rev;
    }
}
