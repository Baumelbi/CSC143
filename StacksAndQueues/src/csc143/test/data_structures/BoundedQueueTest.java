package csc143.test.data_structures;

import csc143.data_structures.MyBoundedQueue;
import csc143.data_structures.Overfill;
import csc143.data_structures.Underempty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class is created to test the basic
 * functionality
 * Created by Bradley Baumel.
 */
public class BoundedQueueTest {

    private MyBoundedQueue bq;

    @Before
    public void setUp() {
        bq = new MyBoundedQueue(5);
    }

    @Test
    public void testEnqueue() throws Overfill {

        bq.enqueue(1);

        Assert.assertEquals("item 0 in queue should be 1", "[ 1 : 1 ]", bq.toString());


    }

    @Test
    public void testDequeue() throws Overfill, Underempty {
        bq.enqueue(1);
        bq.enqueue(2);
        Assert.assertEquals("testing the size after adding", 2, bq.size());
        Assert.assertEquals("Testing the string", "[ 2 : 1, 2 ]", bq.toString());
        bq.dequeue();
        Assert.assertEquals("testing the size after adding", 1, bq.size());
        Assert.assertEquals("Testing the string", "[ 1 : 2 ]", bq.toString());

    }

    @Test
    public void testIsNotEmpty() {
        Assert.assertTrue(bq.isNotEmpty());
    }


    @Test
    public void testSize() {
        int size = bq.size();
        Assert.assertEquals("Testing the size of the BQ", 0, size);
    }

    @Test
    public void testSizeThenAddOne() throws Overfill {
        int size = bq.size();
        Assert.assertEquals("Testing the size of the BQ", 0, size);

        bq.enqueue(1);

        size = bq.size();
        Assert.assertEquals("Testing the size of the BQ", 1, size);

    }

    @Test
    public void testCapacity() {
        int capacity = bq.capacity();
        Assert.assertEquals("Testing that the capacity should be 5", 5, capacity);
    }

    @Test
    public void testToString() {
        String actual = bq.toString();
        Assert.assertEquals("testing the string representation", "[ 0 : ]", actual);

    }
}
