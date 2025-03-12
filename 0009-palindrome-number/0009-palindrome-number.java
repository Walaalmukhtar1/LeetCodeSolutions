class Solution {
    
    public boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        
        return palindrome(a);
    }

    public static boolean palindrome(String num) {
        String jInt = "";
        String iInt = "";
        
        for (int j = num.length() - 1; j >= 0; j--) {
            jInt += num.charAt(j);
        }
        
        for (int i = 0; i < num.length(); i++) {
            iInt += num.charAt(i);
        }

        if (iInt.equals(jInt)) {
            return true;
        } else {
            return false;
        }
    }
}
