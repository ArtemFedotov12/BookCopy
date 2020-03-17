package com.start.examples.test34PDF_Parsing.textParsing.textProperties;

import java.util.Objects;

public class FontSize {

    private int strength = 0;
    private final float fontSize;

    public FontSize(float fontSize) {
        this.fontSize = fontSize;
    }

    public void addStrength() {
        strength++;
    }

    public float getFontSize() {
        return fontSize;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FontSize fontSize = (FontSize) o;
        return strength == fontSize.strength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength);
    }

}


