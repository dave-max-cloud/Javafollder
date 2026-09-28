import java.util.Scanner;

public class NumberComparison{
public static void main(String [] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int firstInteger= input.nextInt();
      System.out.print("Enter an integer: ");
      int seconInteger = input.nextInt();
      System.out.print("Enter an integer: ");
      int thirdInteger = input.nextInt();
      
      int largest = firstInteger;
      
      if(largest > secondInteger){
        System.out.println(largest);
      
      if(largest > thirdinteger){
        System.out.println(largest);
      }
      else{
        System.out.println("Not the largest. ");
        }
      }
    }
      
