/* Bianca2 */

public class OldMacDonald {


   public static void main (String[] args) {
      verse("cat ", "meow");
      verse("pig ", "oink");
      verse("cow ", "moo");
      verse("dog ", "ruff");
      verse("horse ", "neigh");
      verse("chicken ", "cluck");
   }
   public static void verse (String animal, String sound) {
      System.out.println("Old MacDonald had a farm, ee-ii-ee-ii-oo");
      System.out.println("And on this farm he had a " + animal + "ee-ii-ee-ii-oo");
      System.out.println("With a " + sound + ", " + sound + " here ");
      System.out.println("And a " + sound + ", " + sound + " there ");
      System.out.println("Old MacDonald had a farm, ee-ii-ee-ii-oo");
   }
}