package com.start.examples.leetCode;

public class MainInteger {
    public static void main(String[] args) {

        System.out.println(32 / 10);

        System.out.println(reverse(2678));

    }


    private static int reverse(int number) {
        StringBuilder result = new StringBuilder();
        if (number < 0) {
            result.append("-");
            number = -number;
        }


        while (number != 0) {
            if (number % 10 != 0)
                result.append(number % 10);

            number /= 10;
        }


        return Integer.parseInt(result.toString());
    }

}
