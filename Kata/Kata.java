import java.util.Scanner;
public class Kata{
public static void main(String[] args){
 Scanner input = new Scanner(System.in);
 
 System.out.println("Enter a number:");
 int number = input.nextInt();
 
 //System.out.println("Enter second number:");
 //int num2 = input.nextInt();
 
 System.out.print(perfectsquare(number));
 }
 

  public static int maxNumber(int num1, int num2){
    if(num1 > num2){
    return num1;
    }
    else{
    return num2;
    }
    }
  
  public static boolean isEven(int number){ 
  
    if (number % 2 == 0){
        return true;
     }
    else{
        return false;
     }
     }
    
  public static boolean isPrime(int number){
           
      boolean isPrime = true;
      for(int index = 2; index < number; index++) {
        if(number % index == 0) {
        isPrime = false;
        break;
            }
        }
        
      if (isPrime) {
        return true;
        }
        else {
          return false;
            }
            }
            
    public static int subtract(int num1, int num2){
    if (num1 < num2){
    return num2 - num1;
    }
    else{
    return num1 - num2;
    }
    }
    
    public static float divide(float num1, float num2){
    float result = num1 / num2;
    if (num2 == 0){
    return 0;
    }
    else{
    return result;
    }
    }
    
    public static int factors(int number){
    int counter = 0;
    for (int count = 1; count <= number; count++){
    if(number % count == 0){
      counter++;
    
    }
    
    }
    return counter;
    }
    public static boolean perfectsquare(int number){
     if(Math.sqrt(number) % 1 == 0){
         return true;
     }
      else{
          return false;
          
      }
    
    }
    
    
    
    
    
    
  }
