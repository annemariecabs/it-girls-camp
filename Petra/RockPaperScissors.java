import java.util.Scanner;

public class RockPaperScissors {

   public static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args){
      int wins = 0;
   
      for (int g = 1; g <= 3; g++){
      
         String umove = userMove();
         String cmove = computerMove();
         String result = compareMoves(umove, cmove);
         
         if(result.equals("win")) {
            System.out.println("A win");
            System.out.println("CONGRATULATIONS!!!! YOU WON");
            wins++;
         }
         
         else if (result.equals("lose")){
            System.out.println("A loss");
            System.out.println("Sorry, you lost. don't give up though!");
         }
         else  {
            System.out.println("A tie");
            System.out.println("You and the computer tied. You both won!");
         }
      }
      System.out.println("You have " + wins + " wins");
      
   } 
     //I make my move
   public static String userMove () {
      System.out.println ("Rock, paper, scissors, shoot!");
      System.out.println ("(Type r for rock, p for papeer, and s for scissors)"); 
      String move = keyboard.nextLine ();
       
      
      return move;
   }
      // Computer chooses their move
   public static String computerMove () {
         //move is an integer between 0-2
      int move = (int) (Math.random () * 3);
     
      switch(move) {
         case 0:
            return "r";
         case 1:
            return "p";
         case 2:
            return "s";
         default:
            System.out.println("you messed something up") ;
            return "";
         
      }
   }
    // compare the moves, determine whether I win, lose, or tie.
   public static  String compareMoves(String usrMove, String compMove) {
      if(usrMove.equalsIgnoreCase("r")) {
         if(compMove.equals("r")) 
            return "tie";
         if(compMove.equals("p")) 
            return "lose";
         if(compMove.equals("s")) 
            return "win";
      
      }
      else if(usrMove.equalsIgnoreCase("p")) {
         if(compMove.equals("r")) 
            return "win";
         if(compMove.equals("p")) 
            return "tie";
         if(compMove.equals("s")) 
            return "lose";
      
      }
      else if(usrMove.equalsIgnoreCase("s")) {
         if(compMove.equals("r")) 
            return "lose";
         if(compMove.equals("p")) 
            return "win";
         if(compMove.equals("s")) 
            return "tie";
      
      }
      else {
         System.out.println("I messed up near my else");
         return ""; 
       
      
      }
      return ""; }
      
      
// determine if there I win, lose or if it is a tie     
      
      
      
      
      
      
      
}
      
