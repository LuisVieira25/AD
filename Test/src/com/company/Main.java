package com.company;

public class Main {

    public static void main(String[] args) {
        int [] array = {1,2,3,4};
        incrementArray(array,0);
        System.out.println(array[0]);
    }

    private static int incrementArray(int[] list, int index) {
        list[index]++;
        return list[index];
    }

}
