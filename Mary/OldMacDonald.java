public class OldMacDonald {


   public static void main (String[] args) {
      System.out.println (getVerse ("cow", "moo"));
      System.out.println (getVerse ("cat", "meow")); 
      System.out.println (getVerse ("duck", "quack"));
      verse ("cow", "moo");
      verse ("sheep", "baaa");
      verse ("pig", "oink");
      verse ("duck", "quack");
      verse ("cat", "meow");
    
   }
   
   public static String getVerse (String animal, String sound) {
     return "the " + animal + " says " + sound;
   }
   
   public static void verse (String animal, String sound) {
   System.out.println ("Old MacDonald had a farm E I E I O");
   System.out.println ("On that farm he had a " + animal + " E I E I O");
   System.out.println ("With a " + sound + " " + sound + " here " + sound + " " + sound + " and a " + sound + " " + sound + " there ");
   System.out.println ("Here a " + sound + " there a " + sound + " everywhere a " + sound + " " + sound);
   
  
    }
}