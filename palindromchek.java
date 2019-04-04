package com.bridgeit.Data_Structuress;

import com.bridgeit.DS.Utility.Dq_operations;
import com.bridgeit.utility.Utility;

public class palindromchek 
{
	public static void main(String[] args)
    {
        String s1="";                         // initializing empty string
        System.out.println("Enter a word :");
        String word=Utility.getString();        
        if(word.matches("[a-zA-Z]+"))   //enter the words are in between the a to z
        {
        	Dq_operations que=new  	Dq_operations (word.length()); // create object
        	
        	for(int i=0;i<word.length();i++)
        	{
        		que.addRear(word.charAt(i));  //Adding elements to que  
        	}
        	for(int i=0;i<word.length();i++)
        	{
        		s1=s1+que.getFront();    // getting elements from front in this case we get in reverse order.
        	}
        	if(word.equals(s1))       // if reverse string is equal to given string its palindrome
        	{
        		System.out.println(word+"  Word is palindrome");
        	}
        	else  
        	{
        		System.out.println(word+"  word is not a palindrome");
        	}
        }
        else
        {
        	System.err.println(" ************ Invalid Arguments ************");
        }
        
        
    }
}

