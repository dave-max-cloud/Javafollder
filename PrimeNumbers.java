public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;

         for (int number = 2; number <= 100; number++) {
            boolean isPrimeNumber = true;
            for (int index = 2; index <= Math.sqrt(number); index++) {
                if (number % index == 0) {
                   isPrimeNumber = false;
                     }
                }
             if (isPrimeNumber) {
            System.out.println(number + " ");
                count++;
            }
        }
            System.out.println("Number of prime Numbers: " + count);
            }
        }
