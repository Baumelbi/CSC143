package csc143.data_structures;

/**
 * Created by baumelbi.
 */
public class MyUnboundedQueue implements UnboundedQueue {
    /**
     * the constructor takes no paramaters
     */
    public MyUnboundedQueue() {

    }

    /**
     * This method will put an object into a queue
     *
     * @param o the object to be added
     */
    @Override
    public void enqueue(Object o) {

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
     * This method with creates a string representation of the queue
     *
     * @return string of the queue
     */
    @Override
    public String toString() {

        return null;
    }
}
