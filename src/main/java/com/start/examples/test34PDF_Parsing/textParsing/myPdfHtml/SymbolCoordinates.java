package com.start.examples.test34PDF_Parsing.textParsing.myPdfHtml;

import java.util.Objects;

public class SymbolCoordinates {

    private float x;
    private float y;

    public SymbolCoordinates(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymbolCoordinates that = (SymbolCoordinates) o;
        return Float.compare(that.x, x) == 0 &&
                y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
