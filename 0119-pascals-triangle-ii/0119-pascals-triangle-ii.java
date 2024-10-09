class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for(int i = 0 ; i < rowIndex + 1; i++) {
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

        return pascalTriangle.get(rowIndex);
    }
}