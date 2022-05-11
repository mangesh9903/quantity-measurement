package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class QuanityTest {

    /**
     * TC 1.1 Given 0 Feet and 0 Feet Should Return equal
     */
    @Test
    public void given0FeetAnd0Feet_shouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    /**
     * TC 1.2 Null Check
     */
    @Test
    public void givenNullFeetValue_shouldReturnFalse() {
        Feet feet = new Feet(0.0);
        Assert.assertNotEquals(null, feet);

    }

    /**
     * TC 1.3 Type Check
     */
    @Test
    public void givenReferenceObject_whenSame_shouldReturnTrue() {
        Feet feet = new Feet(0.0);
        Assert.assertSame(feet, feet);
    }

    @Test
    public void givenReferenceObject_whenNotSame_shouldReturnTrue() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertNotSame(feet1, feet2);
    }

    /**
     * TC 1.4 Check Equality.
     */
    @Test
    public void givenSameTypeOfObject_shouldReturnEqual() {
        Feet feet = new Feet();
        Assert.assertEquals(feet, feet);
    }

    @Test
    public void givenDifferentTypeOfObject_shouldReturnNotEqual() {
        Feet feet = new Feet();
        Inch inch = new Inch();
        Assert.assertNotEquals(feet, inch);
    }

    /**
     * TC 1.7 Different Inch Value
     */
    @Test
    public void given0InchAnd1Inch_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    /**
     * TC 1.8 Inch Null Check
     */
    @Test
    public void given0InchAndNullInch_shouldReturnNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assert.assertNotSame(inch1, inch2);
    }

    /**
     *  TC 1.9 Reference Check.
     */
    @Test
    public void givenInchAndInchFromSameRef_whenEqual_shouldReturnTrue(){
        Inch inch = new Inch(0);
        boolean result = inch == inch;
        Assert.assertTrue(result);
    }

    /**
     *  TC 1.9 Reference Check With Different Values.
     */
    @Test
    public void givenInchAndInchWithDiffSameRef_whenNotEqual_shouldReturnFalse(){
        Inch inch1 = new Inch(0);
        Inch inch2 = new Inch(1);
        boolean result = inch1 == inch2;
        Assert.assertFalse(result);
    }

    /**
     *  TC 1.10 Inch Type Check
     */
    @Test
    public void given0InchAnd0InchFromDifferentType_shouldReturnNotEqual(){
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0);
        Assert.assertNotSame(inch1,inch2);
    }
}
