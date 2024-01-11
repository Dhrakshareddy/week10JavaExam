package com.week10.employee;

public class SqurePattern {
	public static void main(String[] args) {
		int number=5;
		for(int value=1;value<=number;value++) {
			for(int value2=1;value2<=number;value2++) {
				if(value==1||value==number||value2==1||value2==number) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
