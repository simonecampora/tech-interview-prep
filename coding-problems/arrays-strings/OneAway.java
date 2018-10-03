public class OneAway{

  /*
  Problem: There are three types of edits that can be performed on strings:
           insert a character, remove a character, or replace a character.
          Given two strings, write a function to check if they are one edit (or zero edits) away.
  Complexity: O(n) where n is the number of characters of the string.
  */
  public static boolean OneAway(String one, String two){

    if(Math.abs(one.length() - two.length())>1) return false;
    if(one.length() == 0 || two.length() == 0) return false;

    String longer = one.length() >= two.length() ? one : two;
    String shorter = one.length() >= two.length() ? two : one;
    boolean diffFound = false;

    //check for substitution
    if(longer.length() == shorter.length()){
      for(int i = 0; i < longer.length(); i++){
          if(longer.charAt(i) != shorter.charAt(i)){
            if(diffFound == true) return false;
            diffFound = true;
          }
      }
      return diffFound;
    }
    else{ //check for deletion or insertion
      for(int i = 0, j = 0; j < shorter.length(); i++, j++){
        if(longer.charAt(j) != shorter.charAt(i)){
          if(diffFound == true) return false;
          diffFound = true;
          j++;
        }
      }
      return diffFound;
    }
  }

  public static void main(String [] args){
    //Testing different inputs
    System.out.println(OneAway("One","OneOne") + " = " + "false");
    System.out.println(OneAway("One","Oen") + " = " + "false");
    System.out.println(OneAway("One","One") + " = " + "false");
    System.out.println(OneAway("One","Tne") + " = " + "true");
    System.out.println(OneAway("","Tne") + " = " + "false");
    System.out.println(OneAway("One","") + " = " + "false");
    System.out.println(OneAway("","") + " = " + "false");
    System.out.println(OneAway("One","ne") + " = " + "true");

  }
}
