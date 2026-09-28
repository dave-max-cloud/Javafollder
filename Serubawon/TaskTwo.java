import java.util.Scanner;
public class TaskTwo{
 public static void main(String[] args){

 Scanner input = new Scanner(System.in);

 System.out.println("Enter your name");
  String name = input.nextLine();
 
 System.out.println("Enter your age");
  int age = input.nextInt();
 
 System.out.printf("Hello %s,You are %d years old.", name, age );
 
 }
}
