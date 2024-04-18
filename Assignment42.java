package newassignment_upload;

/*write a program to get 10 days before the current time and 10 days after the current time 
using Date Class */

import java.util.Date;

public class Assignment42 
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		
	     Date Present_Time=new Date(d1.getTime());
	     System.out.println("Present time is: "+Present_Time);
		
       Date Future_Time=new Date(d1.getTime()+(1000*60*60*24*10));
       System.out.println("Future Time is: "+Future_Time);
       
       Date Past_Time=new Date(d1.getTime()-(1000*60*60*24*10));
       System.out.println("Past Time is: "+Past_Time);
	}

}