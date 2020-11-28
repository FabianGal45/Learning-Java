package LearningJava.MoshTutorial.HelloWorld;

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

        int result = (int) (Math.random()*100);
        System.out.println(result);
    }
    
}
