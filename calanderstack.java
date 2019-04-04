package com.bridgeit.Data_Structuress;

import com.bridgeit.DS.Utility.stackusing_LinkedList;
import com.bridgeit.utility.Utility;

public class calanderstack 
{
	static int[][] arr=new int[6][7];
     @SuppressWarnings("unchecked")
	public static void main(String[] args) 
     {
    	 @SuppressWarnings("rawtypes")
		stackusing_LinkedList stack=new stackusing_LinkedList();
    	 @SuppressWarnings("rawtypes")
		stackusing_LinkedList stack1=new stackusing_LinkedList();
    	 int dayinmonth=0;
    	 int d=0;
    	 int m=Integer.parseInt(args[0]);    // 
    	 int y=Integer.parseInt(args[1]);
    	 int day=Utility.calday(m, y, d);
    	 if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
 			dayinmonth = 31;
    	 }
    	 else if (m == 4 || m == 6 || m == 9 || m == 12) {
 			dayinmonth = 30;
    	 }
    	 else if(m==2)
    	 {
    	    if(Utility.leapyear(y)==true)
    	    {
    	    	dayinmonth=28;
    	    }
    	    else
    	    {
    	    	dayinmonth=29;
    	    }
    	 }
    	 int count=1;
       	for (int i = 0; i < 6; i++) 
 		{
 			for (int j = day; j < 7; j++) {
 				if (count <= dayinmonth) {
 					arr[i][j] = count;
 				
 					stack.push(arr[i][j]);
 					count++;

 				} else {
 					break;
 				}

        		// System.out.println(arr[i][j]);
 			}
 			day= 0;
 		}
 		for(int i=0;i<=dayinmonth;i++)
 		{
 			stack1.push(stack.pop());
 		}
 		System.out.println("sun\tMon\tTue\twed\tThu\tFri\tSat");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (arr[i][j] == 0) {
					System.out.print("\t");
				} else if (arr[i][j] > 9) {
				 int val =  (Integer) stack1.pop();
					System.out.print(+val + "\t");
				} else {
					int val =  (Integer) stack1.pop();
					System.out.print(+val + "\t");
				}
			}
			System.out.println();
		}

	}
}
     


