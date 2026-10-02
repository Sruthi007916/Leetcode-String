class Solution {
    public boolean isPalindrome(String s) {
        String a=s.toLowerCase();
        String c="";
        for(int i=0;i<a.length();i++){
            char d=a.charAt(i);
            if(Character.isLetterOrDigit(d)){
                c=c+d;
            }
        }
        String y="";
        for(int i=c.length-1;i>=0;i++){
            y=y+charAt(i);
        }
        return y.equals(a);
    }
}
