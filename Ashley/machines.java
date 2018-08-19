public class Test9{
   public static void main (String []args) {  
     boolean findAsterisk;
      findAsterisk=string1("Road work ahead?");
      System.out.println(findAsterisk);
}
public static boolean string1(String s) {
if(s.length() > 0 &&  s.lastIndexOf('*') == s.length()-1)
      return true;
      else 
         return false;
       }
       
}
