import java.util.Scanner;

public class ScannerExample {

   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter a String");
      String sampleString = keyboard.nextLine();
      
      System.out.println("Please enter an int");
      int sampleInt = keyboard.nextInt();
      
      System.out.println("Please enter a double");
      double sampleDouble = keyboard.nextDouble();
      
      System.out.println("You just wrote: " + sampleString + ", " + sampleInt
         + ", and " + sampleDouble);
   }
}
