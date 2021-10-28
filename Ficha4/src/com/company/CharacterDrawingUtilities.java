package com.company;

public class CharacterDrawingUtilities {

    public static void drawElement(char element){
        System.out.print(element);
    }

    public static void drawNewLine(){
            System.out.println("");
    }

    public static void drawHorizontalSegmentWith(char element, int largura){
        for(int i = 0; i < largura; i++){
            drawElement(element);
        }
    }

    public static void drawFilledRectangleWith(char element, int largura, int altura){
        for(int i = 0; i < altura; i++){
            drawHorizontalSegmentWith(element,largura);
            drawNewLine();
        }
    }

    public static void drawEmptyRectangleWith(char element, int largura, int altura){
        for(int i = 0; i < altura; i++){
            for(int j = 0; j < largura; j++){
                if(i == 0 || i == altura - 1){
                    drawElement(element);
                }else if(j == 0 || j == largura -1){
                    drawElement(element);
                }else{
                    System.out.print(" ");
                }
            }
            drawNewLine();
        }
    }

}
