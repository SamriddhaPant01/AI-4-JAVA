import java.util.Scanner;

/**
 * Write a description of class Question4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question4
{
  public static void main(String[]arg)
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter Student's Name: ");
    String studentName =sc.nextLine();
    System.out.println("Enter Age: ");
    int Age =sc.nextInt();
    System.out.println("Enter GPA: ");
    float GPA =sc.nextFloat();
    System.out.println("Name is:"+studentName);
    System.out.println("Age is:"+Age);
    System.out.println("GPA IS:"+GPA);
  }
}