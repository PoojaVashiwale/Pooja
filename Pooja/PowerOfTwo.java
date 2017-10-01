class PowerOfTwo
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int i;
for(i=1;i<=Math.pow(2,n);i++)
{
	System.out.println("2*"+i+"="+2*i);
}
}
}

