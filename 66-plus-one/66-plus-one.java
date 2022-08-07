class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int [] result = new int [length];
        
        int carry = 0;
        int add = 1;


        for(int idx = length - 1; idx >= 0; idx--) {
            int current = digits[idx] + carry + add;
            if(current > 9) {
                current -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            result[idx] = current;
            add = 0;           
        }
        
        
        if(carry == 1) {
            int [] temp = new int [result.length + 1];
            temp[0] = 1;
            for(int idx = 1; idx < temp.length; idx ++) {
                temp[idx] = result[idx-1];
            }
            return temp;
            
        }
        
        return result;

    }
}