/* Petra, How do I turn on line numbers? */

public class OldMacdonald {


   public static void main (String[] args) {
   /*
      System.out.println(getVerse("cow", "moo"));
      System.out.println(getVerse("pig", "oink"));
      System.out.println(getVerse("sheep", "baaaa"));
      System.out.println(getVerse("horse", "neigh"));
      System.out.println(getVerse("chicken", "cluck"));
      System.out.println(getVerse("goat", "bleet"));
      System.out.println(getVerse("dog", "woof"));
      System.out.println(getVerse("cat", "meow"));
      System.out.println(getVerse("duck", "quack")); 
      */
      
      printVerse("cow", "moo");
   }
   
   public static String getVerse(String animal, String sound){
      return "the" + animal + "says" + sound;
   }
   
   public static void printVerse(String animal, String sound){
      System.out.println("Old MacDonald had a farm, ee-ii-ee-ii-oo");
      System.out.print("And on his farm he had a " + animal);
      System.out.print(", ee-ii-ee-ii-oo");
      System.out.println(" With a " + sound + ", " + sound + "," + " here and a");
      System.out.print( sound + ", " + sound + " there.");
      System.out.println("Here a " + sound + "," + "there a" + sound + "," + "everywhere a" + sound + sound);
      System.out.println("Old MacDonald had a farm, ee-ii-ee-ii-oo");
   
 }
 
 }

