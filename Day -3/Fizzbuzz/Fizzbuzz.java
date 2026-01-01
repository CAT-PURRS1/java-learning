package Exercise.Fizzbuzz;
import java.util.Scanner;
public class Fizzbuzz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your number:");
    int n = scanner.nextInt();
     if(n%3==0) {
      if(n%5==0)
    System.out.println("FizzBuzz");
    else
      System.out.println("Fizz");
  }
  else if ((n%5 == 0)){
    System.out.println("Buzz");
  }
 
  else{
    System.out.println(n);
  }
}
  }
  

