package com.start.examples.leetCode;

import java.text.DecimalFormat;

public class MainJust {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#0.####");
        float r = Float.valueOf(df.format(1.2222 % 1));
        while (r % 1 !=0 ) {
            r*=10;
        }

        System.out.println(r);
        System.out.println(String.valueOf(1.2222f).toCharArray().length);
    }
}
