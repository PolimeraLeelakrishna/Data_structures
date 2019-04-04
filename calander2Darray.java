package com.bridgeit.Data_Structuress;

import com.bridgeit.utility.Utility;

public class calander2Darray 
{
  public static void main(String[] args) 
  {
	  String[] months = { "  ","January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] date = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };// ends with 30 or 31 as ref
		int m = Integer.parseInt(args[0]);  // giving month number at command line arguments.
		int d = Integer.parseInt(args[1]);   // giving date number at command line arguments.
		int y = Integer.parseInt(args[2]);   // giving year number at command line arguments.
	
		if(m==2 && Utility.leapyear(y))   // if month is 2 and if its leap year then date of month will become 29.
		{
			date[m]=29;
		}
	    int day=Utility.calday(m, y, d);       // getting day of given date
	    int arr[][]=new int[6][7];          // tatke a array for giving multiple dates
	    int x = 1;  // intializing the x.
		for (int i = 0; i < 5; i++)   
		 {   
			for (int j = day;j < 7; j++)  
			{
				if (x <= date[m]) {
					arr[i][j] = x;   // stroring the x value into array
					x++;         // increment x value
				}
				}
			  day = 0;  // reinitialize the date.
		}
		System.out.println(" " + months[m] + " " + d + " " + y); 
		System.out.println("  Sun Mon Tue Wed Thu Fri Sat");

		for (int i = 0; i < 5; i++) {      
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] != 0)
					System.out.printf("%4d",arr[i][j]);   // print the vlaues.
				else
					System.out.printf("    ");
			}
		System.out.println();
		}
	}
  
 
}

	

