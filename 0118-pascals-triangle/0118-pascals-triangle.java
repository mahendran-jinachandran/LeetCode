class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int i = 0 ; i < numRows; i++) {
            ArrayList<Integer> innerList = new ArrayList<Integer>();

            for(int j = 0 ; j < i + 1 ; j++) {
                
                if(j == 0 || j == i) {
                    innerList.add(1);
                    continue;
                }

                List<Integer> previousList = pascalTriangle.get(i-1);
                int values =  previousList.get(j-1) + previousList.get(j);
                innerList.add(values);
            } 

            pascalTriangle.add(innerList);
        }

        return pascalTriangle;
    }
}