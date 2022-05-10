package com.bridgelabz;

/**
 * @author Mangesh
 * @date 9-May-2022
 */
public class Feet {

    private double value;

    public Feet(double value) {
        this.value = value;
    }

    public Feet() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
