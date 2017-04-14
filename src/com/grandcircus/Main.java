package com.grandcircus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String loop;
        do {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence without punctuation:");
        String sentenceOne = input.nextLine().toLowerCase();

        String[] sentenceOneArray = sentenceOne.split(" ");

            // First I made an array of each word... by spliting the sentence (string).
            //Next I will create a for loop which calls the makePigLatin method and prints the new sentence.
            
        for (int i = 0; i < sentenceOneArray.length; i++) {

            System.out.print(" ");
            makePigLatin(sentenceOneArray[i]);

        }
        System.out.println(".");

            System.out.println("Do you want to translate another line? yes or no");
            loop = input.nextLine();
        }while (loop.equalsIgnoreCase("yes"));
        System.out.println("Thanks for playing along. Goodbye.");
    }

    public static void makePigLatin(String firstWord) {
        //In this method, I am trying to find the first letter of each word then check to see if it's a vowel. If so I'll add way. Otherwise I'll move before the first vowel and add ay to the end.

        String[] firstWordArray = firstWord.split("");
        String pigLatinWord;

        if ((firstWord.charAt(0) == '1') || (firstWord.charAt(0) == '2' || (firstWord.charAt(0) == '3') || (firstWord.charAt(0) == '4') || (firstWord.charAt(0) == '5') || (firstWord.charAt(0) == '6') || (firstWord.charAt(0) == '7') || (firstWord.charAt(0) == '8') || (firstWord.charAt(0) == '9') || (firstWord.charAt(0) == '0'))) {
            System.out.print(firstWord);
        } else if ((firstWord.charAt(0) == 'a') || (firstWord.charAt(0) == 'e') || (firstWord.charAt(0) == 'i') || (firstWord.charAt(0) == 'o') || (firstWord.charAt(0) == 'u') || (firstWord.charAt(0) == 'y')) {
            System.out.print(firstWord + "way");
        } else {
            for (int x = 0; x < (firstWordArray.length - 1); x++) {
                System.out.print(firstWordArray[x + 1]);
            }
            System.out.print(firstWordArray[0] + "ay");
        }

            /*for (int w = 0; w < firstWord.length(); w++) {
                if (firstWord.charAt(w) == '~' || firstWord.charAt(w) == '!' || firstWord.charAt(w) == '@' || firstWord.charAt(w) == '#' || firstWord.charAt(w) == '$' || firstWord.charAt(w) == '%' || firstWord.charAt(w) == '^' || firstWord.charAt(w) == '&' || firstWord.charAt(w) == '*' || firstWord.charAt(w) == '(' || firstWord.charAt(w) == ')' || firstWord.charAt(w) == '.') {
                    System.out.println(firstWord);
                } */

// I tried to create a loop that checks for each symbol. However I could not place the loop in an if statement. 
//I got stuck.

        }
    }




