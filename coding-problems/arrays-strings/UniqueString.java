import java.util.Arrays;

public class UniqueString{

  /*
  Problem: Given a String, find if it is composed of only
           unique characters, i.e. there are no duplicates.

  Complexity: This solution has O(1) time complexity as bounded
              to 128 iterations.
  */
  public static boolean isUnique(String iString){

    if(iString.length()==0 || iString.length() > 128) return false;

    //assuming only ASCII characters, hence 128 only.
    boolean[] uniques = new boolean[128];
    Arrays.fill(uniques,false);

    for(int i = 0; i < iString.length() ; i++){
      int idx = iString.charAt(i);
      if(uniques[idx] == true)
        return false;
      else
        uniques[idx] = true;
    }
    return true;
  }

  public static void main(String [] args){
    //Testing different inputs
    System.out.println(isUnique("Environment") + " = " + false);
    System.out.println(isUnique("Sun") + " = " + true);
    System.out.println(isUnique("") + " = " + false);
    System.out.println(isUnique("0123Sun") + " = " + true);
  }
}
