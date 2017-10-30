
/**
 * Write a description of class Star here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Star
{
   public static void main (String[]args) {
      starA();
       }
   
   
   public static void starA() {
       int stars = 10;
       for (int x = 0; x < 10; x++) {
           for (int y = 0; y < stars; y++) {
               System.out.print("*");
               
               
               
           }
           stars--;
           System.out.println(" ");
       }
       
       
   }
   
   
   public static void starB() {
       int stars = 9;
       int spaces = 1;
       for (int x = 0; x < 10; x++) {
           for (int y = 0; y < spaces; y++) {
               System.out.print(" ");
               
               
               
           }
           spaces--;
           System.out.println("*");
       }
       
       
   }
}
