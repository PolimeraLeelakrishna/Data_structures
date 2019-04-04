package com.bridgeit.Data_Structuress;


import com.bridgeit.DS.Utility.que;
import com.bridgeit.utility.Utility;

public class primeAnagramQue 
{
	public static void main(String[] args) {

		que<String> a = new que<String>(158);
		int i;
		String string = " ";
		String string1 = " ";
		String addvalueTOString = " ";
		@SuppressWarnings("unused")
		String[] strArry = new String[167];

		int arr[] = Utility.prime();

		String[] sttringArray = new String[arr.length];
		StringBuffer stringBuffer = new StringBuffer(arr.length);

		for (i = 0; i < arr.length; i++) {
			addvalueTOString = stringBuffer.append(arr[i] + " ").toString();
		}

		sttringArray = addvalueTOString.split(" ");

		System.out.println("Prime Anagram");
		for (i = 0; i < sttringArray.length - 1; i++) {
			for (int j = i + 1; j < sttringArray.length - 1; j++) {
				string = sttringArray[i].toString();
				string1 = sttringArray[j].toString();
				boolean status = Utility.isAnagram(string, string1);

				if (status) {
					System.out.print("  " + sttringArray[j]);
					a.enque(sttringArray[i]);
					a.enque(sttringArray[j]);

				}

			}

		}
		System.out.println();
	}
}

