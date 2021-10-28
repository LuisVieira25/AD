package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        // a
        System.out.println(CharacterUtilities.lowerLetterSuccessorOf('b'));
        // b
        System.out.println(CharacterUtilities.lowerLetterPredecessorOf('c'));
        // c
        System.out.println(CharacterUtilities.lowerLetterSuccessorStepsOf('b',5));
        // d
        System.out.println(CharacterUtilities.lowerLetterPredecessorStepsOf('b',2));
        // e
        char array[] = {'a','b','b','f','b'};
        System.out.println("Tem "+CharacterUtilities.occurrencesOfCharacterIn('a',array)+" letra(s)");
        // f
        CharacterUtilities.replaceCharacterIn('b','z',array);
        // g
        char array2[] = {'w','r','o','p'};
        CharacterUtilities.concatenationOf(array2,array);
        // h
        CharacterUtilities.copyOfPartOf(array2,1,3);

        // 3 - a
        System.out.println("Codificando: "+CaesarCipherDecipherer.cipher("abc",10));
        System.out.println("Descodificando: "+CaesarCipherDecipherer.decipher("lmn",8));

    }
}
