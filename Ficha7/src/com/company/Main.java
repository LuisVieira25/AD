package com.company;
import java.util.Scanner;

public class Main {

    public enum command{
        START,SAVEGAME,LOADGAME,HIGHSCORES,QUIT;
    }

    public static void main(String[] args) {

        // PRINTSSSS

        String start = command.START.name();
        System.out.println(start);
        String savegame = command.SAVEGAME.name();
        System.out.println(savegame);
        String loadgame = command.LOADGAME.name();
        System.out.println(loadgame);
        String highscores = command.HIGHSCORES.name();
        System.out.println(highscores);
        String quit = command.QUIT.name();
        System.out.println(quit);

        // OU

        command commands[] = command.values();

        for(int i = 0; i < commands.length; i++){
            command c = commands[i];
            String name = c.name();
            int indice = c.ordinal();
            System.out.println("ENUM: "+name);
            System.out.println("Indice: "+indice);
            System.out.println("-------------");
        }

        // --------------------------------------------------
        // IF ELSE

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando:");
        String line = scanner.nextLine();
        command comando = command.valueOf(line);
        if(comando == command.START) {
            // começar...
            System.out.println("teste if");
        }
        else if(comando == command.SAVEGAME) {
            // salvar...
        }
        else if(comando == command.LOADGAME) {
            // carregar...
        }
        else if(comando == command.HIGHSCORES) {
            // Melhores scores...
        }
        else if(comando == command.QUIT) {
            // sair...
        }

        // SWITCH.CASE

        switch (comando) {
            case START:
                // começar...
                System.out.println("teste switch");
                break;
            case SAVEGAME:
                // salvar...
                break;
            case LOADGAME:
                // carregar...
                break;
            case HIGHSCORES:
                // Melhores scores...
                break;
            case QUIT:
                // sair...
                break;
        }

        // --------------------------------------------------
    }
}
