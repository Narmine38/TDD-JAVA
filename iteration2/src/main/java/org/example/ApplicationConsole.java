package org.example;

import java.util.Scanner;

public class ApplicationConsole {

    private final Scanner scanner;

    public ApplicationConsole(Scanner scanner){
        this.scanner = scanner;
    }

    public void message(String text){
        System.out.println(text);
    }

    public String readLine(){
        return scanner.nextLine();
    }

}
