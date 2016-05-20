package csc143.data_structures;

/**
 * Created by baumelbi.
 */
public class BoundedArrayQueue implements BoundedQueue {

    private Object[] bqArray;
    private int bottom;
    private int maxSize;

    public BoundedArrayQueue(int n) {
        maxSize = n;
        bqArray = new Object[maxSize];
        bottom = 0;
    }

    /**
     * This method allows you to add an object to the bounded queue
     *
     * @param o the object to be added
     * @throws Overfill if the queue is full is will throw an exception
     */
    @Override
    public void enqueue(Object o) throws Overfill {
        bqArray[bottom] = o;
        bottom++;
    }

    /**
     * This method will remove an object from the queue
     *
     * @return the object that was removed from the queue
     * @throws Underempty the exception to show that the queue is empty
     */
    @Override
    public Object dequeue() throws Underempty {
        Object value = bqArray[0];
        //System.out.println("item to be removed: "+value);
        bottom--;
        for (int i=0; i < bottom; i++) {
            bqArray[i] = bqArray[i + 1];
        }
        bqArray[bottom]= null;
        return value;
    }

    /**
     * This boolean method will tell you if the queue is Not empty
     *
     * @return true or false as to if the queue is not empty
     */
    @Override
    public boolean isNotEmpty() {
        return bottom != 0;
    }

    /**
     * This method will return the int value size of the queue
     * which is how many objects are in the queue
     *
     * @return the int value of the size of the queue
     */
    @Override
    public int size() {
        return bottom;
    }

    /**
     * This method defines the maximum capacity of the queue
     *
     * @return the int value of the capacity
     */
    @Override
    public int capacity() {
        return maxSize;
    }

    /**
     * this method will defind the capacity for the bounded queue
     *
     * @return the int value for the  capacity of the bounded queue
     */
    @Override
    public String toString() {
        String temp;

        if (size() == 0) {
            temp = String.format("[ %s : ", size());
        } else {
            temp = String.format("[ %s : ", size());
            for (int i = 0; i < size(); i++) {
                if (i + 1 >= size()) {
                    temp += bqArray[i] + " ";
                } else {
                    temp += bqArray[i] + ", ";
                }
            }
        }
        temp += "]";
        return temp;
    }
}
