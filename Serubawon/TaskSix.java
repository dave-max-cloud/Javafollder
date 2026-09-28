import java.util.Scanner;
public class TaskSix{
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);
  
 System.out.println("Enter a number");
  int firstNumber = input.nextInt();
  
 System.out.println("Enter a number");
  int secondNumber = input.nextInt();
  
  int sum = firstNumber + secondNumber;
  
  int difference = firstNumber - secondNumber;
  
  int product = firstNumber * secondNumber;
  
  int quotient = firstNumber / secondNumber;
  
  
  System.out.print(sum);
  
  System.out.println(difference);
  
  System.out.println(product);
  
  System.out.println(quotient);
  
 }
 }
 


