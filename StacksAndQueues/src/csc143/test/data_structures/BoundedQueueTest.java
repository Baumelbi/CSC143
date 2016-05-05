package csc143.test.data_structures;

import csc143.data_structures.MyBoundedQueue;
import csc143.data_structures.Overfill;
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
    public void setUp(){
        bq = new MyBoundedQueue(5);
    }

    @Test
    public void testEnqueue(){
        try {
            bq.enqueue(1);
        } catch (Overfill overfill) {
            overfill.printStackTrace();
        }
        Assert.assertEquals("item 0 in queue should be 1", "[1: 1]", bq.toString());


    }

    @Test
    public void testDequeue(){

    }

    @Test
    public void testIsNotEmpty(){
        Assert.assertTrue(bq.isNotEmpty());
    }

    @Test
    public void testSize(){
        int size = bq.size();
        Assert.assertEquals("Testing the size of the BQ", 0, size);
        try {
            bq.enqueue(1);
        } catch (Overfill overfill) {
            overfill.printStackTrace();
        }
        size = bq.size();
        Assert.assertEquals("Testing the size of the BQ", 1, size);

    }

    @Test
    public void testCapacity(){
        int capacity = bq.capacity();
        Assert.assertEquals("Testing that the capacity should be 5", 5, capacity);
    }

    @Test
    public void testToString() {

    }
}
