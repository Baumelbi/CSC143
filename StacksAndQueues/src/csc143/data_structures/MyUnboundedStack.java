package csc143.data_structures;

/**
 * Created by baumelbi.
 */
public class MyUnboundedStack implements UnboundedStack {
    /**
     * The constructor takes no parameters
     */
    public MyUnboundedStack() {

    }

    /**
     * This method takes in an object and adds it to the stack
     *
     * @param o the object to be added to the stack
     */
    @Override
    public void push(Object o) {

    }

    /**
     * This method removes an object from the stack
     *
     * @return the object that was removed
     * @throws Underempty exception for an empty queue
     */
    @Override
    public Object pop() throws Underempty {
        return null;
    }

    /**
     * This method is a boolean to show if the method is NOT empty
     *
     * @return true or false whether istack is not empty
     */
    @Override
    public boolean isNotEmpty() {
        return false;
    }

    /**
     * This method will give you the size of the stack
     * meaning how many items are currently in it
     *
     * @return the int value of the items in the stack
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * This method will give a string representation of the stack
     *
     * @return the string version of the stack
     */
    @Override
    public String toString() {

        return null;
    }
}
