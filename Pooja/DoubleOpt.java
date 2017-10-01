import java.util.*;
class DoubleOpt
{
public static void main(String args[])
{
double a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter values of a, b and c:");
a=sc.nextDouble();
b=sc.nextDouble();
c=sc.nextDouble();
System.out.println("The o/p of a+b*c is:"+(a+b*c));
System.out.println("The o/p of a*b+c is:"+(a*b+c));
System.out.println("The o/p of c+a/b is:"+(c+a/b));
System.out.println("The o/p of a%b+c is:"+(a%b+c));
}
}