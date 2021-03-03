import java.util.Scanner;

public class Prob1 {
  public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter a number of grades: ");
  int times = scan.nextInt();
  int sumOfGrades = 0;
  
  for (int i = 0; i <= times; i++){

  
  System.out.println("Enter actual grades:" + i +"-->" );
  int grade = scan.nextInt();
  sumOfGrades = sumOfGrades + grade;
  sumOfGrades += grade;
  }
  
  System.out.println("Final Sum is "+ sumOfGrades );\
  
  
  }
}