//Chapter2Test double x = (11 + 4) / 2; System.out.println(x); What answer do you get? The answer is not precise.
//Write a Java program that precisely calculates the average between two integers that input from the keyboard, and prints the answer to the screen. The average displayed must be accurate, including when the average of the two numbers is a decimal.

//Simone J. Fowlin 11/12/2020
//Test lab
import java.util.Scanner;
public class Chapter2Test {
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);

  double myDouble = (65 * 2)/ 6;
  double myInt =(int) (65 * 2)/ 6;
  
  System.out.println(myDouble);
  System.out.println(myInt);
  }
}