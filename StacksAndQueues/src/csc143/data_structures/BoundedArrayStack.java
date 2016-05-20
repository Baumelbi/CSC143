package csc143.data_structures;

/**
 * Created by baumelbi.
 */
public class BoundedArrayStack implements BoundedStack {


    private Object[] bsArray;
    private int top;
    private int maxSize;

    /**
     * The constructor takes in the int value of the max capacity
     *
     * @param n the maximum size of the stack
     */
    public BoundedArrayStack(int n) {

        maxSize = n;
        bsArray = new Object[maxSize];
        top = -1;
    }

    /**
     * This method will allow you to add an item to a bounded stack
     *
     * @param o the object to be added
     * @throws Overfill exception for a full stack
     */
    @Override
    public void push(Object o) throws Overfill {
        bsArray[++top] = o;
    }

    /**
     * This method removes an object from the stack
     *
     * @return the object that was removed
     * @throws Underempty exception for an empty queue
     */
    @Override
    public Object pop() throws Underempty {
        return bsArray[top--];
    }

    /**
     * This method is a boolean to show if the method is NOT empty
     *
     * @return true or false whether istack is not empty
     */
    @Override
    public boolean isNotEmpty() {
        return top != -1;
    }

    /**
     * This method will give you the size of the stack
     * meaning how many items are currently in it
     *
     * @return the int value of the items in the stack
     */
    @Override
    public int size() {
        return top + 1;
    }

    /**
     * this method will defind the capacity for the bounded stack
     *
     * @return the int value for the  capacity of the bounded stack
     */
    @Override
    public int capacity() {
        return maxSize;
    }

    /**
     * this method will defind the capacity for the bounded stack
     *
     * @return the int value for the  capacity of the bounded stack
     */
    @Override
    public String toString() {
        String temp;

        if (size() == 0) {
            temp = String.format("[ %s : ", size());
        } else {
            temp = String.format("[ %s : ", size());
            for (int i = 0; i < size(); i++) {
                if (i+1 >= size()) {
                    temp += bsArray[i] + " ";
                } else {
                    temp += bsArray[i] + ", ";
                }
            }
        }
        temp += "]";
        return temp;
    }

}


