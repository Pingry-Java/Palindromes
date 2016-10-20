
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
    String testString = "banana";
    String testString2 = "racecar";
    //System.out.println(iterativeCharAt(testString));
    //System.out.println(recursiveCharAt(testString));
    //System.out.println(iterativeSubstring(testString));
    System.out.println(recursiveSubstring(testString));
    System.out.println(recursiveSubstring(testString2));
  }

 /**
  *   This method tests for palindrome-ness using recursion and the substring method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
public static boolean recursiveSubstring(String s)
	{
	if (s.length() <= 1)
		return true;
	else if (s.substring(0,1).equals(s.substring(s.length()-1)))
		return recursiveSubstring(s.substring(1,s.length()-1));
	else
		return false;
	}
}