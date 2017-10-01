class HarmonicNumber
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int i;
float Hn=0;
	for(i=1;i<=n;i++)
	{
		Hn=Hn+1/i;
	}
		System.out.println("Harmonic no is: "+Hn);
}
}