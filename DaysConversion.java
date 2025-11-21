import java.util.Scanner;

public class DaysConversion
{
    public static void main (String[]args)
    {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter number of days: ");
        
        int totaldays = sc.nextInt();
        int year = totaldays/365;
        int months = (totaldays % 365) /30;
        int days = totaldays % 30;
        
        System.out.println(year + "Years" + months + "Months" +days+ "Days");
    }
}