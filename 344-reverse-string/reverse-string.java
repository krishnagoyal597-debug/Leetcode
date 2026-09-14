class Solution {
    public void reverseString(char[] s) {
        char[] ans = new char[s.length] ;
        int n = s.length ; 
        for(int i = 0; i< n; i++){
            ans[i] = s[n-i-1]; 
        } for (int i = 0; i < n; i++) {
            s[i] = ans[i];
        } 
    }
}