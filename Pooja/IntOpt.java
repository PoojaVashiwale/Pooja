import java.util.*;
class IntOpt
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter values of a, b and c:");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
System.out.println("The o/p of a+b*c is:"+(a+b*c));
System.out.println("The o/p of a*b+c is:"+(a*b+c));
System.out.println("The o/p of c+a/b is:"+(c+a/b));
System.out.println("The o/p of a%b+c is:"+(a%b+c));
}
}