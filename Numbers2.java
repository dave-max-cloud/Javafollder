public class Numbers2{
public static void main(String[] args){

for(int number = 1; number <= 100; number++){
  
  int count = 0;
for(int index = 1; index <= number; index++){

  if (number % index == 0)
  	count++;
   
  }
  if (count == 2){
  System.out.println(number);
  }
}
}
}
