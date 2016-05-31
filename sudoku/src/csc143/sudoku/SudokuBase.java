package csc143.sudoku;

/**
 *
 */
public abstract class SudokuBase extends java.util.Observable {

    private final int rows;
    private final int columns;
    private final int size;

    /**
     * This is the constructor for the Sudoku base
     *
     * @param layoutRows
     * @param layoutColumns
     */
    public SudokuBase(int layoutRows, int layoutColumns) {
        rows = layoutRows;
        columns = layoutColumns;
        size = columns * rows;
    }

    /**
     * This method gives you the number of rows
     *
     * @return rows the amount of rows
     */
    public int getRows() {
        return rows;
    }

    /**
     * This method gives you the number of columns
     *
     * @return columns the amount of columns
     */
    public int getColumns() {
        return columns;
    }

    /**
     * This method gives you the board
     *
     * @return size
     */
    public int getSize() {
        return size;
    }

    /**
     * This abstract class provides you with the value at a given location
     * on the board
     *
     * @param row
     * @param col
     * @return value the value at the location
     */
    public abstract int getValue(int row, int col);

    /**
     * This abstract method allows you to set the value at a given location
     *
     * @param row
     * @param col
     * @param value
     */
    public abstract void setValue(int row, int col, int value);

    /**
     * This abstrast method tells you if the selected spot is a "given"
     * location. meaning that it is a fixed value.
     *
     * @param row
     * @param col
     * @return
     */
    public abstract boolean isGiven(int row, int col);

    /**
     * This method lets you set a position as a "given" location
     */
    public abstract void fixGivens();

    /**
     * This method takes in the row number and lets you know if the
     * row is incomplete, complete, or error
     *
     * @param n the row number
     * @return
     */
    public abstract State getRowState(int n);

    /**
     * This method takes in the column and lets you know if the
     * row is incomplete, complete, or error
     *
     * @param n the column number
     * @return
     */
    public abstract State getColumnState(int n);

    /**
     * This method takes in the region number and lets you know
     * if the region is complete, incomplete or error
     *
     * @param n the region number
     * @return
     */
    public abstract State getRegionState(int n);

    public enum State {COMPLETE, INCOMPLETE, ERROR}

}
