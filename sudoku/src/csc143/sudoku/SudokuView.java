package csc143.sudoku;

import java.awt.*;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by brad.
 */
public class SudokuView implements SymbolRenderer, Observer {

    public SudokuView(SudokuBase b) {
        SudokuBoard board = new SudokuBoard(b);
    }

    /**
     * Renders a single symbol for the Sudoku game
     *
     * @param g     The Graphics object used to draw the symbol
     * @param x     The x-coordinate for the upper-left corner
     *              of the symbol area (40x40 pixels)
     * @param y     The y-coordinate for the upper-left corner
     *              of the symbol area (40x40 pixels)
     * @param value The value to be drawn, between 0 and 12,
     */
    @Override
    public void drawSymbol(Graphics g, int x, int y, int value) {

    }

    /**
     * This method is called whenever the observed object is changed. An
     * application calls an <tt>Observable</tt> object's
     * <code>notifyObservers</code> method to have all the object's
     * observers notified of the change.
     *
     * @param observable the observable object.
     * @param data       an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable observable, Object data) {

    }
}
