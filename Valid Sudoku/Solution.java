import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {

    	for(int i=0; i<board.length; ++i){
    		boolean row = checkRow(board, i);
    		boolean col = checkColumn(board, i);
    		if(!row || !col)
    			return false;
    	}
        return true;
    }


    public boolean checkRow(char[][] board, int row){
    	HashSet<Character> checker = new HashSet<Character>();
    	for(int i=0; i<board[row].length; ++i){
    		if(checker.contains(board[row][i])){
    			return false;
    		}
            if(board[i][row] != '.')
    		    checker.add(board[row][i]);
    	}
    	return true;
    }

    public boolean checkColumn(char[][] board, int col){
    	HashSet<Character> checker = new HashSet<Character>();
    	for(int i=0; i<board.length; ++i){
    		if(checker.contains(board[i][col])){
    			return false;
    		}
            if(board[i][col] != '.')
    		    checker.add(board[i][col]);
    	}
    	return true;
    }

}