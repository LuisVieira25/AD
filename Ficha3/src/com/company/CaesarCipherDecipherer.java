package com.company;

public class CaesarCipherDecipherer {

    public static String cipher(String word, int key){
        String newWord = "";
        for(int i = 0; i < word.length(); i++){
            newWord += CharacterUtilities.lowerLetterSuccessorStepsOf(word.charAt(i), key);
        }
        return newWord;
    }

    public static String decipher(String word, int key){
        String newWord = "";
        for(int i = 0; i < word.length(); i++){
            newWord += CharacterUtilities.lowerLetterPredecessorStepsOf(word.charAt(i), key);
        }
        return newWord;
    }


}
