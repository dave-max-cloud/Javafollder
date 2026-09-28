import java.util.Scanner;
public class Sequence{
    public static void main(String [] args){
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      long number = input.nextlong();
      long counter = 1;
      for(counter = 1;counter<= number;counter++){
      number = (counter * number);
        counter ++;
      System.out.print(counter * number);
