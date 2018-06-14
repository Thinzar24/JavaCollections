package com.company;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        ArrayList<String> moviesList = new ArrayList<String>();
        System.out.println("Enter the movies - ");
        String moviess = sc.nextLine();


        String userInput = " ";
        userInput = sc.nextLine();

        while (!userInput.equalsIgnoreCase(" Q")) {
            moviesList.add(userInput);
            if (userInput.equalsIgnoreCase("Q ")) {
                break;
            }
        }

        Collections.sort(moviesList);
        System.out.println("Moives entered ");

        for (String m : moviesList) {
            System.out.println(m);

        }
    }
}
