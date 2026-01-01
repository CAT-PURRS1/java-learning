package Exercise.Mortagecalculator;
import java.text.NumberFormat;
import java.util.Scanner;
public class MortageCalculator{
  public static void main(String[] args) {
    final byte MONTHS_IN_YEAR = 12;
    final byte PERCENTAGE = 100;
    int principle = 0 ;
    float annualInterestRate=0;
    float monthlyInterestRate=0;
    int numberOfPayments =0;
    byte years ;
    
    try (Scanner scanner = new Scanner(System.in)) {

      while (true) {
        System.out.print("Principle:");
        principle = scanner.nextInt();
       if (principle>=1000 && principle<=100000) 
         break;
         System.out.println("Please enter a valid value between 1000 to 100000");
       

      }
      while (true){System.out.print("Annual Interest Rate:");
      annualInterestRate = scanner.nextFloat();
       monthlyInterestRate= annualInterestRate/PERCENTAGE/MONTHS_IN_YEAR;
        if (annualInterestRate>0 && annualInterestRate<=30) 
          break;
          System.out.println("Please enter a value between 1 to 30");
}  
     while (true) {
      System.out.print("Period (In years):");
       years = scanner.nextByte();
      numberOfPayments = years*MONTHS_IN_YEAR;
      if (years>0 && years<=30) 
        break;
      System.out.println("Please enter a value between 1 to 30");
      
    }}
      
      
  double mortage = principle*monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberOfPayments)/(Math.pow(1+monthlyInterestRate, numberOfPayments)-1) ;

  String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortage);
  System.out.print("Mortage:");
      System.out.println(mortgageFormatted);
    }


  }

