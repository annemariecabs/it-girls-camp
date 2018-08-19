import java.util.Scanner;
public class Pizza2{
   public static void main(String[]args){
      Scanner reader = new Scanner(System.in);
      System.out.print("Write a double you find is a large number and watch as it gets even larger.");
      double sausage = reader.nextDouble();
      double cheese = returnDouble(sausage);
      System.out.print(cheese);
      }
      public static double returnDouble(double pep){
         return pep*2;
         
         }
         
      }
