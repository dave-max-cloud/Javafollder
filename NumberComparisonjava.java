import java.util.Scanner;

public class NumberComparison{
public static void main(String [] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      int numberOne = input.nextInt();
      System.out.print("Enter a number: ");
      int numberTwo = input.nextInt();
      System.out.print("Enter a number: ");
      int numberThree = input.nextInt();
      System.out.print("Enter a number: ");
      int numberFour = input.nextInt();
      
      int high = numberOne;
      int low = numberTwo;
      
      if (numberTwo > high);
      high = numberTwo;
      if (numberThree > high);
      high = numberThree;
      if (numberFour > high);
      high = numberFour;
      if (numberFive > high);
      high = numberFive;
      if (numberThree < low);
      low = numberThree;
      if (numberFour < low);
      low = numberFour;
      if (numberFive < low);
      low = numberFive;
      
      System.out.println("high:" + high);
      System.out.println("low:" + low);
      }
    }
      
