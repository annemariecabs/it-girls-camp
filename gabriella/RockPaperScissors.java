//Gabriella
import java.util.Scanner;

public class RockPaperScissors {

   public static Scanner keyboard = new Scanner(System.in);

   public static void main (String[] args){
      String uMove = userMove() ;
      String cMove = computerMove() ;
      System.out.println("Your result is " + compareMoves(uMove, cMove));
   }
   // I make my move
   public static String userMove() {
      System.out.println("Rock, Paper, Scissors, Shoot!");
      System.out.println("(type r for rock, p for paper, and s for scissors)");
      String move = keyboard.nextLine();
      
      return move;
   }
  //Computer makes their move
   public static String computerMove() {
   //move is an integer between 0 and 2
      int move = (int) (Math.random() * 3);
      
      switch(move) {
         case 0:
            return "r";
         case 1:
            return "p";
         case 2:
            return "s";
         default:
            System.out.println ("You messed somthing up.");
            return "";
      }
   }
   //compare moves
   public static String compareMoves(String usrMove, String compMove) {
      if(usrMove.equalsIgnoreCase("r" )) {
         if(compMove.equals("r")) 
            return "tie" ;
         if(compMove.equals("p")) 
            return "lose" ;
         if(compMove.equals("s")) 
            return "win" ;
      }
      else if(usrMove.equalsIgnoreCase("p" )) {
         if(compMove.equals("r")) 
            return "win" ;
         if(compMove.equals("p")) 
            return "tie" ;
         if(compMove.equals("s")) 
            return "lose" ;
      }
      else if(usrMove.equalsIgnoreCase("s" )) {
         if(compMove.equals("r")) 
            return "lose" ;
         if(compMove.equals("p")) 
            return "win" ;
         if(compMove.equals("s")) 
            return "tie" ;
      }
      else {
         System.out.println ("I messed up near my else");
         return "" ;
      }
      return "" ;
   }
}