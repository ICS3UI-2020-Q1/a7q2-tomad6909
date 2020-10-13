/**
 * This program will take an integer as a parameter and will print out every number that will divide the parameter evenly
 * @author David Toma
 */
public class Main {

  // create a method 
  public static int factors(int factor){
    // create a for statement 
    for(int i = 1; i <= factor; i++){
      // nested if statement to find the remainder
      if(factor %i == 0){
        System.out.println(i);
      }
    }
    // return the users number
    return factor;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // input the number that the user wants to divide
    factors(10);
  
    
  }
}
