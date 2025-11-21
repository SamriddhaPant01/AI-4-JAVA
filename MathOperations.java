import java.util.Scanner;

public class MathOperations
{
    public static void main (String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter grade");
        
        int grade = sc.nextInt();
        String result = (grade >= 40) ? "Passed." : "Failed.";
        System.out.println ("The student has " +result);
    }
}