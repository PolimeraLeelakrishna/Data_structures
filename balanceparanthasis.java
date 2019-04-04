package com.bridgeit.Data_Structuress;

import com.bridgeit.DS.Utility.stack;
import com.bridgeit.utility.Utility;

public class balanceparanthasis 
{
    public static void main(String[] args) 
    {
		char search;
		stack<Character> stack = new stack<Character>(); // creating Obj of Stack
		System.out.println("giving expresion");
		String expression=Utility.getString();
		int length=expression.length();
		for(int i=0;i<length;i++)
		{
			search=expression.charAt(i);
			if(search=='(' || search=='{'|| search=='[')
			{
				stack.push(search);
			}
			else if(search==')'|| search=='}' || search=='[')
			{
				stack.pop();
			}	
		}
	      
	      
		if (stack.isempty() == true) // condition to check stack object is empty or not
		{
			System.out.println("Arithmetic Expression balanced");
		} else {
			System.out.println("Arithmetic Expression not balanced");
		}
		
	}
}
