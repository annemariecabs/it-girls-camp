public class Challenge {

   public static void main (String[] args) {
   ireton (4,5,6);
   }
   public static void ireton(int x, int y, int z) {
   if(x>y)
   System.out.println("x is greater");
   else {
   System.out.println("y is greater");  }
   if(x>z)
   System.out.println("x is greater");
   else {
   System.out.println("z is greater");  }
   if(y>z)
   System.out.println("y is greater");
   else {
   System.out.println("z is greater");  }
   
   }
 public class StringMethods {
   
   public static void main(String[] args) {

   String s = "Hello it's me I was wondering if it's";
   String s2 = "Somebody I used to know ";
   
   //boolean match1 = s.equals(s2);
   //System.out.println(match1);
   
   //boolean match2 = s.equalsIgnoreCase(s2);
   //System.out.println(match2);
   
   //int result1 = s.compareTo(s2);
   //System.out.println(result1);
   
   //int result2 = s.compareToIgnoreCase(s2);
   //System.out.println(result2);
   

   //int n = s.length();
   //System.out.println(n);
   
   //char ch = s.charAt(2);
   //System.out.println(ch); 
   
   //s2 = s.substring(7);
   //System.out.println(s2);
   
   //not inclusive
   //s2 = s.substring(3, 10);
   //System.out.println(s2);
   
   
   //s2 = s.concat(s2);
   //System.out.println(s2);
     
   //BELOW IT'S THE SAME METHOD, DIFFERENT PARAMETERS
   
   int k;  
   
   //k = s.indexOf('i');
   //System.out.println(k);
   
   //k = s.indexOf('i', 5);
   //System.out.println(k);
   
   //k = s.indexOf("hello");
   //System.out.println(k);
   
   //k = s.indexOf("hello", 10);
   //System.out.println(k);
   
   //BELOW IT'S THE SAME METHOD, DIFFERENT PARAMETERS
   
   //k = s.lastIndexOf('i');
   //System.out.println(k);
   
   //k = s.lastIndexOf('i', 7);
   //System.out.println(k);
   
   //k = s.lastIndexOf("it's");
   //System.out.println(k);
   
   //k = s.lastIndexOf("it's", 16);
   //System.out.println(k);
   
   String s3 = "hello hi hey";

   //s3 = s.toUpperCase();
   //System.out.println(s3);
   
   //s3 = s.toLowerCase();
   //System.out.println(s3);
   
   //s3 = s3.replace('h', 'c');
   //System.out.println(s3);
   
   //String s4 = " this is an example ";
   //s3 = s4.trim();
   //System.out.println(s3);
   
   String convert;
   int n = 50;
   
   //convert = "" + 50;
   //System.out.println(convert);
   
   //convert = Integer.toString(n);
   //System.out.println(convert);
       
   //convert = String.valueOf(n);
   //System.out.println(convert);
   
   //String num = "50";
   //int n = Integer.parseInt(num);
   
   char sample = 'a';
   boolean check;
   
   //check = Character.isDigit(sample);
   //System.out.println(check);
   
   //check = Character.isLetter(sample);
   //System.out.println(check);
   
   //check = Character.isLetterOrDigit(sample);
   //System.out.println(check);
   
   //check = Character.isUpperCase(sample);
   //System.out.println(check);
   
   //check = Character.isLowerCase(sample);
   //System.out.println(check);
   
   //sample = Character.toUpperCase(sample);
   //System.out.println(sample);
   
   //sample = Character.toLowerCase(sample);
   //System.out.println(sample);

   }
}

   }