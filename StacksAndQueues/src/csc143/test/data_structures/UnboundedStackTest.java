package csc143.test.data_structures;

import csc143.data_structures.MyUnboundedStack;
import csc143.data_structures.Underempty;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * This is a test class is created to test the basic
 * functionality
 * Created by Bradley Baumel.
 */
public class UnboundedStackTest {

    private MyUnboundedStack us;
    @Before
    public void setUp() {
        us = new MyUnboundedStack();
    }

    @Test
    public void testPush() {
        us.push(1);
        Assert.assertEquals("checking the size", 1, us.size());
        Assert.assertEquals("adding item to the stack", "[ 1 : 1 ]", us.toString());
    }

    @Test
    public void testPop() throws Underempty {
        us.push(1);
        us.push(4);
        Assert.assertEquals("testing the size after adding", 2, us.size());
        Assert.assertEquals("Testing the string", "[ 2 : 1, 4 ]", us.toString());
        us.pop();
        Assert.assertEquals("testing the size after adding", 1, us.size());
        Assert.assertEquals("Testing the string", "[ 1 : 1 ]", us.toString());
    }

    @Test
    public void testIsNotEmpty_empty_expectFalse() {
        Assert.assertFalse(us.isNotEmpty());
    }

    @Test
    public void testIsNotEmpty_addOne_expectTrue() {
        us.push(3);
        Assert.assertTrue(us.isNotEmpty());
    }

    @Test
    public void testSize() {
        Assert.assertEquals("size of stack", 0, us.size());
    }

    @Test
    public void testSize_addOne() {
        us.push(1);
        Assert.assertEquals("size of stack", 1, us.size());
    }

    @Test
    public void testSize_addOne_addTwo() {
        us.push(1);
        us.push(2);
        Assert.assertEquals("size of stack", 2, us.size());
    }

    @Test
    public void testSize_addOne_addTwo_removeTwo() throws Underempty {
        us.push(1);
        us.push(2);
        Assert.assertEquals("size of stack", 2, us.size());
        us.pop();
        Assert.assertEquals("size of stack", 1, us.size());
    }

    @Test
    public void testToString() {
        Assert.assertEquals("Testing the string representation", "[ 0 : ]", us.toString());
    }
}
