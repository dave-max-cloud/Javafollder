public class Numbers{
public static void main(String[] args){

for(int number = 1; number <= 50; number++){
  boolean prime = true;

for(int index = 2; index <= number/2; index++){
  if (number % 2 == 0)
   prime = false;
  //break;
  }
  if (prime){
  System.out.println(number);
  }
}
}
}

