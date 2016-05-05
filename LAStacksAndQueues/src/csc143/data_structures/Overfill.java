package csc143.data_structures;

/**
 * This is a class for an overfill exception
 */
public class Overfill extends DataStructureException {
    /**
     * Constructor for an overfill exception which will give back the message needed
     * @param msg the message given by the super class
     */
    public Overfill(String msg) {
        super(msg);
    }
}
