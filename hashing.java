**********************************************
 *  @purpose      : hashing the number
 *  @author       : P.LEELA KRISHNA
 *  @version      : 1.0

//*****************************************


package com.bridgeit.Data_Structuress;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.bridgeit.DS.Utility.LinkedList;
import com.bridgeit.utility.Utility;

public class hashing 
{
	@SuppressWarnings("rawtypes")
	public static LinkedList slot[]=new LinkedList[11];
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws FileNotFoundException 
    {
	   	String path="/home/shadowk/hash.text";   // creating path data is getting from file
	   	for(int i=0;i<11;i++)
	   	{
	   		slot[i]=new LinkedList();    
	   	}
	   	FileReader f=new FileReader(path);    
	   	BufferedReader br=new BufferedReader(f);   // reading the file
	   	try
	   	{
	   		String str=br.readLine();  // reading line by line
	   		System.out.println(str);           
	   		String[] str1=str.split(" "); // split the values
	   		for(int i=0;i<str1.length;i++)
	   		{
	   			int slotnum=hash(str1[i]);    // hashing number is stored in slotnum
	   			slot[slotnum].add(str1[i]);    // add number in that index of slotnum in slot
	   		}
	   		System.out.println();
	   		for(int i=0;i<11;i++)
	   		{        
	   			System.out.print(i + "==> ");   // after hashing display numbers
				slot[i].displayList();
			}
		
			System.out.println("Enter the String to search:");
			String key = Utility.getString(); // give number
			int slotNumber = hash(key);    // hashing that key
			boolean value = slot[slotNumber].search(key); // search key is present in the slot or not
			if (value) {
				System.out.println("\nElement found at slot " + slotNumber + " and deleted\n");
				slot[slotNumber].remove(key);   //if found remove key
			} else {
				System.out.println("\nElement not found but added: " + key + " at slot " + slotNumber + "\n");
				slot[slotNumber].add(key); // else add the que into slot
			}

			System.out.println();
			for (int i = 0; i < 11; i++) {          
				System.out.print(i + "==> ");   // after searching happen print the list.
				slot[i].displayList();
			}

			String s = "";
			for (int i = 0; i < 11; i++) {
				s = s + slot[i].toString();  // after completing hashing store the all values into s variable
			}
			System.out.println("New elements in file:\n" + s);
			BufferedWriter bw = new BufferedWriter(new FileWriter(path)); // creating object for print output in file.
			bw.write(s);    // it is print the output on browser

			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println("" + e.getMessage());
			e.printStackTrace();
		}
	}
	   	public static int hash(String str)
	   	{
	   		int index=Integer.parseInt(str)%11;   // getting number is devided with 11 remainder value is given to index.
	   		return index; // return index
	   	}  
}
	   	


