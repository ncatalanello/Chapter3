// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//              
// ****************************************************************

import java.util.Scanner;
public class PowersOf2
{
        public static void main(String[] args)
        {
            int numPowersOf2;        //How many powers of 2 to compute
            int nextPowerOf2 = 1;        //Current power of  2
            int exponent = 0;                //Exponent for current power of 2 -- this
                                         //also serves as a counter for the loop
            Scanner scan = new Scanner(System.in);
 
            System.out.println("How many powers of 2 would you like printed?");
            numPowersOf2 = scan.nextInt();
                    
            System.out.println(numPowersOf2 + " powers of 2 will now be printed");
            
            System.out.println("2^" + exponent + " = 1");
 
            while (numPowersOf2 > 0)
            {
                
                
                nextPowerOf2 = nextPowerOf2 * 2;
                
                System.out.println("2^" + exponent + " = " + nextPowerOf2);
 
                //find next power of 2 -- how do you get this from the last one?
 
                exponent++;
                
                numPowersOf2--;
            }
        }
}
