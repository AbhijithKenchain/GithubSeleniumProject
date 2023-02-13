package programms;

import java.util.Scanner;

public class HappyNum {

	

		//to see number is happy or not
		static boolean isHappyno(int n)
		{
		while(n>9)
		{
		int sum=0;
		while(n!=0)
		{
		//seperate digits like if 25 seperate as 2&5
		int r=n%10;
		sum=sum+r*r;
		n=n/10;
		}
		n=sum;
		}
		return n==1||n==7;
		}

		//HAPPY NUMBERS PRESENT WITHIN NUMBER ENTERED EX:11 HAPPY NOS ARE 1,7,10

		static void happyNo(int n)
		{
		System.out.println("Happy nos are");

		for (int i=1;i<n;i++)
		{
		if(isHappyno(i))
		{
		System.out.print(i+"   ");
		}
		}
		}

		//count of happy numbers present within number
		static int countHappyno(int n)
		{
		int count=0;
		for(int i=1;i<n;i++)
		{
		if(isHappyno(i))
		{ 
		count++;
		}
		}
		return count;
		}


		//sum of all happy nos present within the number
		static int sumhappy(int n)
		{
		int sum=0;
		for(int i=1;i<n;i++)
		{
		if(isHappyno(i))
		{
		sum=sum+i;
		}
		}
		return sum;
		}


		public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no");
		int n=sc.nextInt();
		
		//for finding happno or not
		boolean b=isHappyno(n);
		if(b==true)
		System.out.println("happy no");
		else
		System.out.println("not happy no");
		
		
		happyNo(n);
		int cnt=countHappyno(n);
		System.out.println();
		System.out.println("total number of happyno are  "+cnt);
		int sm=sumhappy(n);
		System.out.println("total of happy numbers is   "+sm);
		}
		


	}

