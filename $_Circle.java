import java.util.Random;
import java.util.Scanner;
public class $_Circle{
public static void main (String[] args)
{
    
 Scanner sc=new Scanner(System.in);   

// variables datatypes byte short int long float double// string char boolean "Aadim" char'A' boolean true or false
//System.out.print("ArenYou: ");
//boolean ifStudent = sc.nextBoolean();
Random random = new Random();
int luckynum = random.nextInt(1,7); 
System.out.print(luckynum + "\n");

}
}