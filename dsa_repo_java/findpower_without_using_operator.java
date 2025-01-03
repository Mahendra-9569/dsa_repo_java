package dsa_repo_java;

public class findpower_without_using_operator {

    
        // Method to multiply two numbers using bit manipulation
        public static int multiply(int a, int b) {
            int result = 0;
            boolean isNegative = false;
    
            // Handle negative numbers
            if (a < 0 && b > 0 || a > 0 && b < 0) {
                isNegative = true;
            }
    
            a = Math.abs(a);
            b = Math.abs(b);
    
            while (b > 0) {
                // If the least significant bit of b is 1, add a to the result
                if ((b & 1) == 1) {
                    result += a;
                }
    
                // Double the value of a (equivalent to a * 2) and halve b
                a <<= 1;  // Left shift a
                b >>= 1;  // Right shift b
            }
    
            return isNegative ? -result : result;
        }
    
        // Method to calculate power using bit manipulation
        public static int power(int base, int exponent) {
            if (exponent == 0) {
                return 1;
            }
    
            int result = 1;
            int currentBase = base;
    
            while (exponent > 0) {
                // If the least significant bit of the exponent is 1
                if ((exponent & 1) == 1) {
                    result = multiply(result, currentBase);
                }
    
                // Square the base (currentBase = currentBase * currentBase)
                currentBase = multiply(currentBase, currentBase);
    
                // Right shift the exponent (divide by 2)
                exponent >>= 1;
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int base = 2;
            int exponent = 10;
    
            int result = power(base, exponent);
            System.out.println(base + " raised to the power of " + exponent + " is: " + result);
        }
        

    }
    

