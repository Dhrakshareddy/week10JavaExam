package com.week10.employee;

public class DiamondPattern
{
	public static void main(String[] args) {
		
     int number = 5;
		
		for(int value1=1;value1<=number*2-1;value1++)
		{
			for(int value2=1;value2<=number*2-1;value2++)
			{
				if(value1<=number) 
				{
					if(value2<number-value1+1 || value2>number-1+value1) 
					{
						System.out.print(" ");
					}
					else 
					{
						System.out.print("*");
					}
				}
				else 
				{
					if(value2<value1-number+1 || value2>2*number+4-value1) 
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print("*");
					}
				}
			}
			System.out.println();
		
	}
	}
	}


