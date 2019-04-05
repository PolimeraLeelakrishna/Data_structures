

**********************************************
 *  @purpose      : calander using que
 *  @author       : P.LEELA KRISHNA
 *  @version      : 1.0

//*****************************************

package com.bridgeit.Data_Structuress;
import com.bridgeit.DS.Utility.Que;
import com.bridgeit.utility.Utility;

public class CalanderQUE
{
    public static void main(String[] args) 
    {
    	Que que=new Que(9);
    	String[] months={"","january","february","march","april","may","june","july","august","september"
    			             ," october","november","december"};
    	int[] date={0,31,28,31,30,31,30,31,31,30,31,30,31};
    	int m=Integer.parseInt(args[0]);
    	int d=Integer.parseInt(args[1]);
    	int y=Integer.parseInt(args[2]);
	    try
	    {
    	if(date[m]==2 && Utility.leapyear(y))   // month 2 and its leap year than give date to 29
    	{
    		date[m]=29;
    	}
    	int day=Utility.calday(m, y, d);    // calling calday function from utility.
    	int[][] arr=new int[6][7];          // creating two array object
    	int x=1;                  // initializing x.
    	for(int i=0;i<6;i++)
    	{
    		for(int j=day; j<7;j++)
    		{
    			if(date[m]>=x) 
    			{
    			arr[i][j]=x;
    			x++; // x is increase while month dates greater or equal to x
    		}
    		}
    		day=0;       // intitialize date as zero
  }
    	   System.out.println(d+"-"+months[m]+"-"+y);     // print the input date,month,year.
    	   System.out.println(" sun mon tue wed thu fri sat");
    	   for(int i=0;i<6;i++)
    	   {
    		   for(int j=0;j<7;j++)
    		   {
    			   if(arr[i][j]==0)    // if i,j get 0 values keep spaces
    			   {
    				   System.out.print(" "); 
    			   }
    			   if(arr[i][j]!=0){
    			   System.out.printf("%4d",arr[i][j]);  // print the calander
    				   que.Enqueue(arr[i][j]);   // send the dates to the que object
    			   } else
    			    System.out.printf(" ");
    			   
    		   }
    		   System.out.println();
    	   }
		   catch(Exception e)
		{
			System.err.println("invalid");
			
		}
	}
}
