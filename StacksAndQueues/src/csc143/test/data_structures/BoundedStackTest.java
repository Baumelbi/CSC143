package csc143.test.data_structures;

import csc143.data_structures.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class is created to test the basic
 * functionality
 * Created by Bradley Baumel.
 */
public class BoundedStackTest {

    private MyBoundedStack bs;
    @Before
    public void setUp() {
        bs = new MyBoundedStack(6);
    }

    @Test
    public void testPush() throws Overfill {
        bs.push(1);
        Assert.assertEquals("checking the size", 1, bs.size());
        Assert.assertEquals("adding item to the stack", "[ 1 : 1 ]", bs.toString());
    }

    @Test
    public void testPop() throws Overfill, Underempty {
        bs.push(1);
        bs.push(3);
        Assert.assertEquals("testing the size after adding", 2, bs.size());
        Assert.assertEquals("Testing the string", "[ 2 : 1, 3 ]", bs.toString());
        bs.pop();
        Assert.assertEquals("testing the size after adding", 1, bs.size());
        Assert.assertEquals("Testing the string", "[ 1 : 1 ]", bs.toString());
    }

    @Test
    public void testIsNotEmpty_empty_expectFalse() {
        Assert.assertFalse(bs.isNotEmpty());
    }

    @Test
    public void testIsNotEmpty_addOne_expectTrue() throws Overfill {
        bs.push(3);
        Assert.assertTrue(bs.isNotEmpty());
    }

    @Test
    public void testSize() {
        Assert.assertEquals("size of stack", 0, bs.size());
    }

    @Test
    public void testSize_addOne() throws Overfill {
        bs.push(1);
        Assert.assertEquals("size of stack", 1, bs.size());
    }

    @Test
    public void testSize_addOne_addTwo() throws Overfill {
        bs.push(1);
        bs.push(2);
        Assert.assertEquals("size of stack", 2, bs.size());
    }

    @Test
    public void testSize_addOne_addTwo_removeTwo() throws Underempty, Overfill {
        bs.push(1);
        bs.push(3);
        Assert.assertEquals("size of stack", 2, bs.size());
        bs.pop();
        Assert.assertEquals("size of stack", 1, bs.size());
    }

    @Test
    public void testCapacity() {
        Assert.assertEquals("Test Capacity", 6, bs.capacity());
    }

    @Test
    public void testToString() {
        String actual = bs.toString();
        Assert.assertEquals("testing the string representation", "[ 0 : ]", actual);
    }

    @Test
    public void testToString_add3() throws Overfill {
        Assert.assertEquals("testing the string representation", "[ 0 : ]", bs.toString());
        bs.push(3);
        Assert.assertEquals("testing the string representation", "[ 1 : 3 ]", bs.toString());
    }

}
