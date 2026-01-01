package Exercise.Calculator;
import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[]args){
    try(Scanner scr = new Scanner(System.in)){
    
   
   while (true) {
    System.out.print("Enter your First No:");
    int a = scr.nextInt();
    System.out.print("Enter your Second No:");
    int b =scr.nextInt();
    System.out.println(" 1-Addition\n 2-Subtraction \n 3-Multiplication \n 4-Division \n 5-Modulus \n 6-Quit");
    System.out.print("Value:");
    int n = scr.nextInt();
    {
   {switch (n) {
      case 1:
       System.out.println(("Addition:" )+ (a + b));
        
        break;
    
      case 2 :
        System.out.println(("Subtraction:") + (a - b));
        break;
        
      case 3 :
          System.out.println(("Multiplication:")+ (a * b));
          break;
      
      case 4:
        if(b>0)
          System.out.println(("Division:")+(a/b));
         else 
           System.out.println("Error can't divide by zero ");
      
      case 5 : 
      if(b>0)
          System.out.println(("Modulus:")+(a%b));
         else 
           System.out.println("Error can't divide by zero ");
        break;

      case 6 :
        System.out.println("Exiting calculator");
        return;
      default:
        System.out.println("Please enter valid values");
        ;
         
         }
          
          
        
   }
  
  
   }}}}}


