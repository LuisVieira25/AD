package com.company;

public class CharacterUtilities {

    public static char lowerLetterSuccessorOf(char letter){
        if (letter == 'z') {
            return 'a';
        }else{
            int code = (int) letter;
            code++;
            char recovered = (char) code;
            return recovered;
        }
    }

    public static char lowerLetterPredecessorOf(char letter){
        if (letter == 'a') {
            return 'z';
        }else{
            int code = (int) letter;
            code--;
            char recovered = (char) code;
            return recovered;
        }
    }

    public static char lowerLetterSuccessorStepsOf(char letter, int steps){
        char newLetter = letter;
        while( steps != 0){
            newLetter = lowerLetterSuccessorOf(newLetter);
            steps--;
        }
        return newLetter;
    }

    public static char lowerLetterPredecessorStepsOf(char letter, int steps){
        char newLetter = letter;
        while( steps != 0){
            newLetter = lowerLetterPredecessorOf(newLetter);
            steps--;
        }
        return newLetter;
    }

    public static int occurrencesOfCharacterIn(char letter, char array[]){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == letter){
                count++;
            }
        }
        return count;
    }

    public static void replaceCharacterIn(char letter,char newLetter, char array[]){
        for (int i = 0; i < array.length; i++){
            if(array[i] == letter){
                array[i] = newLetter;
            }
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+",");
        }
        System.out.println("]");
    }

    public static void concatenationOf(char array1[], char array2[]){
        char newArray[] = new char[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++){
            newArray[i] = array1[i];
        }
        for (int z = 0; z < array2.length; z++){
            newArray[z+array1.length] = array2[z];
        }
        System.out.print("[");
        for (int x = 0; x < newArray.length; x++){
            System.out.print(newArray[x]+",");
        }
        System.out.println("]");
    }

    public static void copyOfPartOf(char array[],int start, int end){
        char newArray[] = new char[end-start+1];
        for (int i = 0, z = 0; i < array.length; i++){
            if(i >= start && i <= end){
                newArray[z] = array[i];
                z++;
            }
        }
        System.out.print("[");
        for (int i = 0; i < newArray.length; i++){
            System.out.print(newArray[i]+",");
        }
        System.out.println("]");
    }


}
