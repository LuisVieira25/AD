package com.company;

public class Main {

    public static void main(String[] args) {

        int linhas = 3;
        int colunas = 3;
        MatrixUtilities.show(linhas,colunas);

        int array[][] = {
                {1,0,0},
                {0,1,0},
                {0,0,1}
        };
        int array2[][] = {
                {2,1,0},
                {0,2,4},
                {1,2,3}
        };
        System.out.println(MatrixUtilities.isMatrix(array));
        System.out.println(MatrixUtilities.isIdentity(array));
        MatrixUtilities.multiplyBy(array,2);
        System.out.println(MatrixUtilities.areCompatibleForSum(array,array2));
        MatrixUtilities.sumOf(array,array2);

        // Ex. 3

        // a.
        CharacterDrawingUtilities.drawElement('x');
        // b.
        CharacterDrawingUtilities.drawNewLine();
        // c.
        CharacterDrawingUtilities.drawHorizontalSegmentWith('x',5);
        System.out.println("");
        // d.
        CharacterDrawingUtilities.drawFilledRectangleWith('o',3,5);
        // e.
        CharacterDrawingUtilities.drawEmptyRectangleWith('x',10,5);
    }
}
