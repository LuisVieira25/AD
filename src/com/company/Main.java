package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Perimetro do retangulo: "+perimetroRetangulo(5,2));
        System.out.println("Volume do paralelepipedo: "+volumeParalelepipedo(7,5,3));
        System.out.println("Graus Celsius: "+convertFarenheit(32));
        System.out.println("Segundos: "+hours(1,0,0));
        int[] array = {10,5,4,3};
        System.out.println("Numero maximo: "+max(array));
        System.out.println("Numero minimo: "+min(array));
        System.out.println("Media: "+media(array));
    }

    public static float perimetroRetangulo(float altura, float base){
        float perimetro = 2 * (altura + base);
        return perimetro;
    }

    public static float volumeParalelepipedo(float comprimento, float altura, float largura){
        float volume = comprimento * altura * largura;
        return volume;
    }

    public static float convertFarenheit(float tempGF){
        float tempGC = ( tempGF - 32) * (5/9);
        return tempGC;
    }

    public static int hours(int hours, int minutes, int seconds){
        int segundos = ((hours * 60) * 60) + (minutes * 60) + seconds;
        return segundos;
    }

    public static int max(int array[]){
        int number = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] > number){
                number = array[i];
            }
        }

        return number;
    }

    public static int min(int array[]){
        int number = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < number){
                number = array[i];
            }
        }

        return number;
    }

    public static float media(int array[]){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        float media = sum / array.length;

        return media;
    }
}
