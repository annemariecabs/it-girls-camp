import java.util.Scanner;

public class MyMath {
   public static Scanner keyboard = new Scanner(System.in);
   
   public static void main (String[] args) {
      System.out.println("Please enter a number: ");
      int a = keyboard.nextInt();
      System.out.println("Please enter a number: ");
      int b = keyboard.nextInt();
      
        
      System.out.println("Max of " + a + " and " + b + ": " + max(a, b));
   }

   public static int max (int x, int y) {
      int big;
      if (x > y) 
         big = x;
      else
         big = y;
      return big;
   }


   public static int adding(int num1 , int num2) {
      return num1 + num2;
   }
  
}
