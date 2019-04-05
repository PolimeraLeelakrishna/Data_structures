





package com.bridgeit.Data_Structuress;
import com.bridgeit.utility.Utility;
public class prime2D 
{
 public static void main(String[] args) 
 {
		       try
		       {
			int[] arr = Utility.prime();
			System.out.print(2 + " ");
			int[][] arr1 = new int[10][167];
             for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 167; j++) {
					if (arr[j] > ((i) * 100) && arr[j] < ((i + 1) * 100)) {
                       arr1[i][j] = arr[j];
						System.out.print(arr1[i][j]+" ");
					}
				}
				System.out.println();
			}
		}
 }
	catch(Exception e)
		{
			System.err.println("invalid");
			
		}
    }
}


