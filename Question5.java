import java.util.Scanner;

/**
 * Write a description of class Question5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Question5
{
    //Create a calculator class and take input usinbng scanner class
    public static void main (String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number");
        float num1=sc.nextFloat();
        System.out.println("Enter Second Number");
        float num2=sc.nextFloat();
        System.out.println("The sum of two numbers is:"+(num1+num2));
        System.out.println("The difference of two numbers is:"+(num1-num2));
        System.out.println("The product of two numbers is:"+(num1*num2));
        System.out.println("The division of two numbers is:"+(num1/num2));
        float greater = (num1>num2)?num1:num2;
        System.out.println("The greater number is"+greater);
    }
}