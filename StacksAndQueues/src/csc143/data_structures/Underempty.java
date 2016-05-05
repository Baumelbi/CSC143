package csc143.data_structures;

/**
 * This class is for an Underempty exception it will give back a message
 * if the exception is thrown
 * Created by Bradley Baumel.
 */
public class Underempty extends DataStructureException {
    /**
     * The constructor for the Underempty exception that will give you a
     * message from the super class that is appropriate
     * @param msg the message from the super class
     */
    public Underempty(String msg) {
        super(msg);
    }
}