package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.company.LetterGrade.letterGrade;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter the score = ");
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            int score = Integer.parseInt(br.readLine());
            char grade = letterGrade(score);
            System.out.println("The grade of " + score + " is " + grade);
        } catch (NumberFormatException ex) {
            System.out.println("Not an integer!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}