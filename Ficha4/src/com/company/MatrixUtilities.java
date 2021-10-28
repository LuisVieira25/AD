package com.company;

public class MatrixUtilities {

    public static void show(int linha, int coluna){
        System.out.println("[");
        for(int l = 0; l < linha; l++){
            System.out.print("{");
            for (int c = 0; c < coluna; c++){
                if(c < coluna-1) {
                    System.out.print("0,");
                }else{
                    System.out.print("0");
                }
            }
            if(l < linha-1) {
                System.out.println("},");
            }else{
                System.out.println("}");
            }
        }
        System.out.println("]");

    }

    public static boolean isMatrix(int array[][]){
        int colunas = array[0].length;
        for(int l = 0; l < array.length; l++){
            if(array[l].length != colunas){
                return false;
            }
            colunas = array[l].length;
        }
        return true;
    }

    public static boolean  isIdentity(int array[][]){
        for(int l=0; l < array.length; l++){
            for(int c = 0; c < array[l].length; c++){
                if(l == c){
                    if(array[l][c] != 1){
                        return false;
                    }
                }else{
                    if(array[l][c] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void multiplyBy(int array[][], int multiplier){
        System.out.println("[");
        for(int l=0; l < array.length; l++){
            System.out.print("{");
            for(int c = 0; c < array[l].length; c++){
                array[l][c] *= multiplier;
                if(c == array[l].length-1) {
                    System.out.print(array[l][c]);
                }else{
                    System.out.print(array[l][c] + ",");
                }
            }
            if(l == array.length-1){
                System.out.println("}");
            }else{
                System.out.println("},");
            }
        }
        System.out.println("]");
    }


    public static boolean areCompatibleForSum(int array[][], int array2[][]){
        boolean verify = true;
        if(array.length == array2.length){
            for(int i =0; i < array.length; i++){
                if(array[i].length == array2[i].length){
                    verify = true;
                }else{
                    return false;
                }
            }
        }else{
            return false;
        }
        return verify;
    }

    public static void sumOf(int array[][], int array2[][]){
        if(areCompatibleForSum(array,array2)){
            int newArray[][] = new int[array.length][array[0].length];
            for(int l=0; l < array.length; l++){
                for(int c = 0; c < array[l].length; c++){
                    newArray[l][c] = array[l][c] + array2[l][c];
                }
            }
            multiplyBy(newArray,1);
        }else{
            System.out.println("Estes arrays multidimensionais não podem ser calculados!");
        }

    }

}
