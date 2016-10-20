/**
 * This class has four methods that each test whether the given string is a
 * Palindrome. The four methods illustrate four different ways to test for
 * palindromes
 *
 * @author AP Computer Science Class 2016
 * @version 0.1
 */
 
public class Palindrome
{

	public static void main(String args[])
	{
		String testString1 = "banana";
		System.out.println(iterativeCharAt(testString1));
		String testString2 = "anana";
		System.out.println(iterativeCharAt(testString2));
		String testString3 = "abna";
		System.out.println(iterativeCharAt(testString3));
		String testString4 = "babna";
		System.out.println(iterativeCharAt(testString4));
		String testString5 = "aa";
		System.out.println(iterativeCharAt(testString5));
		String testString6 = "";
		System.out.println(iterativeCharAt(testString6));
		String testString7 = "bannnnnnnab";
		System.out.println(iterativeCharAt(testString7));
		//System.out.println(recursiveCharAt(testString));
		//System.out.println(iterativeSubstring(testString));
		//System.out.println(recursiveSubstring(testString));
	}

 /**
  *   This method tests for palindrome-ness using a loop and the charAt method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
	public static boolean iterativeCharAt(String s)
	{
		int len = s.length();

		if (s.isEmpty())
		{
			return false;
		}
		
		int ind = 0;
		while (ind < len)
		{
			if (s.charAt(ind) != s.charAt(len-1-ind))
			{
				return false;
			}
			ind++;
		}
		
		return true;
	}
  
	/**
	 *   This method tests for palindrome-ness using recursion and the charAt method.
	 *   @param s the String to check whether it is a palindrome
	 *   @return boolean true if palindrome, false otherwise
	 */
	
	/*
	public static boolean recursiveCharAt(String s)
	{
	//TODO Implement this.
	}
  
	/**
	 *   This method tests for palindrome-ness using a loop and the substring method.
	 *   @param s the String to check whether it is a palindrome
	 *   @return boolean true if palindrome, false otherwise
	 */
	
	/*
	public static boolean iterativeSubstring(String s)
	{
	//TODO Implement this.
	}
  
	/**
	 *   This method tests for palindrome-ness using recursion and the substring method.
	 *   @param s the String to check whether it is a palindrome
	 *   @return boolean true if palindrome, false otherwise
	 */
	
	/*
	public static boolean recursiveSubstring(String s)
	{
	//TODO Implement this.
	}
	*/

}
