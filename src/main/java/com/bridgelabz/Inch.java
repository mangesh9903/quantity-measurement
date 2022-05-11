package com.bridgelabz;

import java.util.Objects;

/**
 * @author Mangesh
 * @date 9-May-2022
 */
public class Inch {
    private double value;

    public Inch(double value) {
        this.value = value;
    }

    public Inch() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Inch inch = (Inch) o;
        return Double.compare(inch.value, value) == 0;
    }

}
