package csc143.data_structures;

/**
 * Created by baumelbi.
 */
public class MyBoundedQueue implements BoundedQueue {
    /**
     * The constuctor takes in an int paramater for the capacity
     *
     * @param n the maximum size of the queue
     */
    public MyBoundedQueue(int n) {
        int maxSize = n;
    }

    /**
     * This method allows you to add an object to the bounded queue
     *
     * @param o the object to be added
     * @throws Overfill if the queue is full is will throw an exception
     */
    @Override
    public void enqueue(Object o) throws Overfill {

    }

    /**
     * This method will remove an object from the queue
     *
     * @return the object that was removed from the queue
     * @throws Underempty the exception to show that the queue is empty
     */
    @Override
    public Object dequeue() throws Underempty {
        return null;
    }

    /**
     * This boolean method will tell you if the queue is Not empty
     *
     * @return true or false as to if the queue is not empty
     */
    @Override
    public boolean isNotEmpty() {
        return false;
    }

    /**
     * This method will return the int value size of the queue
     * which is how many objects are in the queue
     *
     * @return the int value of the size of the queue
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * This method defines the maximum capacity of the queue
     *
     * @return the int value of the capacity
     */
    @Override
    public int capacity() {
        return 0;
    }

    /**
     * This method defines the maximum capacity of the queue
     *
     * @return the int value of the capacity
     */
    @Override
    public String toString() {

        return null;
    }
}
