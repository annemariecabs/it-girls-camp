public class NewFolder2{

   public static void main (String[] args) {
   boolean findAsterisk;
   findAsterisk = string1 ("road work ahead");
   System.out.print (findAsterisk);
   }
   public static boolean string1(String s){
      if (s.length() > 0 && s.indexOf('*') == s.length()- 1)
      return true;
      
      else
         return false;
   } 
}
