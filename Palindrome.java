
/**
 * This class has four methods that each test whether the given string is a
 * Palindrome. The four methods illustrate four different ways to test for
 * palindromes
 *
 * @author AP Computer Science Class 2016
 * @version 0.1
 */
 
public class Palindrome {

  public static void main(String args[]) {
    String testString = "banana";
    System.out.println(recursiveSubstring(testString));
	testString = "racecar";
    System.out.println(recursiveSubstring(testString));
  }
  
 /**
  *   This method tests for palindrome-ness using recursion and the substring method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  public static boolean recursiveSubstring(String s)
  {
    //determines the length of the string
	int length = s.length();
	if (length == 1)
	{
		return true;
	}		
	if (s.substring(length - 1, length).equals(s.substring(0,1)))
	{
		return recursiveSubstring(s.substring(1, length - 1));
	}
	return false;
  }

}
