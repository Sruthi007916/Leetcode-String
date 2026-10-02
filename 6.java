class Solution {
    public String convert(String s, int numRows) {
        
        String[] b = new String[numRows];
        
        for (int i = 0; i < b.length; i++) {
            b[i] = "";
        }
        
        int cr = 0;
        boolean g = false;
        
        for (char ch : s.toCharArray()) {
            b[cr] += ch;
            
            if (cr == 0 || cr == numRows - 1) {
                g = !g;
            }
            
            cr += g ? 1 : -1;
        }
        
        String c = "";
        
        for (String d : b) {
            c = c + d;
        }
        
        return c;
    }
}
