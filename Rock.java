// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = " ";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        personPlay = scan.next();
        personPlay = personPlay.toUpperCase();
        if (personPlay.equals("R")) {
            personPlay="Rock";
        }
        
        if (personPlay.equals("P")) {
            personPlay="Paper";
        }
        
        if (personPlay.equals("S")) {
            personPlay="Scissors";
        }
        
        System.out.println("Your play is " + personPlay);
        computerInt = generator.nextInt(2);
        if (computerInt == 0) {
            computerPlay = "Rock";
        }
        
        if (computerInt == 1) {
            computerPlay = "Paper";
        }
        
         if (computerInt == 2) {
            computerPlay = "Scissors";
        }
        
        System.out.println("The computer's play is " + computerPlay);
        if (computerPlay.equals(personPlay)) {
            System.out.println("You Tie!");
        }
        
        if (computerPlay.equals("Rock") && personPlay.equals("Scissors") || (computerPlay.equals("Scissors") && personPlay.equals("Paper")) || (computerPlay.equals("Paper") && personPlay.equals("Rock"))) {
            System.out.println("You Lose!");
        }
        
        if (computerPlay.equals("Rock") && personPlay.equals("Paper") || (computerPlay.equals("Scissors") && personPlay.equals("Rock")) || (computerPlay.equals("Paper") && personPlay.equals("Scissors"))) {
            System.out.println("You Win!");
        }
    }
}
