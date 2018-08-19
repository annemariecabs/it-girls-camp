/*Maddie*/

import java.util.Scanner;

public class RockPaperScissors {

   public static Scanner keyboard = new Scanner(System.in);
  
   public static void main (String [] args) {
       for(int g = 1; g <= 3; g++){
      String uMove = userMove();
      String cMove = computerMove();  
    String result = compareMoves (uMove, cMove);
     if (result.equals("win")) {
   System.out.println(" Grand Champion!");
   }
   else if (result.equals("lose")) {
   System.out.println("A loss :-(");
   }
   else //result == tie
   System.out.println( "A Tie :-/"); 
   System.out.println("Thanks for playing! :-)");

   
   }
   }
    
    
    
     //I make my move  
   public static String userMove ()  {
      System.out.println ("Rock, paper, scissors, shoot!");
      System.out.println ("Type r for rock, p for paper, and s for scissors.");
      String move = keyboard.nextLine () ;
      return move;
       
   }
        //Computer choose their move
   public static String computerMove () {
    //move is an integer from 0-2
      int move = (int) (Math.random() *3);
     
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
         
   public static String compareMoves (String userMove, String computerMove) {
      if(userMove.equalsIgnoreCase("r")) {
         if(computerMove.equals ("r")) 
            return "tie";
         if(computerMove.equals ("p")) 
            return "lose";
         if(computerMove.equals ("s")) 
            return "win";
      
      }
      else if(userMove.equalsIgnoreCase("p")) {
         if(computerMove.equals ("r")) 
            return "win";
         if(computerMove.equals ("p")) 
            return "tie";
         if(computerMove.equals ("s")) 
            return "lose";
      }
      else if(userMove.equalsIgnoreCase( "s")) {
         if(computerMove.equals ("r")) 
            return "lose";
         if(computerMove.equals ("p")) 
            return "win";
         if(computerMove.equals ("s")) 
            return "tie";
                
      }
      else { 
         System.out.println("You messed something up!");
         return "Thumbs down!";
      }
      return "";
     
   }
}
  
