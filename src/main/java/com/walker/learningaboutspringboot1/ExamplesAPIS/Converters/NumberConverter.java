package com.walker.learningaboutspringboot1.ExamplesAPIS.Converters;

public class NumberConverter {
    public static boolean isNumeric(String strNumber) {
        if (strNumber == null) {
            return false;
        } else {
            String number = strNumber.replaceAll(",",".");
            return number.matches("[-+]?[0-9]*\\.?[0-9]+");
        }
    }
    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) {
            return 0D;
        }
        else {
            String number = strNumber.replaceAll(",",".");
            if (isNumeric(number)) {
                return Double.parseDouble(number);
            }
        }
        return 0D;
    }
}
