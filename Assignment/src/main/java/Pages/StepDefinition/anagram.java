package Pages.StepDefinition;

import edu.emory.mathcs.backport.java.util.Arrays;

public class anagram
{
	public static boolean isAnagram()
	{
		String a1= "anagram";
		String b= "margana";
		int count=0;
		char[] arr= a1.toCharArray();
		char[] arr2=b.toCharArray();
		
		Arrays.sort(arr2);
		Arrays.sort(arr);
		
//		if(Arrays.equals(arr, arr2))
//			return true;
//		else
//			return false;
//		
//	}
	
	
		
		for(int i=a1.length()-1;i>=0;i--)
		{
			if(Character.toLowerCase(arr[i])!= Character.toLowerCase(arr2[i]))
				return false;
		}
		return true;
	}
			
		
		public static void main(String a[]) {
			
			boolean ret = isAnagram();
			if(ret)
				System.out.println("is Anagram");
			else
				System.out.println("Not anagram");
		}
		
		
	
	
}