package Kellsey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PigLatin {
    static String firstLetter;
    static String bodyOfWord;
    static String tailOfConsonant = "ay";
    static String tailOfVowel = "way";



    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String Input = sc.nextLine();
        ArrayList<String> sentences = new ArrayList<>();


        String sentence2 = "";
        sentences.add(Input);

        System.out.println(sentences.get(0));
        String firstSentence =  sentences.get(0);
        String[] perWord = firstSentence.split(" ");

        for (int i = 0; i < perWord.length; i++) {
            firstLetter = perWord[i].toLowerCase().substring(0, 1);
            bodyOfWord = perWord[i].substring(1);


            if (firstLetter.equalsIgnoreCase("a") || firstLetter.equalsIgnoreCase("e") || firstLetter.equalsIgnoreCase("i") || firstLetter.equalsIgnoreCase("o") || firstLetter.equalsIgnoreCase("u")) {
                String newWord = bodyOfWord + firstLetter + tailOfVowel;
                sentence2 += newWord + " ";
            } else {
                String newWord = bodyOfWord + firstLetter + tailOfConsonant;
                sentence2 += newWord + " ";
            }
        }

        String firstCap = sentence2.substring(0,1).toUpperCase();
        String sentence1 = sentence2.substring(1).trim();
        String completeSentence = (firstCap + sentence1 + ".");
        System.out.println(completeSentence);
    }

}
