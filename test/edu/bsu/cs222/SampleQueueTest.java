package edu.bsu.cs222;

import org.junit.Assert;
import org.junit.Test;

public class SampleQueueTest {

    @Test
    public void testIsEmpty() {
        SampleQueue queue = new SampleQueue();
        Assert.assertTrue(queue.isEmpty());
    }
}
