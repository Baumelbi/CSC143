package csc143.sudoku;

public class SudokuModel extends SudokuCore {

    public SudokuModel(int r, int c) {
        super(r, c);
    }

    public State getRowState(int n) {
        int temp = 0;
        for (int i = 0; i < this.getSize(); i++) {
            temp = this.getValue(n, i);
            for (int j = 1; j < this.getSize(); j++) {
                if (temp == this.getValue(n, j)) {
                    return State.ERROR;
                }
            }
        }
        for (int i = 0; i < this.getSize(); i++) {

            if (this.getValue(n, i) == 0) {
                return State.INCOMPLETE;
            }

        }
        return State.COMPLETE;
    }

    public State getColumnState(int n) {
        int temp = 0;

        for (int i = 0; i < this.getSize(); i++) {
            temp = this.getValue(i, n);
            for (int j = 1; j < this.getSize(); j++) {
                if (temp == this.getValue(j, n)) {
                    return State.ERROR;
                }
            }
        }
        for (int i = 0; i < this.getSize(); i++) {

            if (this.getValue(i, n) == 0) {
                return State.INCOMPLETE;
            }
        }

        return State.COMPLETE;
    }

    public State getRegionState(int n) {

        return State.ERROR;
    }

}