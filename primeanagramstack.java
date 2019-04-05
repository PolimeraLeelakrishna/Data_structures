

**********************************************
 *  @purpose      : print the prime anagram numbers using satck
 *  @author       : P.LEELA KRISHNA
 *  @version      : 1.0

//*****************************************


package com.bridgeit.Data_Structuress;
import java.util.ArrayList;
import java.util.Stack;
import com.bridgeit.utility.Utility;
public class primeanagramstack 
{
	
		public static void main(String[] args)
		{	try
		{
			primeanagramstack p = new primeanagramstack();
			Stack<String> stack = p.primeAnagram1();
			int len = stack.size();
			for(int i=0; i<len; i++) 
			{
				System.out.print(stack.pop()+" ");  
				System.out.println(stack.pop()+" ");
			}
		}
		
		catch (Exception e)
		{
			System.out.println(" ");
		}
		}
		// prime Anagram is implemented..................
		public Stack<String> primeAnagram1() 
		{
			Stack<String> stack = new Stack<String>();  			
			ArrayList<String> arr = Utility. primeNumbers(1000);
				for(int i=0; i<arr.size()-1; i++) 
				{
				for(int j=i+1; j<arr.size(); j++) 
				{
					if(Utility.isAnagram(String.valueOf(arr.get(i)),String.valueOf(arr.get(j)))) 
					{ 
						stack.push(String.valueOf(arr.get(i)));  
						stack.push(String.valueOf(arr.get(j)));
					}
				}
			}
				return stack;
		}
		
	}
