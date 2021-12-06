class Solution {
    public boolean isPalindrome(String s) {
        String str = removeNonAlNum(s.toLowerCase());
        String rev = new String();
        
        for (int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        
        return str.equals(rev);
    }
    
    private static String removeNonAlNum(String str)
    {
        String target = new String();
        
        for (int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')
                target += ch;
        }
        
        return target;
    }
}