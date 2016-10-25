
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
    String testString = "hannah";
    //System.out.println(iterativeCharAt(testString));
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
  {
    //TODO Implement this.
  }
  
 /**
  *   This method tests for palindrome-ness using recursion and the charAt method.
  *   @param s the String to check whether it is a palindrome
      @param finalString the empty string that will be written as s backwords
      @param p the placeholder that holds s
  *   @return boolean true if palindrome, false otherwise
  */

  public static boolean recursiveCharAt(String s)
  {
      boolean bool = booleanFinder(s,"",s);
      return bool;
  }
  public static boolean booleanFinder(String s, String finalString, String p)
  {
    //TODO Implement this.
      int counter = (s.length() -1);
      char newChar = s.charAt(counter);
      finalString += newChar;
      if (counter > 0)
          return booleanFinder(s.substring(0,counter), finalString, p);
      
      
      if (p.equals(finalString))
          return true;
      
      return false;
      
  }
  
 /**
  *   This method tests for palindrome-ness using a loop and the substring method.
  *   @param s the String to check whether it is a palindrome
  *   @return boolean true if palindrome, false otherwise
  */
  //public static boolean iterativeSubstring(String s)
  {
    //TODO Implement this.
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
