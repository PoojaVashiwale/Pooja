class CarLoan
{
public static void main(String args[])
{
float P=Float.parseFloat(args[0]);
int Y=Integer.parseInt(args[1]);
float R=Float.parseFloat(args[2]);
int n=12*Y;
float r=R/12*100;
Double payment=P*r/(1+Math.pow((1-r),-n));
System.out.println(payment);
}
}

