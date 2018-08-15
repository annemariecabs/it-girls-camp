/* AnneMarie , How do I turn on line numbers? */

public class OldMacDonald {


   public static void main (String[] args) {
      printVerse(" cow ", " moo");
      printVerse(" duck ", " quack ");
      printVerse(" horse ", " neigh ");
      printVerse(" dog ", " woof ");
      printVerse(" chicken ", " cluck ");
     
   }
      
   public static void printVerse (String animal, String sound) { 
      System.out.println("Old MacDonald had a farm, Ee-ii-ee-ii-oo");
      System.out.print("On this farm, he had a " + animal + "ee-ii-ee-ii-oo"); 
      System.out.println("ee-ii-ee-ii-oo");
      System.out.print("With a " +sound+ "," +sound+ " here"); 
      System.out.println(" and a " +sound+ "," +sound+ "there");  
     
            
   }     
}