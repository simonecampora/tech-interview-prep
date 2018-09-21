import java.util.Arrays;

public class PalindromePermutation{

  /*
  Problem: Given a String, find if it is a permutation of a Palindrome
  Complexity: O(n) with n the size of the input String.
  */
  public static boolean isPalindromePermutation(String iString){

    boolean foundOdd = false;
    int[] charFreq = new int[128];
    Arrays.fill(charFreq,0);

    if(iString.length() == 0)
      return false;

    for(int i = 0; i < iString.length();i++){
      charFreq[iString.charAt(i)]++;
    }

    for(int i = 0; i < charFreq.length;i++){
      if(charFreq[i] % 2 != 0){
        if(foundOdd)
          return false;
        else
          foundOdd = true;
      }
    }
    return true;
  }

  public static void main(String [] args){
    //Testing different inputs
    System.out.println(isPalindromePermutation("Environment") + " = " + false);
    System.out.println(isPalindromePermutation("ABCBA") + " = " + true);
    System.out.println(isPalindromePermutation("") + " = " + false);
    System.out.println(isPalindromePermutation("0123456789876543210") + " = " + true);
    System.out.println(isPalindromePermutation("ABCCBA") + " = " + true);
  }
}
