package Automation.Test;

import java.util.Scanner;

public class reverseStrChar
{
	public static void main(String[] r)
		{
			String str1="";
			String reverse="";
			char[] arr=str1.toCharArray();
			Scanner sc = new Scanner(System.in);
			str1= sc.nextLine();

			for(int i=str1.length()-1; i>=0; i--)
			{
				reverse= reverse+str1.charAt(i);
				
				if(i<=1)
				{
					System.out.print(str1.charAt(i)+" ");
				}
			}

			System.out.println("Reverse String is : "+ reverse);
			//System.out.println(arr[i]);
//			for(int j =reverse.length()-1; j>=0; j--)
//			{
//				if(j<=1)
//				{
//					System.out.print(str1.charAt(j)+" ");
//				}
//			}
		}

}
