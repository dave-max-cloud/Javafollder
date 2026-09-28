import java.util.Scanner;

public class NumberComparing{
public static void main(String[] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int firstNumber  = input.nextInt();
      
      System.out.print("Enter a number: ");
      int SecondNumber  = input.nextInt();
      
      if(seconNumber != 0){
      int result = firstNumber / secondNumber;
         System.out.print("Result: " + result);
      }
      else {
      System.out.println("Not divisible by zero");
      }
    }
  }
      
      
      
