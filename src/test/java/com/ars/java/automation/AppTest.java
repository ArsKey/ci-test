package com.ars.java.automation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * This will work Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldPrintStuff(){
        long five = 5L;
        long result = App.sumTwoThree();
        Assert.assertEquals(five, result);
    }
}
