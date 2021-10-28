package com.company;

public class ArrayUtilities {

    public static String toString(String array[]) {
        String word = "";
        for(int i = 0; i < array.length; i++){
            word += array[i] + ",";
        }
        return word;
    }

    public static int maximumOf(int array[]) {
        int maximum = 0;
        for(int i = 0; i < array.length; i++){
            if(maximum < array[i]){
                maximum = array[i];
            }
        }
        return maximum;
    }

    public static int minimumOf(int array[]) {
        int minimum = array[0];
        for(int i = 1; i < array.length; i++){
            if(minimum > array[i]){
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int[] copyOf(int array[]) {
        int newArray[] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static boolean contains(int array[], int number) {
        int verify = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                verify = 1;
            }
        }

        if(verify != 0 ){
            return true;
        }else{
            return false;
        }
    }

    public static boolean containsDuplicates(int array[]) {
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j <array.length; j++){
                if(array[i] == array[j] && i != j){
                    return true;
                }
            }
        }
        return false;
    }

    public static int indexOf(int array[], int number) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static int[] add(int length, int value[], int newNumber){
        int i;
        int newArray[] = new int[length + 1];

        for (i = 0; i < length; i++){
            newArray[i] = value[i];
        }
        newArray[length] = newNumber;

        return newArray;
    }

    public static int[] remove(int value[], int number){
        int x = repeatedNumbers(value,number);
        int newArray[] = new int[value.length - x];
        for(int i = 0, j = 0; i < value.length; i++){
            if(value[i] != number){
                newArray[j++] = value[i];
            }
        }
        return newArray;
    }

    // Função auxiliar para o exercicio "i"
    public static int repeatedNumbers(int value[], int number){
        int count = 0;
        for(int i = 0, j = 0; i < value.length; i++){
            if(value[i] == number){
                count++;
            }
        }
        return count;
    }

    // Função extra para apresentar o array no System.Out
    public static void showArray(int array[]) {
        System.out.println("##########ARRAY###########");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("############################");
    }


}
