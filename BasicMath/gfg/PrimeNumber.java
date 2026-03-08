//Day2-->Basic Math in java to have an idea on fundamentals
//Lets check a number is prime or not 
//GreeksForGreeks Code Link: https://www.geeksforgeeks.org/problems/prime-number2314/1
// Approach:
// Check if the number is divisible by any number from 2 to √n.
// If divisible, it is not prime.
// If no divisor is found, the number is prime.


//code
class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

//Time Complexity: O(sqrt(n))
//Space Complexity : O(1)
