package LearningJava.Tutorial.HelloWorld;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args){
        //principal ammount of loan you want to get
        //annual interest rate:
        //period in years: e.g. 30
        //Mortgage : have to calculat this also displayed as a currency

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Annual interest rate: ");
        double interest = scanner.nextDouble();

        System.out.print("Period in years: ");
        double period = scanner.nextDouble(); // Number of payments |I would like to introduce byte here 

        double r = (interest/100)/12; // monthly interest rate

        double n = period * 12; 

        double total = principal * (r*Math.pow((1+r), n)/Math.pow((1+r), n) -1);
        
        System.out.println(total);
        
        scanner.close();


        // double total = Math.pow(principal, interest); // raising to the power

        // System.out.println(principal); // tested the inputs
        // System.out.println(interest); // tested the inputs
        // System.out.println(Math.round(principal) + "^" + interest + " = " + total); //tested the input

        // Well, the maths on this one is not right.


        
    }
}
