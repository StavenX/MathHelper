package staven;

/**
 * This class provides support for mathematic
 * operations. It provides unlimited amounts of input
 * in calculating.
 * 
 * @author Staven
 * @version 0.01 (31.01.2018)
 */
public class MathHelper 
{
	/**
	 * Add numbers together
	 * 
	 * @return Final calculated number
	 */
	public static double addition(double... args)
	{
		double finalNumber = 0;
		for(double number : args)
		{
			finalNumber += number;
		}
		return finalNumber;
	}
	
	/**
	 * Subtract numbers 
	 * 
	 * @return Final calculated number
	 */
	public static double subtraction(double... args)
	{
		double finalNumber = 0;
		for(double number : args)
		{
			finalNumber -= number;
		}
		return finalNumber;
	}
	
	/**
	 * Multiplies numbers 
	 * 
	 * @return Final calculated number
	 */
	public static double multiplicate(double... args)
	{
		double finalNumber = 1;
		for(double number : args)
		{
			finalNumber *= number;
		}
		return finalNumber;
	}
	
	/**
	 * Divides numbers 
	 * 
	 * @return Final calculated number
	 */
	public static double divide(double... args)
	{
		double finalNumber = 1;
		for(double number : args)
		{
			finalNumber /= number;
		}
		return finalNumber;
	}
	
	/**
	 * Power numbers 
	 * 
	 * @return Final calculated number
	 */
	public static double power(double... args)
	{
		double finalNumber = 0;
		for(double number : args)
		{
			finalNumber = Math.pow(finalNumber, number);
		}
		return finalNumber;
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println(MathHelper.power(1,4,23,4,1));
	}
}
