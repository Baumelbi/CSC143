package csc143.test.data_structures;

import csc143.data_structures.MyUnboundedQueue;
import csc143.data_structures.Underempty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class is created to test the basic
 * functionality
 * Created by Bradley Baumel.
 */
public class UnboundedQueueTest {

    private MyUnboundedQueue uq;

    @Before
    public void setUp() {
        uq = new MyUnboundedQueue();
    }

    @Test
    public void testEnqueue() {
        uq.enqueue(1);
        Assert.assertEquals("item 0 in queue should be 1", "[ 1 : 1 ]", uq.toString());
    }

    @Test
    public void testDequeue() throws Underempty {
        uq.enqueue(1);
        uq.enqueue(3);
        Assert.assertEquals("testing the size after adding", 2, uq.size());
        Assert.assertEquals("Testing the string", "[ 2 : 1, 3 ]", uq.toString());
        uq.dequeue();
        Assert.assertEquals("testing the size after adding", 1, uq.size());
        Assert.assertEquals("Testing the string", "[ 1 : 3 ]", uq.toString());
    }

    @Test
    public void testIsNotEmpty() {
        Assert.assertTrue(uq.isNotEmpty());
    }

    @Test
    public void testSize() {
        Assert.assertEquals("Testing the size", 0, uq.size());
    }

    @Test
    public void testSizeAfterAddingOne() {
        uq.enqueue(1);
        Assert.assertEquals("Testing the size", 1, uq.size());
    }

    @Test
    public void testSizeAfterAddingOneAnd2ThenRemoving() throws Underempty {
        uq.enqueue(1);
        Assert.assertEquals("Testing the size", 1, uq.size());
        uq.enqueue(2);
        Assert.assertEquals("Testing the size", 2, uq.size());
        uq.dequeue();
        Assert.assertEquals("Testing the size", 1, uq.size());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Testing the string representation", "[ 0 : ]", uq.toString());
    }


}
