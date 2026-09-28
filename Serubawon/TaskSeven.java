import java.util.Scanner;
public class TaskSix{
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);
 double price = input.nextInt();
 
 double calculatedTax = price * 0.7;
 
 double calculatedTotal = price + calculatedTax;
 
 System.out.println("Total is " + calculatedTotal);
 
 }
 }
  
