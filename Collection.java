import java.util.Scanner;
public class Collection{
  public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);

  int [] array = new int[5];
  for(int counter = 0; counter < 5; counter++){
  System.out.println("Enter number " + (counter + 1));
  int nextNumber = input.nextInt();
  
  array[counter] = nextNumber;
  
      }
      
  for(int counter = 0; counter < 5; counter++){
  
  System.out.println(array[counter] + "  ");
      } 
      
  int largest = array[0];

 
  for(int counter = 0; counter < array.length; counter++){
  if(array[counter] > largest){
  largest = array[counter];
      }
      }
      System.out.println("largest number is " + largest);
      

  int smallest = array[0];
  
  
    for(int counter = 0; counter < array.length; counter++){
    if(array[counter] < smallest){
    smallest = array[counter];
      }
    }
    System.out.println("smallest number is " + smallest);
    
    int Total = 0;
    for(int counter = 0; counter < array.length; counter++){
    Total = Total + array[counter];
    }
    float average = Total/array.length;
    System.out.print("Total average is " + average);
    }  
    }
    
  
  
