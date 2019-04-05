package com.bridgeit.Data_Structuress;

import java.io.PrintWriter;

import com.bridgeit.DS.Utility.LinkedList;

import com.bridgeit.utility.Utility;

public class Unorderlist
{
    public static  void main(String[] args) throws Exception 
    {   
    	String outPut=" ";
	    try
	    {
		String path = "/home/shadowk/hi.txt";// path to get file
		LinkedList<String> list = new LinkedList<String>();
		PrintWriter pw = new PrintWriter("hi.txt");
		String[] word = Utility.fileReadString(path);// calling the file readerpath.
		
		for (int i = 0; i < word.length; i++) 
		{
			list.add(word[i]);    // adding the elements into the list.
		}
    	
    	list.display();       // after adding display the elements.
    	System.out.println("enter word");    
    	String element=Utility.getString();    // user input
    	boolean check=list.searchele(element) ; 
    // if the user input is find in list than delete it.
    	if(check==true)
    	{
    		System.out.println("element is found from the file and remove it");
    		list.delete(element);    // delete word.
    		//list.display();          // after deleting display the elements
    		outPut=list.getString();  // storing the all values into output.
    		System.out.println(outPut);
    		pw.write(outPut);       //printing output on file.
    	}
    	else
    	{
    		System.out.println("element is not found from file add it ");
    		list.add(element);     // if element is not found in the list add it
    		//list.display();       // after adding elements display all elements
    		outPut=list.getString();
    		System.out.println(outPut);
    		pw.write(outPut);
    	}
		pw.close();
	    }
	    catch(Exception e)
		{
			System.err.println("invalid");
			
		}
	}
}
