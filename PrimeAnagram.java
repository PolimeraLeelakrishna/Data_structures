package com.bridgeit.Data_Structuress;


import java.util.ArrayList;



public class PrimeAnagram 
{
	public static void main(String[] args)
	{
		System.out.println("Prime Anagram Numbers 0-1000 :");
		PrimeAnagram.primeAnagram();
	}
	static String[][]primeAnagramArray=new String[13][13];
	static ArrayList<Integer> primeList=new ArrayList<Integer>();    // creating object for storing prime numbers
    static ArrayList<Integer> anagramList=new ArrayList<Integer>(); // creating object for storing anagram values.
    public static void primeAnagram() 
    {
    	boolean flag;
    	for(int i=2;i<=1000;i++)
    	{
    		flag=true;
    		for(int j=2;j<i/2;j++)
    		{
    			if(i%j==0)   // if this condition become zero it's not a prime number.
    			{
    				flag=false;
    				break;
    			}
    		}
    		if(flag)
    		primeList.add(i);      // add all prime numbers into primelist object. 
    	}   
    	System.out.println("prime numbers that are anagram");
    	for(int i=0;i<primeList.size();i++)   // giving one value of index to next for loop
    	{
    		for(int j=i+1;j<primeList.size();j++)  // for comparing that value into all the values in prime list
    		{
    			if(anagram(primeList.get(i),primeList.get(j)))//calling anagram function and comparing all values
    			{
    				
    				System.out.println(primeList.get(i)+" "+primeList.get(j)); // printing anagram values.
    				//anagramList.add(primeList.get(i));
    			}
    		}
    	}
    	
    	PrimeAnagram.storeElement();
    	PrimeAnagram.display();
    }
    public static void storeElement()
    { 
    	int index=0;   // initializing the index value
    	for(int i=0;i<13;i++)
    	{
    		for(int j=0;j<13;j++)
    		{	
    		// storing all prime numbers into the prime anagram array.
			primeAnagramArray[i][j]= primeList.get(index).toString(); 
			index++;
    		}
    	}
    }
    public static void display()   // displaying the all prime numbers
    {
    	for(int i=0;i<primeAnagramArray.length;i++)
    	{
    		for(int j=0;j<primeAnagramArray.length;j++)
    		{
    			System.out.print(primeAnagramArray[i][j]+" ");
    		}
    		System.out.println();
    	}
    }
	public static boolean anagram(int n1, int n2) 
	{
		int[] n1count = counting(n1);
		int[] n2count = counting(n2);
		for (int i = 0; i < n2count.length; i++)
		{
			if (n1count[i] != n2count[i]) 
			{
				return false;
			}
		}
		return true;
	}
	private static int[] counting(int n)
	{
		int[] count = new int[10];;
		int temp = n;
		while (temp != 0) 
		{
			int rem = temp % 10;
			count[rem]++;
			temp = temp / 10;
		}
		return count;
	}		
}


   