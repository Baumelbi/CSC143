package csc143.sudoku;

import javax.swing.*;
import java.awt.*;

public class SudokuBoard extends javax.swing.JComponent implements SelectedCell {

    private int size;
    private SudokuBase b;

    //Use the layout manager for this project.

    /**
     * This is the constrcutor sudoku board and will provide the instrutions for creating a proper board
     * based on the given amount of rows and columns wanted for the desired game
     *
     * @param b sudoku base
     */
    public SudokuBoard(SudokuBase b) {
        //setting variables from SudokuBase methods
        int x = 1;
        int y = 1;
        //rows
        int rows = b.getRows();
        //columns
        int columns = b.getColumns();
        //size = rows*columns
        size = b.getSize();
        Square[][] board = new Square[size][size];
        setPreferredSize(new Dimension(size * 51 + b.getRows() + 1, size * 51 + b.getColumns() + 1));

        for (int i = 0; i < columns; i++) {

            for (int j = 0; j < rows; j++) {
                y += 1;

                for (int k = 0; k < rows; k++) {

                    for (int l = 0; l < columns; l++) {
                        x += 1;
                        if (i % 2 == 0 && k % 2 != 0 || i % 2 != 0 && k % 2 == 0) {
                            Color gainsboro = new Color(220, 220, 220);
                            Square square = new Square(x, y, gainsboro);
                            add(square);
                            board[(x + 1) / 50][(y + 1) / 50] = square;
                        } else {
                            Color white = Color.white;
                            Square square = new Square(x, y, white);
                            add(square);
                            board[(x + 1) / 50][(y + 1) / 50] = square;
                        }
                        x += 50;
                    }
                }
                x = 1;
                y += 50;
            }
        }

    }

    /**
     * paintComponent with Graphics g as a parameter and is used to great the border of the SudokuBoard for the square units.
     *
     * @param g - Graphics.
     */
    protected void paintComponent(Graphics g) {
        //overriding
        super.paintComponent(g);
        //setting color as white base
        g.setColor(Color.WHITE);
        //filling the base
        g.fillRect(0, 0, (size * 51 + 2), (size * 51 + 2));
        //border
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, (size * 51 + 2), (size * 51 + 2));
    }

    SudokuBase getBase() {
        return b;
    }

    /**
     * Set the selected cell to the given row and column.
     *
     * @param row The indicated row
     * @param col The indicated column
     */
    @Override
    public void setSelected(int row, int col) {

    }

    /**
     * Retrive the row of the currently selected cell.
     *
     * @return The row in which the selected cell is located.
     */
    @Override
    public int getSelectedRow() {
        return 0;
    }

    /**
     * Retrive the column of the currently selected cell.
     *
     * @return The column in which the selected cell is located.
     */
    @Override
    public int getSelectedColumn() {
        return 0;
    }

    class Square extends JPanel {
        //instance fields
        //variables
        int width = 50;
        int height = 50;
        Color ogColor;

        /**
         * Constructor square is where each square is made.  Holds the constructor, x and y, for location of each square, and parameter c for color that
         * will be set when used.
         *
         * @param x - x location
         * @param y - y location
         * @param c - color set when used
         */
        private Square(int x, int y, Color c) {
            //set color when used
            this.ogColor = c;
            //50x50 dimension
            setSize(width, height);
            //location
            setLocation(x, y);
            //setting a black border for visibility
            setBorder(BorderFactory.createLineBorder(Color.BLACK));
            //set color once used
            setBackground(c);
        }
    }
}