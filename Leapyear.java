import java.util.Scanner;
public class Leapyear {

	public static void main(String[] args) {

		      int year;
		      System.out.println("Enter an Year :: ");
		      Scanner sc = new Scanner(System.in);
		      year = sc.nextInt();
if(year<1000)
{
	System.out.println("Please enter valid input");
}
		      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		         System.out.println("Specified year is a leap year");
		      else
		         System.out.println("Specified year is not a leap year");
		   }
		}