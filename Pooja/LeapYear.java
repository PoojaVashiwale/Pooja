import java.util.*;
class LeapYear
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Plz Enter a year>=1582:");
int year=sc.nextInt();
if((year%4==0)&&(year%100!=0)||(year%400==0))
{
System.out.println("This is a leap year");
}
else
{
System.out.println("Not a leap year");
}
}
}