package LearningJava.Tutorial.Tutorial;

public class Tutorial {
    public static void main(String[] args){
        // int x = 1;
        // int y =1;

        // System.out.println(x == y); //x is equal to y therfore True
        //System.out.println(x !=y); //x is equal to y therfore false as it is asking for inequality
        
        
        
        // int temperature = 22;
        // boolean isWarm = temperature > 20 && temperature < 30;
        // System.out.println(isWarm);
        // RESULT: true



        // int temperature = 12;
        // boolean isWarm = temperature > 20 && temperature < 30;
        
        // System.out.println(isWarm);
        // RESULT: false



        // Great Example // 
        // boolean hasHighIncome = true;
        // boolean hasGoodCredit = false;

        // boolean isEligible = hasHighIncome || hasGoodCredit;
        // System.out.println(isEligible);




        // Great Example // 
        // boolean hasHighIncome = true;
        // boolean hasGoodCredit = false;
        // boolean hasCriminalRecord = false;

        // boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        // System.out.println(isEligible);



        // int temp = 23;
        // if (temp > 30){
        //     System.out.println("It's a hot day!");
        //     System.out.println("Drink plenty of water!");
        // } else if (temp > 20){
        //     System.out.println("Beautiful day");
        // } else {
        //     System.out.println("Cold day!");
        // }




        // int income = 120_000;
        // if (income > 100_000){
        //     boolean hasHighIncome = true; // a variable set in the if code block can only be accessed only inside the if statement. 
        // }


        // int income = 120_000;
        // boolean hasHighIncome = true; 
        // if (income > 100_000){
        //     hasHighIncome = true;
        // } else{
        //     hasHighIncome = false;
        // }
        // System.out.println(hasHighIncome);


        // A shorter way to write/a more proffesional way
        // int income = 120_000;
        // boolean hasHighIncome = false; 
        // if (income > 100_000){
        //     hasHighIncome = true;
        // }
        // System.out.println(hasHighIncome);


        // An even shorter way to write/a more proffesional way
        // int income = 120_000;
        // boolean hasHighIncome = (income > 100_000); 

        // System.out.println(hasHighIncome);


        
        // Example of amatour code
        // int income = 120_000;
        // String className;
        // if (income > 100_000){
        //     className = "First class";
        // } else {
        //     className = "Economy class";
        // }

        // A shorter way to write the code 
        // int income = 120_000;
        // String className = "Economy class";
        // if (income > 100_000){
        //     className = "First class";
        // }


        // An even shorter way and proffesional way to write the code.
        // int income = 120_000;
        // String className = income > 100_000 ? "First class" : "Economy class";


    }
}
