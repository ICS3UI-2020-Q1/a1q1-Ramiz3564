import java.util.Scanner; 

/**
 *To convert Celcius into Fahrenheit
 * @author Zach Ramirez 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create the scanner for user input
    Scanner input = new Scanner(System.in);

    String temperature;

    // ask user for a temperature
    System.out.println("Please enter your temperature in celcius:");
    //initialize the users temperature
    int temp = input.nextInt();

    final int CELCIUS_FAHRENHEIT = temp * 9 / 5 + 32;

    int finalTemp = CELCIUS_FAHRENHEIT;

    System.out.println("your temperature is " + finalTemp);
  }
}