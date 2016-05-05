package csc143.data_structures;

/**
 * This is an interface for an unbounded stack
 */
public interface UnboundedStack {
    /**
     * This method takes in an object and adds it to the stack
     *
     * @param o the object to be added to the stack
     */
    public void push(Object o);

    /**
     * This method removes an object from the stack
     *
     * @return the object that was removed
     * @throws Underempty exception for an empty queue
     */
    public Object pop() throws Underempty;

    /**
     * This method is a boolean to show if the method is NOT empty
     *
     * @return true or false whether istack is not empty
     */
    public boolean isNotEmpty();

    /**
     * This method will give you the size of the stack
     * meaning how many items are currently in it
     *
     * @return the int value of the items in the stack
     */
    public int size();

    /**
     * This method will give a string representation of the stack
     *
     * @return the string version of the stack
     */
    public String toString();
}
