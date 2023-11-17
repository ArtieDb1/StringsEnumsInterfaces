package org.example.CodingPracticeStrings;

import java.util.Scanner;

public class RomanNumeralConverter {

    static int numberToConvert;
    static StringBuilder romanNumeral = new StringBuilder(" ");
    private static final int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] romanLiterals = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    //Research from the following link showed me https://codingnconcepts.com/java/integer-to-roman/
    //You have to hard code the difficult numbers then go down the list with your number until you run out of numbers

    public RomanNumeralConverter (int numberToConvert){
        this.numberToConvert = numberToConvert;
    }

    public static String convertedNumber(){
        int i =0;

        while(i < values.length-1){

            if (numberToConvert >= values[i]){

                romanNumeral = romanNumeral.append(romanLiterals[i]);
                numberToConvert -= values[i];
                i++;
            }
            if (numberToConvert < values[i]){
                i++;
            }

        }
        return romanNumeral.toString();
    }



    public static void main(String[] args) {
        RomanNumeralConverter rnc = new RomanNumeralConverter(1923);
        System.out.println(convertedNumber());


    }
}
