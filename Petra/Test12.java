public class Test12 {
   public static void main(String args[]){
  System.out.println(scroll("" + 1234567));
   }
   
   public static String scroll(String s){
   char c = s.charAt(0);
   s= s.substring(1);
   return s+c;
   
   }
 } 
