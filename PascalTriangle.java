class PascalTriangle {
    private int rows, pascal[][];
    public PascalTriangle(int rows){
        this.rows = rows;
        pascal = new int[rows][];
        for (int i = 0; i < rows; i++) {
            pascal[i] = new int[i + 1];
        }
        generatePascalTriangle();
    }

    public String toString(){
        String output="";
        for (int row = 0; row < pascal.length; row++) {
            for( int tab=1; tab<rows-row; tab++){
                output+="\t";
            }
            for (int col = 0; col < pascal[row].length; col++) {
                output+=pascal[row][col] + "\t\t";
            }
            output+="\n";
        }
        return output;
    }
    public int[][] generatePascalTriangle() {
        for (int row = 0; row < pascal.length; row++) {
            pascal[row][0] = pascal[row][row] = 1;
            if(row<2) continue;
            for(int col=1; col<pascal[row].length-1;col++){
                pascal[row][col]=pascal[row-1][col-1]+pascal[row-1][col];
            }
        }  
        return pascal;
    }
}