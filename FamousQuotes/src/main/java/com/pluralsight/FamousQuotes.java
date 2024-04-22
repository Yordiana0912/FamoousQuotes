package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do{
        try{
        String[] quotes ={
                        "April rain bring may flower", "New beginnings", "New Blessing ", "Believe in yourself",
                        "New start new moments", "Self love is more important", " The rain wont last forever",
                        "Sunshine & Happiness", "Fire flames chicken wings", "Start your day with a smile"};

                System.out.println(" Pick a quote (Select #1- #10 ):  ");
                int index = scanner.nextInt();
                scanner.nextLine(); // this allow and tell the system to read the next line , if their is a secret char

                System.out.println(quotes[index]);
            }
            catch (Exception e) {
            System.out.println("Your number was out of range, would  !");
            e.printStackTrace();
            }


        } while (quotesChoice.equals)


    }
}
