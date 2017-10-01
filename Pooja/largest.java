import java.util.*;
class largest
{
public static void main(String args[])
{
int largest,second,smallest,second1;
int n=Integer.parseInt(args[0]);
int a[]=new int[10],i;
Scanner sc=new Scanner(System.in);
for(i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
	System.out.print(a[i]+"\t");
	
}
System.out.println();
if(a[1]>a[0])
{
	largest=a[1];
	second=a[0];
}
else
{
	largest=a[0];
	second=a[1];
}
System.out.println(second+" "+largest);
for(i=2;i<n;i++)
{
	if(a[i]>largest)
	{
		second=largest;
		largest=a[i];
	
	}
	else if(a[i]>second)
	{
		second=a[i];
	}
}
System.out.println("Largest is:"+largest);
System.out.println("Second large is:"+second);






if(a[1]>a[0])
{
	smallest=a[0];
	second1=a[1];
}
else
{
	smallest=a[1];
	second1=a[0];
}
System.out.println(second1+" "+smallest);
for(i=2;i<n;i++)
{
	if(a[i]<smallest)
	{
		second1=smallest;
		smallest=a[i];
	
	}
	else if(a[i]<second1)
	{
		second1=a[i];
	}
}
System.out.println("smallest is:"+smallest);
System.out.println("Second smallest is:"+second1);
}
}

