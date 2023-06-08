package cmo.lab.command;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestCommandLIneInterface {
    @Test

    public static void main(String[] args){
        CommandLineInterface commandLine = new CommandLineInterface();
        String recoString = commandLine.scanCommand();
        System.out.println(recoString);


    }
}
