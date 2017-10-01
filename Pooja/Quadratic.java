import java.util.*;
import java.lang.*;
class Quadratic
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter values of a, b and c:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
double d=(Math.sqrt(b*b-4*a*c));
double root1=-(b+d)/(2*a);
double root2=-(b-d)/(2*a);
System.out.println("Roots of equation are:"+root1);
System.out.println("Roots of equation are:"+root2);
}
}
