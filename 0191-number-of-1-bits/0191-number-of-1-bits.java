class Solution {

    String convertToBinary(int number) {

        String binary = "";
        while(number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number = number / 2;
        }

        return binary;
    }

    public int hammingWeight(int n) {
        
        String binaryNumber = convertToBinary(n);
       
        int numberOfOnes = 0;
        for(int i=0; i<binaryNumber.length();i++) {
            if(binaryNumber.charAt(i) == '1') {
                numberOfOnes++;
            }
        }

        return numberOfOnes;
    }
}