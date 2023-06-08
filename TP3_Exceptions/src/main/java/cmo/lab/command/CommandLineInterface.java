package cmo.lab.command;

import java.util.Scanner;

public class CommandLineInterface {
    private Scanner scanner;

    public CommandLineInterface() {
        this.scanner = new Scanner(System.in);
    }

    public String scanCommand() {
        return scanner.nextLine();
    }
}
