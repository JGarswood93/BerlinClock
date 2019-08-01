package com.barton;

import org.junit.Assert;
import org.junit.Test;

public class TestClock {

    BerlinClockImp berlinClock = new BerlinClockImp();

    /**
     * Below is a test for the yellow light at the top of the clock blinking on and off
     * get seconds is a method that will be put into the implementation class, yellow its on and
     * off is off the asserts are setup in a way to have every odd number shine
     */
    @Test
    public void yellowBlinksEveryTwoSeconds() {
        Assert.assertEquals("y", berlinClock.getSeconds(2));
        Assert.assertEquals("o", berlinClock.getSeconds(1));
        Assert.assertEquals("o", berlinClock.getSeconds(59));
    }
    @Test
    public void testTopHoursShouldHave4Lamps() {
        Assert.assertEquals(4, berlinClock.getTopHours(7).length());
    }
    @Test
    public void testTop
}



