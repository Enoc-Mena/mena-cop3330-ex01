package com.hello;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getName = new Scanner(System.in); //Creates variable to store users input
        System.out.print("What is your name? ");

        String userInput = getName.nextLine(); //Reads the users input
        System.out.println("Its nice to meet you, " + userInput);

    }
}
