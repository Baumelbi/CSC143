package csc143.sudoku;

public class SudokuModel extends SudokuCore {
    
    public SudokuModel(int r, int c) {
        super(r, c);
    }
    
    public State getRowState(int n) { 
        return State.INCOMPLETE; 
    }
    
    public State getColumnState(int n) { 
        return State.COMPLETE; 
    }
    
    public State getRegionState(int n) { 
        return State.ERROR; 
    }
    
}