class Solution {

    public boolean isMatching(char firstItem,char secondItem) {
        return (firstItem == '(' && secondItem == ')') ||
               (firstItem == '{' && secondItem == '}') ||
               (firstItem == '[' && secondItem == ']');
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char character: s.toCharArray()) { 

            if(character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else {

                if(stack.isEmpty()) {
                     return false; 
                }

                char firstItem = stack.pop();
                if(!isMatching(firstItem, character)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}