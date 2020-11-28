package LearningJava.MoshTutorial.HelloWorld;

public class Main {
    public static void main(String[] args){
        String message = "   Hello World "+ "!!    ";
        System.out.println(message.replace("!","*").trim()); //.trim gets read of spaces befor and after a string that has either been inserted by user or set.
    }
}
