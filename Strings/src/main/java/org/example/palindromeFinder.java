package org.example;

import java.util.StringTokenizer;

public class palindromeFinder {
    String word;
    public palindromeFinder(String word){
        this.word = word;
    }

    public static boolean isPalindrome(String word){

        char[] subjectWord = word.toCharArray();
        char[] reversedWord = reverseCharArray(subjectWord);
        int score = 0;



        for (int i = 0; i<reversedWord.length; i ++ ){
            if (subjectWord[i] == reversedWord[i]){
                score++;
            }
        }
        if (score == subjectWord.length){
            return true;

        }
        else{
            System.out.println("score:" + score);
            return false;}



    }


    public static char[] reverseCharArray(char[] subjectWord){


        char[] reversedCharArray = new char[subjectWord.length];
        //for loop to reverse it
        int j = subjectWord.length;
        for(int i=0; i < subjectWord.length; i++){
            reversedCharArray[i] = subjectWord[j-1];
           j--;
            }


        System.out.println(reversedCharArray);
       return reversedCharArray;
    }


    public static void main(String[] args) {

        palindromeFinder pd = new palindromeFinder("level");
        System.out.println(isPalindrome("level"));

        //write a sentence
        //tokenize the sentence
        //for every word in the sentence, run is palindrome
        //if curWord.isPalindrome == true && curWord.length > longestPalindrome
        //longestPalindrome = curWord

        String subjectSentence = "Hello eve , welcome to this llevell";
        String[] tokenizedSentence = subjectSentence.split(" ");

        String longestPalindrome = "";

        for (int i = 0; i<tokenizedSentence.length; i++){

            String curWord = tokenizedSentence[i];

            if (isPalindrome(tokenizedSentence[i]) && curWord.length() > longestPalindrome.length()){
                longestPalindrome = curWord;
            }


        }

        if (longestPalindrome.isEmpty()){
            System.out.println("No Palindromes!");
        }

        System.out.println("Longest Palindrome: "+longestPalindrome);
    }

}
