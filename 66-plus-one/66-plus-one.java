class Solution {
    public int[] plusOne(int[] digits) {

        int length = digits.length;
        int carry = 1;

        for(int idx = length - 1; idx >= 0; idx--) {
            digits[idx] =  (digits[idx] + carry) % 10;
            if(digits[idx] != 0) {
                carry = 0;
                break;
            }    
        }
        
        if(carry == 1) {
            digits = new int [digits.length + 1];
            digits[0] = 1;
        }
        
        return digits;

    }
}