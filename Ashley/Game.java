//ASHLEY
import java.util.Scanner;

public class Game          {

   public static Scanner keyboard = new Scanner(System.in);

   public static void main (String[] args)   {          
      for (int g = 1; g<=3; g++) {
         String uMove = userMove();
         String cMove = computerMove();
         String result = compareMoves(uMove, cMove);
         if (result.equals("win"))  {
            System.out.println("A Win: ");
         
      }
      else if (result.equals("lose"))  {
         System.out.println("A loss");
   }
   else 
      System.out.println("A tie");      
   }
   
  } 
   public static String userMove()           {
      System.out.println("Rock, paper ,scissors , shoot!");
      System.out.println("(Type r for rock, p for paper and s for scissors)");
      String move = keyboard.nextLine();
      
      return move;
      
   }
   public static String computerMove()             {
      int move = (int) (Math.random()  * 3);
       
      switch(move)                               {
         case 0: 
            return "r";
         case 1:
            return "p";
         case 2:
            return "s";
         default:
            System.out.println("you messed something up");
            return "";
            
      }
   }
   
   public static String compareMoves(String usrMove, String compMove) {
      if(usrMove.equalsIgnoreCase ("r"))                             {
         if(compMove.equals("r")) 
            return "tie";
         if(compMove.equals("p")) 
            return "lose";
         if(compMove.equals("s")) 
            return "win";
         
      } 
      else if(usrMove.equalsIgnoreCase ("p"))  {
         if(compMove.equals("r")) 
            return "win"; 
         if(compMove.equals("p")) 
            return "tie";
         if(compMove.equals("s")) 
            return "lose";
         
      } 
      else if(usrMove.equalsIgnoreCase ("s"))  {
         if(compMove.equals("r")) 
            return "lose";
         if(compMove.equals("p")) 
            return "win";
         if(compMove.equals("s")) 
            return "tie";
         
      } 
      else                 {
         System.out.println("I messed up near my else");
         return "";
      }
   
      return "";
   
   }
}