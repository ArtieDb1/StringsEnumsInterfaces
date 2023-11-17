package org.example;

public class palindromeFinderStringBuilder {


    static String word;
    public palindromeFinderStringBuilder(String word){
        this.word = word;
    }


    public static void hasPalindrome(){
        StringBuilder sb = new StringBuilder(word);

        String reversedString = new String(sb.reverse());
        System.out.println(sb +" - sb");
        System.out.println(reversedString +" - rs");
        if(sb.toString().equals(reversedString)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }


    }


    public static void main(String[] args) {
        palindromeFinderStringBuilder pfusb = new palindromeFinderStringBuilder("LEVEL");
        hasPalindrome();

    }

}
