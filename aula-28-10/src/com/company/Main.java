package com.company;

public class Main {

    public static void main(String[] args) {

        final int[] studentNumbers = {20032, 30312, 25342, 31432};
        final String[] courseAcronyms = {"AD", "WEB-FE", "WEB-BE"};
        final int[][] studentGrades = {
                {15,18,17},
                {18,10,11},
                {11,13,15},
                {10,19,16}
        };

        float medias[] = new float[studentNumbers.length];
        float biggestMedia = 0;
        int aluno = 0;

        for(int i = 0; i < studentNumbers.length; i++){
            float media = 0;
            System.out.println("-------------------ALUNO "+studentNumbers[i]+"-------------------");
            for (int c = 0; c < courseAcronyms.length; c++){
                media += studentGrades[i][c];
                System.out.println("Na disciplina "+courseAcronyms[c]+" teve "+studentGrades[i][c]+" valores");
            }
            media /= courseAcronyms.length;
            System.out.println("A media do aluno é de "+media+" valores");
            if(media >= biggestMedia){
                biggestMedia = media;
                aluno = studentNumbers[i];
            }
        }

        System.out.println("-------------------------------------------------");
        System.out.println("A media mais alta foi de "+biggestMedia+" que pertence ao aluno "+aluno);
    }
}
