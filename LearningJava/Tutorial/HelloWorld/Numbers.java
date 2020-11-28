package LearningJava.Tutorial.HelloWorld;

import java.text.NumberFormat;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        // double result = (double)10 / (double)3;
        // System.out.println(result);
        

        
        // int x = 1;
        // int y = x++; // or you can switch the y=x++ to y=++x and it will change the outcomes
        // System.out.println(x);
        // System.out.println(y);
        /* Prints: */
        /* 2 */
        /* 1 */



        // int x =1;
        // x +=2; //this is the same as x = x + 2;
        // System.out.println(x);



        // //Implicit casting
        // //byte > short > int > long > float > double - No chance for data loss | these are compatible
        // double x = 1.1;
        // int y = (int)x + 2;
        // System.out.println(y);



        // //Implicit casting
        // //byte > short > int > long > float > double - No chance for data loss | these are compatible
        // String x = "1";
        // Integer.parseInt(x); // There is also Short.parseShort();
        // int y = Integer.parseInt(x) + 2;
        // System.out.println(y);



        //Implicit casting
        //byte > short > int > long > float > double - No chance for data loss | these are compatible
        // String x = "1.1";
        // Integer.parseInt(x); // There is also Short.parseShort();
        // double y = Double.parseDouble(x) + 2;
        // System.out.println(y);



        // int result = Math.round(1.1F);
        // System.out.println(result);



        // int result = (int)Math.ceil(1.1F); // returns the smallest intiger which is > OR = to the number, in this case 2. 
        // System.out.println(result);



        // int result = (int)Math.floor(1.1F); // returns the largest intiger that is < OR = to this number,  in this case is 1. 
        // System.out.println(result);



        // int result = (int)Math.max(1, 2); // This will return the greater number which is 2. there is also Math.min(1, 2)
        // System.out.println(result);



        // int result = (int) (Math.random()*100); // the parentheses are important here before the Math.random and after the 100 or the numbers will always be equal to 0.randomNo which will show 0 because I specified to be an integer.
        // System.out.println(result);



        // NumberFormat currency = NumberFormat.getCurrencyInstance();//creates new objects
        // String result = currency.format(1234567.891);
        // System.out.println(result);
        /* Prints: */
        /* £1,234,567.89 */



        // NumberFormat percent = NumberFormat.getPercentInstance();//formats a number as a percent
        // String result = percent.format(0.1); //this will be formated to a percentage: 10%
        // System.out.println(result);



        // String result = NumberFormat.getPercentInstance().format(0.1); //A shorter way to write the one above. Method Chaining.
        // System.out.println(result);



        // Reading input from an user //

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Age: ");
        // byte age = scanner.nextByte(); //use next.Double OR next.Float for an float 2.1 | For a string, things get different.
        // System.out.println("You are " + age);



        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: "); // You only get out the first name/token that you include here.
        String name = scanner.nextLine().trim(); //having .nextLine the program will store the entire line that the user enters.| Also added .trim() at the end to get rid of the white before and after the line. It won't do it for in between the line.
        System.out.println("You are " + name);


    }
    
}
