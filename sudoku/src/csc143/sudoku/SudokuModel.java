package csc143.sudoku;

public class SudokuModel extends SudokuCore {

    public SudokuModel(int r, int c) {
        super(r, c);
    }

    /**
     * This method check the state of the rows it goes through a loop to first
     * test if the row is completely filled, if it is not it will return
     * "Incomplete" if it is then it moves onto the next loop which checks if
     * there are any repeat numbers within the row. If there are it returns
     * "Error" if no errors then the method returns that the row is "complete"
     */
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

    /**
     * This method check the state of the columns it goes through a loop to
     * first test if the column is completely filled, if it is not it will
     * return "Incomplete" if it is then it moves onto the next loop which
     * checks if there are any repeat numbers within the column. If there are it
     * returns "Error" if no errors then the method returns that the column is
     * "complete"
     */
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
        int temp = 0;
        for (int i = 0; i < this.getSize(); i++) {

        }


        return State.COMPLETE;
    }

}