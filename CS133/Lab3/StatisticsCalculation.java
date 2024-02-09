package cs.lab3;

import java.util.Scanner;

public class StatisticsCalculation 
{
	public int i = 0;
	private int n;
	private double[] numbers = new double[n];
	
	public StatisticsCalculation()
	{
		this.n = 0;
		
		for(int i = 0; i < this.numbers.length; i++)
		{
			this.numbers[i] = 0;
		}
	}
	
	public StatisticsCalculation(int n)
	{
		Scanner input = new Scanner(System.in);
		
		this.n = n;
		
		System.out.println("Enter " + n + " numbers for statistical calculation.");
		for(int i = 0; i < this.numbers.length; i++)
		{
			this.numbers[i] = input.nextDouble();
		}
	}
	
	public void add(double number)
	{
		numbers[i] += number;
		i++;
	}
	
	public void remove(double number)
	{
		for(int i = 0; i < this.numbers.length; i++)
		{
			if(numbers[i] == number)
			{
				numbers[i] = 0;
				break;
			}
		}
	}
	
	public void removeAll(double number)
	{
		for(int i = 0; i < this.numbers.length; i++)
		{
			if(numbers[i] == number)
			{
				numbers[i] = 0;
			}
		}
	}
	
	public void removeAll()
	{
		for(int i = 0; i < this.numbers.length; i++)
		{
			numbers[i] = 0;
		}
	}
	
	public double sum()
	{
		double sum = 0;
		
		for(int i = 0; i < this.numbers.length; i++)
		{
			sum += numbers[i];
		}
		
		return sum;
	}
	
	
}
