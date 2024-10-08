class Solution {
    public int lengthOfLastWord(String s) {
        
        boolean isCharacterMet = false;
        int count = 0;
        for(int i = s.length() - 1; i >= 0 ;i--) {
            char character = (char)s.charAt(i);

            if(character != ' ') {
                isCharacterMet = true;
            }

            if(isCharacterMet && character == ' ') {
                return count;
            }

            if(isCharacterMet) {
                count++;
            }
        }

        return count;
    }
}