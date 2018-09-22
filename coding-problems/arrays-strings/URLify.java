import java.util.Arrays;

public class URLify{

  /*
  Problem: URLify: Write a method to replace all spaces in a string with '%20.
           You are  given the true length of the string. You may assume that
           the string has sufficient space at the end.
  Complexity: O(n) as we have to scan the full String twice where n is num of chars
  */
  public static char[] Urlify(char[] iString, int trueLength){
    if(iString.length <= 0) return iString;

    int spaces = 0;

    for(int i = 0; i < trueLength ; i++){
      if(iString[i] == ' ') spaces++;
    }

    if(spaces == 0) return iString;

    int idx = trueLength + spaces * 2;
    iString[trueLength] = '\0';

    for(int i = trueLength -1 ; i >= 0 ; i--){
      if(iString[i] == ' '){
        iString[idx -1] = '0';
        iString[idx -2] = '2';
        iString[idx -3] = '%';
        idx = idx - 3;
      }
      else{
        iString[idx -1] = iString[i];
        idx--;
      }
    }

    return iString;
  }

  public static void main(String [] args){
    //Testing different inputs
    System.out.println(new String(Urlify("Environment Is Nice                       ".toCharArray(),19)) + " = " + "Environment%20Is%20Nice");
    System.out.println(new String(Urlify("Sun is not there                         ".toCharArray(),16)) + " = " + "Sun%20is%20not%20there");
    System.out.println(new String(Urlify("".toCharArray(),0)) + " = " + " ");
    System.out.println(new String(Urlify("NoSpace".toCharArray(),7)) + " = " + "NoSpace");
  }
}
