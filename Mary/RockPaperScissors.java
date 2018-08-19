import java.util.Scanner;

public class RockPaperScissors {
   
   public static Scanner keyboard = new Scanner (System.in);
   
   public static void main (String[]args){
      String uMove;
      String cMove;
      
      for(int i = 0; i < 3; i++) {
         System.out.println("\ngame " + (i + 1));
         uMove = userMove();
         cMove = computerMove();
         System.out.println("Your result is " + compareMoves(uMove, cMove));
      }
      
   }
   public static String userMove () {
      System.out.println("Rock, paper scissors, shoot!");
      System.out.println("(Type r for rock, p for paper and s for scissors)");
      String move = keyboard.nextLine ();
      
      return move;
   }
   public static String computerMove() {
      //move is an integer between 0-2
      int move = (int) (Math.random() * 3);
      
   
   switch(move) {
      case 0:
         return "r";
      case 1:
         return "p";
      case 2:
         return "s";
      default:
         System.out.println ("you messed something up");
         return "";
      }

   }
   public static String compareMoves(String usrMove, String compMove) {
      if(usrMove.equalsIgnoreCase("r")) {
         if(compMove.equals("r")) return "tie";
         if(compMove.equals("p")) return "lose";
         if(compMove.equals("s")) return "win";
  
         }
      if(usrMove.equalsIgnoreCase("p")) {
         if(compMove.equals("r")) return "win";
         if(compMove.equals("p")) return "tie";
         if(compMove.equals("s")) return "lose";
         }
      if(usrMove.equalsIgnoreCase("s")) {
         if(compMove.equals("r")) return "lose";
         if(compMove.equals("p")) return "win";
         if(compMove.equals("s")) return "tie";
         }
      else  {
         System.out.println("I messed up near my else");
         return "";
         }
         return "";   
    }
}