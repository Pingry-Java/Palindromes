
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
   // System.out.println(iterativeCharAt(testString));
    System.out.println(recursiveCharAt(testString));
    //System.out.println(iterativeSubstring(testString));
    //System.out.println(recursiveSubstring(testString));
  }

 /**
  *   This method tests for palindrome-ness using a loop and the charAt method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  //public static boolean iterativeCharAt(String s)
  //{
    //TODO Implement this.
  //}
  
 /**
  *   This method tests for palindrome-ness using recursion and the charAt method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  public static boolean recursiveCharAt(String str)
  {
		if (str.length()<2) 
			return true;
	    else if (str.charAt(0)==str.charAt(str.length()-1))
			return recursiveCharAt(str.substring(1,str.length()-1));
		else
			return false;
	}
  
 /**
  *   This method tests for palindrome-ness using a loop and the substring method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
 // public static boolean iterativeSubstring(String s)
  //{
    //TODO Implement this.
 // }
  
 /**
  *   This method tests for palindrome-ness using recursion and the substring method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  //public static boolean recursiveSubstring(String s)
  //{
    //TODO Implement this.
  //}

}
