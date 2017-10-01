class TemperatureConversion
{
  public static void main(String[] args)
  {
    float temperatue,celcius;
      
 
     temperatue =Float.parseFloat(args[0]);
 
    celcius = ((temperatue - 32)*5/9);
 
    System.out.println("Temperatue in Celsius = " + celcius);
  }
}