package Automation.Test;

public class reverseStr
{
	public static void main(String a[])
	{
		String str ="test the demo file";
		String reverse="";
		char[] arr= reverse.toCharArray();
		for(int i=str.length()-1; i>=0; i--)
		{
			reverse=reverse+str.charAt(i);

			if(i<2)
			{
				System.out.println(arr[i]);
			}
		}
		
		System.out.println(reverse);
	
		
		//System.out.println(reverse);
		
	}

	

	

}