package com.company;

public class Main {

    public static void main(String[] args) {

        // EX 1 ------------------------------------------------------------

        // a
        double result = NumericalUtilities.powerOf(5,2);
        System.out.println(result);

        //b
        float sumNaturals = NumericalUtilities.sumOfNaturalNumbersUpTo(10);
        System.out.println(sumNaturals);

        // c
        int start = 10;
        int end = 20;
        float sum = NumericalUtilities.sumOfNaturalNumbersBetween(start,end);
        System.out.println(sum);

        // d
        float Pairs = NumericalUtilities.sumOfEvenNumbersBetween(start,end);
        System.out.println(Pairs);

        // e
        float divisors = NumericalUtilities.numberOfDivisorsOf(10);
        System.out.println(divisors);

        // f
        String prime = NumericalUtilities.isPrime(10);
        System.out.println(prime);

        // EX 2 ------------------------------------------------------------

        // a
        String StringArray[] = {"O","l","a"};
        String word = ArrayUtilities.toString(StringArray);
        System.out.println(word);

        // b
        int NumbersArray[] = {5,5,5,395,37};
        float maximum = ArrayUtilities.maximumOf(NumbersArray);
        System.out.println("Numero maior -> "+maximum);

        // c
        float minimum = ArrayUtilities.minimumOf(NumbersArray);
        System.out.println("Numero mais pequeno -> "+minimum);

        // d
        int newArray[] = ArrayUtilities.copyOf(NumbersArray);
        ArrayUtilities.showArray(newArray);

        // e
        int number = 5;
        System.out.println("Contem o numero "+number+" ? "+ArrayUtilities.contains(newArray, number));

        // f
        System.out.println("Tem duplicados ? "+ArrayUtilities.containsDuplicates(newArray));

        // g
        int contain = 2;
        System.out.println("Referencia do numero "+contain+" ? (se nao existir retorna -1)"+ArrayUtilities.indexOf(newArray,contain));

        // h
        int arrayAdded[] = ArrayUtilities.add(newArray.length,newArray,10);
        ArrayUtilities.showArray(arrayAdded);

        // i (O numero que colocamos na função tem de existir no array)
        int arrayRemoved[] = ArrayUtilities.remove(newArray,5);
        ArrayUtilities.showArray(arrayRemoved);
    }
}
