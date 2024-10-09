class Solution {

    String addZeroPrefix(String number, int numberOfZeroes) {
        String newNumber = number;
        for(int i=0; i < numberOfZeroes; i++) {
            newNumber = "0" + newNumber;
        }

        return newNumber;
    }

    public String addBinary(String a, String b) {
        
        int aLength = a.length();
        int bLength = b.length();

        if(aLength < bLength) {
            a = addZeroPrefix(a, bLength - aLength);
        } else if (aLength > bLength) {
            b = addZeroPrefix(b, aLength - bLength);
        }

        int remainder = 0;
        String finalString = "";
        for(int i = a.length() - 1; i >= 0; i--) {
            int aNumber = a.charAt(i) - '0';
            int bNumber = b.charAt(i) - '0';

            int total = aNumber + bNumber + remainder;
            if(total % 2 != 0 && (aNumber != 1 || bNumber != 1)) {
                remainder = 0;
            } else if (total % 2 == 0 && (aNumber == 0 && bNumber == 0)) {
                remainder = 0;
            } else {
                remainder = 1;
            }

            finalString = Integer.toString(total%2) + finalString;
        }

        if(remainder == 1 && !finalString.isEmpty()) {
            finalString = "1" + finalString;
        }

        return finalString;
    }
}