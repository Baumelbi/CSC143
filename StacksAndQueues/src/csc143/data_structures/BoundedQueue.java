package csc143.data_structures;

/**
 * This is an interface for a bounded queue
 */
public interface BoundedQueue {
    /**
     * This method allows you to add an object to the bounded queue
     *
     * @param o the object to be added
     * @throws Overfill if the queue is full is will throw an exception
     */
    public void enqueue(Object o) throws Overfill;

    /**
     * This method will remove an object from the queue
     *
     * @return the object that was removed from the queue
     * @throws Underempty the exception to show that the queue is empty
     */
    public Object dequeue() throws Underempty;

    /**
     * This boolean method will tell you if the queue is Not empty
     *
     * @return true or false as to if the queue is not empty
     */
    public boolean isNotEmpty();

    /**
     * This method will return the int value size of the queue
     * which is how many objects are in the queue
     *
     * @return the int value of the size of the queue
     */
    public int size();

    /**
     * This method with creates a string representation of the queue
     *
     * @return string of the queue
     */
    public String toString();

    /**
     * This method defines the maximum capacity of the queue
     *
     * @return the int value of the capacity
     */
    public int capacity();
}
