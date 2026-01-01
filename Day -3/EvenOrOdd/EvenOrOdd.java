package Exercise.EvenOrOdd;
import java.util.Scanner;
 public class EvenOrOdd {
  public static void main(String[] args) {
    try(Scanner scr = new Scanner(System.in)){
    System.out.print("Enter a Number:");
    int a = scr.nextInt();
     if (a%2==0) 
       System.out.println("Even");
        System.err.println("Odd");
  }
  }
 }