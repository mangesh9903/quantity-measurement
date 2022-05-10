package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuanityTest {

    /**
     *  TC 1.1 Given 0 Feet and 0 Feet Should Return equal
     */
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }

    /**
     *  TC 1.2 Null Check
     */
    @Test
    public void givenNullFeetValue_shouldReturnFalse(){
        Feet feet = new Feet(0.0);
        Assert.assertNotEquals(null,feet);

    }
}
