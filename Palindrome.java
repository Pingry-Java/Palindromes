
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
    String testString2 = "racecar";
    //System.out.println(iterativeCharAt(testString));
    //System.out.println(recursiveCharAt(testString));
    System.out.println("When asked if banana is a palindrome, the answer is: " + iterativeSubstring(testString));
    System.out.println("When asked if racecar is a palindrome, the answer is: " + iterativeSubstring(testString2));
    //System.out.println(recursiveSubstring(testString));
  }

 /**
  *   This method tests for palindrome-ness using a loop and the charAt method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  //public static boolean iterativeCharAt(String s)
  {
    //TODO Implement this.
  }
  
 /**
  *   This method tests for palindrome-ness using recursion and the charAt method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  //public static boolean recursiveCharAt(String s)
  {
    //TODO Implement this.
  }
  
 /**
  *   This method tests for palindrome-ness using a loop and the substring method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  public static boolean iterativeSubstring(String s)
  {  
    int numChar = (s.length() - 1); //arrays don't have the () for length, but strings do

    while (s.substring(0,1).equals(s.substring(numChar)))
    {
    	s = s.substring(1, numChar);
    	if (s.length() == 1)
    		return true;
    	numChar-= 2; //subtract two each time because you are taking one letter off of each side
    }
    
    return false;
  }
  
 /**
  *   This method tests for palindrome-ness using recursion and the substring method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  //public static boolean recursiveSubstring(String s)
  {
    //TODO Implement this.
  }

}
