package org.example.ex3;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String quote;
        String person;
        System.out.println("What is the quote?");
        quote = getQuote();
        System.out.println("Who said it?");
        person = getPerson();
        System.out.print(person + " says, " + '"' + quote + '"');
    }

    public static String getQuote()
    {
        Scanner newQuote = new Scanner(System.in);
        return newQuote.nextLine();
    }

    public static String getPerson()
    {
        Scanner newPerson = new Scanner(System.in);
        return newPerson.nextLine();
    }
}