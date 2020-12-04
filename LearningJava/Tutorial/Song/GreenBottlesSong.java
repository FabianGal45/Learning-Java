package LearningJava.Tutorial.Song;

public class GreenBottlesSong {
    public static void main(String[] args) {
        String[] bottles = {"Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
         //bottles[i+1].toLowerCase();

        // System.out.println(bottlesLeft);
        for (int i = 0; i <= bottles.length; i++) {
          String bottlesLeft = bottles[i+1].toLowerCase();
          System.out.println(bottles[i] + " green bottles hanging on the wall.");
          System.out.println(bottles[i] + " green bottles hanging on the wall.");
          System.out.println("And if one green bottle, should accidentally fall.");
          System.out.println("There'll be " + bottlesLeft +" green bottles, hanging on the wall.");
          System.out.println("");
          // System.out.println(cars[i+])
        }
        for (int r = 0; r <= 1; r++) {
          System.out.println("One green bottle hanging on the wall.");
        }
        System.out.println("And if that green bottle, should accidentally fall.");
        System.out.println("There'll be no green bottles, hanging on the wall.");

        //Probably change this with if i=Two...

      }
}
