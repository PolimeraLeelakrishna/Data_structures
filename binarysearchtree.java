package com.bridgeit.Data_Structuress;

import com.bridgeit.utility.Utility;

public class binarysearchtree 
{

public static class BinaryTree {
    // intializing three factorials.
	static long fact1 = 1;
	static long fact2 = 1;
	static long fact3 = 1;

	public static long factorial(long n) {

		for (int i = 1; i <= n; i++) {
			fact1 = i * fact1;   // factrorial for n!
		}
		// System.out.println(fact1);
		return fact1;
	}
      // factorial for 2n!
	public static long factorial1(long n) {
		long n2 = 2 * n;
		for (int i = 1; i <= n2; i++) {
			fact2 = i * fact2;
		}
		return fact2;
	}
	  // factorial for n+1 factorial
	public static long factoria12(long n) {
		long n1 = n + 1;       // looping untill n+1 times
		for (int i = 1; i <= n1; i++) {
			fact3 = i * fact3;  // calculating factorial.
		}
		return fact3;
	}

	public static void main(String[] args) {

		System.out.println("Enter a number");
		int n = Utility.getInt();
		//formula for find the number of nodes present in the tree
		long tree = ((factorial1(n)) / (factoria12(n) * factorial(n)));
		System.out.println(tree + ":number of nodes in tree for =>" + n);

	}

}
}
