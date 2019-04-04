package com.bridgeit.Data_Structuress;


import com.bridgeit.DS.Utility.QueLinkedlist;
import com.bridgeit.utility.Utility;

public class calanderquee 
{
	
		public static void main(String[] args) 
		{	
			QueLinkedlist<QueLinkedlist<Integer>> queue =new QueLinkedlist<QueLinkedlist<Integer>>();
			  
			QueLinkedlist<Integer> qll = new QueLinkedlist<Integer>();
			try
			{
			System.out.println("Enter the month : ");
			 int m = Utility.getInt();
			System.out.println("Enter the year : ");
			final int y = Utility.getInt();
			
			
			if (((m<=12) && (m>=1)) && ((y>=1000) && (y<=9999)))
			{
				final int START_DAY = Utility.calday(m, y, 1);
				
				final int MONTH_ARR[] = {31,28,30,31,30,31,31,31,30,31,30,31};
				System.out.println("sun"+"\t"+"mon"+"\t"+"tue"+"\t"+"wed"+"\t"+"thus"+"\t"+"fri"+"\t"+"sat");
				
				if(y%4==0 && y%100!= 0 || y%400==0)	
				{
					MONTH_ARR[1]=29;
				}
				for (int i = 1; i <= MONTH_ARR[m-1]; i++) 
				{
					qll.insert(i);
					if (((i + START_DAY) % 7 == 0 || i==MONTH_ARR[m-1]) ) 
					{
						queue.insert(qll);
						qll=new QueLinkedlist<Integer>(); 
	               }
				}
				
				for (int i=0;i<START_DAY;i++)
				{
					System.out.print("\t");
				}
				
				for (int i=0;i<queue.size();i++)
				{
					QueLinkedlist<Integer> week= queue.remove();
					
					for (int j=0;j<week.size();j++)
					{	
						System.out.print(week.remove()+"\t");
					}
					System.out.println();
				}
			}
			else
			{
				System.err.println("please enter valid date and month.");
			}
			}
			catch(Exception e)
			{
				System.err.println("****************** Invalid Arguments ****************");
			}
		}
	}


