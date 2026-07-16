class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int i = 0;
        int j = rows*columns - 1;
        while( i <= j){
            int mid = (i+j)/2;
            int row = mid/columns;
            int col = mid%columns;
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return false;
    }
}
