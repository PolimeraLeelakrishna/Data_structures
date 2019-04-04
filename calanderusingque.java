package com.bridgeit.Data_Structuress;

import com.bridgeit.DS.Utility.QueLinkedlist;
import com.bridgeit.utility.Utility;

public class calanderusingque 
{
	public static void main(String[] args) {
	QueLinkedlist<QueLinkedlist<Integer>> que=new QueLinkedlist<QueLinkedlist<Integer>>();
	QueLinkedlist<Integer> dates=new QueLinkedlist<Integer>();
	System.out.println("enter month");
	int m=Utility.getInt();
	System.out.println("enter year");
	int y=Utility.getInt();
	
	if(m<=12 && m>0 && (y>999))
	{
		int dayofweek=Utility.calday(m, y, 1);
		int[] month={0,31,28,31,30,31,30,31,31,30,31,30,31};
		if(Utility.leapyear(y)==true)
		{
			month[2]=29;
		}
		for(int i=1;i<month[m];i++)
		{
			dates.insert(i);
			System.out.println(dates);
			if(i+dayofweek%7==0 || i==month[m])
			{
				que.insert(dates);
				dates=new QueLinkedlist<Integer>(); 
             }
		}
	   for(int i=0;i<=dayofweek;i++)
	   {
		   System.out.print(" ");
	   }
	   for(int i=0;i<=que.size();i++)
	   {
		   QueLinkedlist<Integer> weeks=que.remove();
		 
		   for (int j=0;j<=weeks.size();j++)
		   {
			   System.out.println(weeks.remove()+ " ");
		   }
		   
	   }
		
	}
	else
	{
		System.err.println("enter valid number");
	}
	
}
}