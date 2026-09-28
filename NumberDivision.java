import java.util.Scanner;

public class NumberDivision{
public static void main(String [] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int number = input.nextInt();
      
      if(number % 3 == 0) {
      System.out.println("The number is divisible. ");
      }
      else {
        System.out.println("The number is not divisible. ");
        }
      }
    }
