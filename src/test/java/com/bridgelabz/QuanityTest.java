package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuanityTest {

    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual(){
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1,feet2);
    }
}