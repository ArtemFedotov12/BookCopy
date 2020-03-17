package com.start.examples.test34PDF_Parsing.textParsing.myPdfHtml;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class SymBolProperties {

    private float[] rgbColor;
    private float fontSize;
    private String pdFont;
    private static final Map<String, String> pdFonts = new HashMap();

    public SymBolProperties(Builder builder) {
        this.rgbColor = convertToRgb(builder.getRgbColor());
        this.pdFont = convertPdFont(builder.getPdFont());
        this.fontSize = builder.getFontSize();
    }

    static {
        pdFonts.put("TimesNewRomanPSMT", "Times New Roman");
        pdFonts.put("TimesNewRomanPS-ItalicMT","Times New Roman");
        pdFonts.put("TimesNewRomanPS-BoldMT", "Times New Roman");
        pdFonts.put("ArialMT","Arial");
        pdFonts.put("BCDEEE+Tahoma", "Tahoma");
    }

    private float[] convertToRgb(float[] rgbColor) {
        float[] rgbColorCopy = Arrays.copyOf(rgbColor, rgbColor.length);

        for (int i = 0; i < rgbColorCopy.length; i++) {
            rgbColorCopy[i] = Math.round(rgbColorCopy[i] * 255);
        }

        return rgbColorCopy;
    }

    private String convertPdFont(String pdFont) {
        return pdFonts.get(pdFont);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SymBolProperties that = (SymBolProperties) o;
        return Arrays.equals(rgbColor, that.rgbColor) &&
                Objects.equals(pdFont, that.pdFont);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pdFont);
        result = 31 * result + Arrays.hashCode(rgbColor);
        return result;
    }

    public float[] getRgbColor() {
        return rgbColor;
    }

    public String getPdFont() {
        return pdFont;
    }

    public float getFontSize() {
        return fontSize;
    }

    public static class Builder {

        private float[] rgbColor;
        private String pdFont;
        private float fontSize;

        public Builder() {
        }

        public float getFontSize() {
            return fontSize;
        }

        public Builder setFontSize(float fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Builder setRgbColor(float[] rgbColor) {
            this.rgbColor = rgbColor;
            return this;
        }

        public Builder setPdFont(String pdFont) {
            this.pdFont = pdFont;
            return this;
        }

        public float[] getRgbColor() {
            return rgbColor;
        }

        public String getPdFont() {
            return pdFont;
        }

        public SymBolProperties build() {
            return new SymBolProperties(this);
        }

    }


}
