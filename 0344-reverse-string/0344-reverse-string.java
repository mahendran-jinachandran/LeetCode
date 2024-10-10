class Solution {
    public void reverseString(char[] s) {
        
        int start = 0;
        int end = s.length - 1;

        while(start < end) {
            char swap = s[end];
            s[end] = s[start];
            s[start] = swap;
            start++;
            end--; 
        }
    }
}