import java.util.Scanner;
public class Index{
  public static void main(String[] args) {
  Scanner input = new Scanner (System. in);
  
  System. out.print("Enter the weight in pounds: ");
  double weightInPounds = input.nextDouble();
  
  System. out.print("Enter the height in inches: "):
  double heightInInches = input.nextDouble();
  
  double bmi = (weightInPounds * 703) / (heightInInches * heightInInches);
  
  System.out.print("BMI="+ bmi);
  }
}
