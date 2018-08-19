public class Strings {

   public static void main(String[] args) {
      removeDashes=string("703-343-3810");
      System.out.println(removeDashes);
      
      }
      
   public static String removeDashes(String a) {
      String one = a.substring(0,3);
      String two = a.substring(4,7);
      String three = a.substring(8,12);
      return String one + String two + String three;
               
      }
      
 }