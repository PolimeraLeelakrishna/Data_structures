package com.bridgeit.Data_Structuress;

import com.bridgeit.DS.Utility.QueLinkedlist;
import com.bridgeit.utility.Utility;

public class primeanagramque 
{
   
	

		public static void main(String[] args) 
		{ 
			
			QueLinkedlist<Integer> qll = new QueLinkedlist<Integer>();
			
			final int PRIME[] = Utility.convertToIntegerArray();
			
			for (int i=0;i<PRIME.length;i++)
			{
				qll.insert(PRIME[i]); 
			}
			qll.display(); 

	}
	}


