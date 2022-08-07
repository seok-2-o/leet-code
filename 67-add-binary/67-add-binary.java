class Solution {
    public String addBinary(String a, String b) {
        if(a.length() > b.length()) {
            b = "0".repeat(a.length() - b.length()) + b;
        } else {
            a = "0".repeat(b.length() - a.length()) + a; 
        }
        
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int idx = a.length()-1; idx >= 0; idx --) {
            carry += ( a.charAt(idx) - '0' ) + ( b.charAt(idx) - '0' );
            sb.append(carry % 2);
            carry /= 2;
        }
        
        if(carry != 0) {
            sb.append(1);
        }
        
        return sb.reverse().toString();
    }
    
}