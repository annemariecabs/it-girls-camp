public class Strings {
   public static void main(String[] args) {
   System.out.println(scroll ("Cardinal"));
      System.out.println(removeDashes("703-343-3810"));
   } 
   public static String removeDashes(String s) { 
     String a = s.substring(0,3);
     String b = s.substring(4,7);
     String c = s.substring(8,12);
     return a + b + c;
    }
   public static String scroll(String cat) {
   char d = cat.charAt(0);
   return cat + d;
   }


}

