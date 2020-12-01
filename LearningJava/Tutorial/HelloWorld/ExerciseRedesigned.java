package LearningJava.Tutorial.HelloWorld;

import java.util.Scanner;
import java.text.NumberFormat;

public class ExerciseRedesigned {
    public static void main(String[] args){
        //principal ammount of loan you want to get
        //annual interest rate:
        //period in years: e.g. 30
        //Mortgage : have to calculat this also displayed as a currency

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt(); // Allows to store values up to 2 billion

        System.out.print("Annual interest rate: ");
        float annualInterest = scanner.nextFloat(); // could use double but the interest rate is a small number so we use float.
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period in years: ");
        byte years = scanner.nextByte(); // Number of payments | Used byte because the maximum number we want to support is 30.
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal 
            * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
            / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormated);
        
        scanner.close();

        //Well, this one works. Now I have an idea on how to write descriptive code.

        // I was close but not quite :)
        // double total = principal * (r*Math.pow((1+r), n)/Math.pow((1+r), n) -1);
        

        // These were covered above 
        // double r = (interest/100)/12; // monthly interest rate

        // double n = period * 12; 


        // double total = Math.pow(principal, interest); // raising to the power

        // System.out.println(principal); // tested the inputs
        // System.out.println(interest); // tested the inputs
        // System.out.println(Math.round(principal) + "^" + interest + " = " + total); //tested the input

        // Well, the maths on this one is not right.


        
    }
}
