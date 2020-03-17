package com.start.examples.test34PDF_Parsing.textParsing.textExtractor;

import org.apache.pdfbox.contentstream.operator.color.*;
import org.apache.pdfbox.text.TextPosition;
import org.apache.pdfbox.tools.PDFText2HTML;

import java.io.IOException;

public class MyPDFText2HTML extends PDFText2HTML {
    public MyPDFText2HTML() throws IOException {
        addOperator(new SetStrokingColorSpace());
        addOperator(new SetNonStrokingColorSpace());
        addOperator(new SetStrokingDeviceCMYKColor());
        addOperator(new SetNonStrokingDeviceCMYKColor());
        addOperator(new SetNonStrokingDeviceRGBColor());
        addOperator(new SetStrokingDeviceRGBColor());
        addOperator(new SetNonStrokingDeviceGrayColor());
        addOperator(new SetStrokingDeviceGrayColor());
        addOperator(new SetStrokingColor());
        addOperator(new SetStrokingColorN());
        addOperator(new SetNonStrokingColor());
        addOperator(new SetNonStrokingColorN());
    }


    @Override
    public String getLineSeparator()
    {
        return "<br/>";
    }


    @Override
    protected void processTextPosition(TextPosition text) {
        super.processTextPosition(text);
    }


/*
    @SneakyThrows
    @Override
    protected void processTextPosition(TextPosition text) {

        PDGraphicsState graphicsState = getGraphicsState();
        System.out.println("R = " + graphicsState.getStrokingColor().toString());
        System.out.println("G = " + graphicsState.getNonStrokingColor().toString());
        System.out.println("B = " + graphicsState.getNonStrokingColor().toString());


    }*/

   /* @Override
    protected void processTextPosition(TextPosition text) {

        Composite com;
        Color col;
        switch (this.getGraphicsState().getTextState().getRenderingMode()) {
            *//*case PDTextState.g:
                com = this.getGraphicsState().getNonStrokeJavaComposite();
                int r =       this.getGraphicsState().getNonStrokingColor().getJavaColor().getRed();
                int g = this.getGraphicsState().getNonStrokingColor().getJavaColor().getGreen();
                int b = this.getGraphicsState().getNonStrokingColor().getJavaColor().getBlue();
                int rgb = this.getGraphicsState().getNonStrokingColor().getJavaColor().getRGB();
                float []cosp = this.getGraphicsState().getNonStrokingColor().getColorSpaceValue();
                PDColorSpace pd = this.getGraphicsState().getNonStrokingColor().getColorSpace();
                break;
            case PDTextState.RENDERING_MODE_STROKE_TEXT:
                System.out.println(this.getGraphicsState().getStrokeJavaComposite().toString());
                System.out.println(this.getGraphicsState().getStrokingColor().getJavaColor().getRGB());
                break;
            case PDTextState.RENDERING_MODE_NEITHER_FILL_NOR_STROKE_TEXT:
                //basic support for text rendering mode "invisible"
                Color nsc = this.getGraphicsState().getStrokingColor().getJavaColor();
                float[] components = {Color.black.getRed(),Color.black.getGreen(),Color.black.getBlue()};
                Color  c1 = new Color(nsc.getColorSpace(),components,0f);
                System.out.println(this.getGraphicsState().getStrokeJavaComposite().toString());
                break;*//*
            default:
              *//*  System.out.println(this.getGraphicsState().getNonStrokeJavaComposite().toString());
                System.out.println(this.getGraphicsState().getNonStrokingColor().getJavaColor().getRGB());*//*
        }
    }*/



}
