class Solution {

    String getBinary(int number) {

        String binary = "";
        while(number > 0) {
            int remainder = number % 2;
            binary = remainder + binary;
            number /= 2;
        }

        return binary;
    } 

    int getNumberOfOnes(String number){

        int numberOfOnes = 0;
        for(int i=0;i<number.length();i++){
            if(number.charAt(i) == '1') {
                numberOfOnes++;
            }
        }

        return numberOfOnes;
    }

    public int[] countBits(int n) {
        
        int arr[] = new int[n+1];
        for(int i=0;i<=n;i++) {
            String binary = getBinary(i);
            arr[i] = getNumberOfOnes(binary);
        }
        return arr;
    }
}