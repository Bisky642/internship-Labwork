import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Exercise9 {
	public static void dateTime(int i,int j,int k)
	{
		LocalDate date=LocalDate.now();
		LocalDate date1=LocalDate.of(i, j, k);
		Period p=Period.between(date, date1);
		System.out.println("Years = "+Math.abs(p.getYears()));
	    System.out.println("Month = "+Math.abs(p.getMonths()));
	    System.out.println("Days = "+Math.abs(p.getDays()));
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter Year: ");
		int i=input.nextInt();
		System.out.println("Enter Month: ");
		int j=input.nextInt();
		System.out.println("Enter Day: ");
		int k=input.nextInt();
		input.close();
		dateTime(i,j,k);
	}

}
