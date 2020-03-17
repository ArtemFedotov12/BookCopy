package com.start.examples.test34PDF_Parsing.textParsing.textProperties;

import org.apache.pdfbox.text.TextPosition;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class TextProperties {

    private static final float ADDITIONAL_WIDTH = 50;
    private static final float ADDITIONAL_HEIGHT = 50;

    private TextCoordinates textCoordinates = new TextCoordinates();
    private Set<FontSize> fontSizeSet = new HashSet<>();


    public float getTextBoxWidth() {
        return (textCoordinates.getxEnd() - textCoordinates.getxStart()) + ADDITIONAL_WIDTH;
    }

    public float getTextBoxHeight() {
        return (textCoordinates.getyEnd() - textCoordinates.getyStart()) + ADDITIONAL_HEIGHT;
    }

    public float getFontSize() {

        Optional <FontSize> fontSize = fontSizeSet
                .stream()
                .max(Comparator.comparing(FontSize::getStrength));

        if (fontSize.isPresent()) {
            return fontSize.get().getFontSize();
        } else {
            throw new IllegalArgumentException("ss");
        }

    }

    public void setTextCoordinates(TextPosition currentText) {

        if (!isDefaultInitialized()) {
            textCoordinates.setxStart(currentText.getXDirAdj());
            textCoordinates.setyStart(currentText.getYDirAdj());

            textCoordinates.setxEnd(currentText.getXDirAdj());
            textCoordinates.setyEnd(currentText.getYDirAdj());
        }

        if (textCoordinates.getxStart() > currentText.getXDirAdj()) {
            textCoordinates.setxStart(currentText.getXDirAdj());
        }

        if (textCoordinates.getyStart()  > currentText.getYDirAdj()) {
            textCoordinates.setyStart(currentText.getYDirAdj());
        }

        if (textCoordinates.getxEnd() < currentText.getXDirAdj()) {
            textCoordinates.setxEnd(currentText.getXDirAdj());
        }

        if (textCoordinates.getyEnd() < currentText.getYDirAdj()) {
            textCoordinates.setyEnd(currentText.getYDirAdj());
        }
    }

    private boolean isDefaultInitialized() {
        return textCoordinates.getxStart() != 0 && textCoordinates.getxEnd() != 0 && textCoordinates.getyStart() != 0 && textCoordinates.getyEnd() != 0;
    }

    public void setFontSize(TextPosition currentText) {
        Optional<FontSize> optionalFont = fontSizeSet
                .stream()
                .filter(e -> e.getFontSize() == currentText.getFontSize())
                .findFirst();

        if (optionalFont.isPresent()) {
            optionalFont.get().addStrength();
        } else {
            fontSizeSet.add(new FontSize(currentText.getFontSize()));
        }
    }

}
