class Binary
{
public static void main(String args[])
{
int decimal=Integer.parseInt(args[0]);
int binary=0,base=1,rem,b=0,j,i=0;
int arr[]=new int[32];
while(decimal!=0)
{
rem=decimal%2;
binary=binary+rem*base;
arr[i]=binary;
i++;
decimal=decimal/2;
base=base*10;
}
for(j=arr.length-1;j>3;j--)
{
System.out.print(b);
}
System.out.println(binary);
}
}
