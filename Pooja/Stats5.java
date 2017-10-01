class Stats5
{
public static void main(String args[])
{
double x1=Math.random();
double x2=Math.random();
double x3=Math.random();
double x4=Math.random();
double x5=Math.random();
System.out.println("Random no is: "+x1);
System.out.println("Random no is: "+x2);
System.out.println("Random no is: "+x3);
System.out.println("Random no is: "+x4);
System.out.println("Random no is: "+x5);
double min=Math.min(x1,Math.min(x2,Math.min(x3,Math.min(x4,Math.min(x5))))
);
System.out.println("min Random Number in series: "+ min);
//double max=Math.max(r1,Math.max(r2,Math.max(r3,Math.max(r4,r5))));
//System.out.println("max Random Number in series: "+ max);

}
}