class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> cols = new ArrayList<Integer>();
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(rows.contains(i)){
                    matrix[i][j] = 0;
                }
                if(cols.contains(j))
                    matrix[i][j] = 0;
            }
        }
        
    }
}