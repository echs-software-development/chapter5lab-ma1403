import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
    int positive = 0;
int negative = 0;
    int count = 0, total = 0, number;
  

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer, input ends at 0: ");
    number = scan.nextInt();
    
    while ( number != 0 ){
      if (number > 0 )
        positive++;
      else  {
        negative++;

      }

      total += number;
      count ++;

      number = scan.nextInt();
        
    }


      if( count ==0)
        System.out.println("No numbers are entered except 0");
      else {
        System.out.println("The number of positives is: "+ positive );
        System.out.println("The number of negatives is: " + negative);
        System.out.println("The total is: " + total);
        System.out.println("The average is "+ total * 1.0 /count);


  
      }
  }
}