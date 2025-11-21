import java.util.Scanner;

public class TimeOperation
{
    public static void main (String []args)
    {   
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of seconds:");
        
        int totalSeconds = sc.nextInt();
    
        int hours = totalSeconds / 3600;
        int minutes = totalSeconds % 60;
        int sec = totalSeconds % 60;
        System.out.println(hours+":"+minutes+":"+sec);
    }
}