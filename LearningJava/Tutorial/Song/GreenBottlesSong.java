package LearningJava.Tutorial.Song;

public class GreenBottlesSong {
    public static void main(String[] args) {
        String[] bottles = {"Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
        for (String i : bottles) {
          System.out.println(i + " green bottles hanging on the wall.");
          System.out.println(i + " green bottles hanging on the wall.");
          System.out.println("And if one green bottle, should accidentally fall.");
          System.out.println("There'll be -1 green bottles, hanging on the wall.");
          System.out.println("");
          if (i == "Two") {
              System.out.println("One green bottle hanging on the wall.");
              System.out.println("One green bottle hanging on the wall.");
              System.out.println("And if that green bottle, should accidentally fall.");
              System.out.println("There'll be no green bottles, hanging on the wall.");
            }
        }
      }
}
