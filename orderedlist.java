package com.bridgeit.Data_Structuress;

import java.io.PrintWriter;

import java.util.Arrays;

import com.bridgeit.DS.Utility.LinkedList;
import com.bridgeit.utility.Utility;

public class orderedlist
{
        public static void main(String[] args) throws Throwable {
		String outPut;
		String path = "/home/shadowk/number.text";
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		PrintWriter printWriter = new PrintWriter("number.txt");
		int[] number = Utility.ReadFileInt(path);
		Arrays.sort(number);
	
		for (int i = 0; i < number.length; i++) {
			linkedList.add(number[i]);
		}
		System.out.println("enter the value you want to search in file");
		final int SEARCH = Utility.getInt();// calling method to scan user word
		if (linkedList.search(SEARCH) == true) // calling search method to check condition
		{
			System.out.println("value is found in file");
			System.out.println("removing word from flie");

			linkedList.delete(SEARCH); // deleting the word
	                   // display element
			outPut = linkedList.getString(); // calling method to store elements in a single variable
			printWriter.write(outPut);// writing data to file
			linkedList.display();
		} else {
			System.out.println("word is not found in file");
			System.out.println("adding word to file");
			linkedList.add(SEARCH);// adding element to object
			
			
			linkedList.display();
			outPut = linkedList.getString();// converting list words to a string
			printWriter.write(outPut);// writing the data to file
		}
		printWriter.flush();
		printWriter.close();
	}
}


