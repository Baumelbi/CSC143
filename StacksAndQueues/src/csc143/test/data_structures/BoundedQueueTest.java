package csc143.test.data_structures;

import csc143.data_structures.BoundedArrayQueue;
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

    private BoundedArrayQueue bq;

    @Before
    public void setUp() {
        bq = new BoundedArrayQueue(5);
    }

    @Test
    public void testEnqueue() throws Overfill {

        bq.enqueue(1);

        Assert.assertEquals("item 0 in queue should be 1", "[ 1 : 1 ]", bq.toString());


    }

    @Test
    public void testDequeue() throws Overfill, Underempty {
        bq.enqueue(1);
        System.out.println(bq);
        bq.enqueue(2);
        System.out.println(bq);
        Assert.assertEquals("testing the size after adding", 2, bq.size());
        Assert.assertEquals("Testing the string", "[ 2 : 1, 2 ]", bq.toString());
        bq.dequeue();
        System.out.println(bq);
        Assert.assertEquals("testing the size after removing", 1, bq.size());
        Assert.assertEquals("Testing the string", "[ 1 : 2 ]", bq.toString());

    }

    @Test
    public void testIsNotEmpty_empty_expectFalse() {
        Assert.assertFalse(bq.isNotEmpty());
    }

    @Test
    public void testIsNotEmpty_addOne_expectTrue() throws Overfill {
        bq.enqueue(3);
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

    @Test
    public void testToStringPush() throws Overfill {
        String actual = bq.toString();
        Assert.assertEquals("testing the string representation", "[ 0 : ]", actual);
        bq.enqueue(1);
        actual = bq.toString();
        Assert.assertEquals("testing the string representation", "[ 1 : 1 ]", actual);
        bq.enqueue(2);
        actual = bq.toString();
        Assert.assertEquals("testing the string representation", "[ 2 : 1, 2 ]", actual);
    }
}
