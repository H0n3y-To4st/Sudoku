public class MainLogic{
    
    public static void main(String[] args) {
        
    }

    //Use the backtracking algorithm - keep trying different possibilities until a valid solution is find
    //matix traversal with recursion - check row and column

    public static boolean isValid(int[][] grid, int row, int col, int input){

        return true;
    }

    public static void solve(int row, int col){

        //check for out of bounds on col
        //check for out of bounds on row = grid complete

        if(col == grid[row].length){

        }

        for(int i = 1; i <= 9; i++){
            grid[row][col] = i;
            if(isValid(grid,row,col,input)){
                if(solve(row, col + 1, grid)){
                    return true;
                }
            }
        }
        grid[row][col] = 0; //change this
    }
}