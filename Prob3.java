import java.util.Scanner;

public class Prob3 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scan.nextInt();

        System.out.print("Enter student name here: ");
        String studentOne = scan.next();

        System.out.print("Enter student score: ");
        double score1=scan.nextDouble();

        for (int i =0; i < numStudents - 1; i++){
          System.out.print("Enter student name here: ");
          String student = scan.next();
          System.out.print("Enter a student score: ");
          double score = scan.nextDouble();
          
        

          if( score > score1 ){
            studentOne = student;
            score1 = score;
          }

        }


        System.out.print("Top student" + studentOne + "s score is " + score1);
    
    }
  }