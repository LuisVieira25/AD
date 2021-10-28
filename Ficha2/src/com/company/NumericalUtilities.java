package com.company;

public class NumericalUtilities {

    public static double powerOf(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    public static float sumOfNaturalNumbersBetween(int start, int end) {
        float sum = 0;
        for(int i = start; i <= end; i++){
            sum += i;
        }
        return sum;
    }

    public static float sumOfNaturalNumbersUpTo(int number) {
        float sumNaturals = 0;
        for(int i = 0; i <= number; i++){
            sumNaturals += i;
        }
        return sumNaturals;
    }


    public static float sumOfEvenNumbersBetween(int start, int end) {
        float sumPairs = 0;
        for(int i = start; i <= end; i++){
            if(i % 2 == 0){
                sumPairs += i;
            }
        }
        return sumPairs;
    }

    public static float numberOfDivisorsOf(float number) {
        int divisors = 0;
        for(int i = 0; i <= number; i++){
            if(number % i == 0){
                divisors++;
            }
        }
        return divisors;
    }

    public static String isPrime(float number) {
        if(numberOfDivisorsOf(number) == 2){
            return  "O número é primo";
        }else{
            return "O número não é primo";
        }
    }

}
