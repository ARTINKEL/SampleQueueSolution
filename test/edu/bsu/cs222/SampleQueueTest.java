package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class SampleQueueTest {

    @Test
    public void testIsEmpty() {
        SampleQueue queue = new SampleQueue();
        Assert.assertTrue(queue.isEmpty());
    }

    @Test
    public void testSize() {
        SampleQueue queue = new SampleQueue();
        Assert.assertEquals(0, queue.size());
    }

    @Test
    public void testIsEmpty_withOneElementAdded() {
        SampleQueue queue = new SampleQueue();
        queue.add("x");
        Assert.assertFalse(queue.isEmpty());
    }
}