import java.util.Arrays;

public class Fibo{

  /*
  Problem: Calculate the Fibonacci value at sequence n
  Complexity: O(n) thanks to memorizing the computed values.
              Without memo would be O(2^n)
  */
  public static int getFibonacci(int n){
    if(n < 0) return 0;
    int[] memo = new int[n+1];
    Arrays.fill(memo,0);
    return getFibo(n,memo);
  }

  private static int getFibo(int n, int[] memo){
    if(n <= 0) return 0;
    if(n == 1) return 1;
    if(memo[n] > 0) return memo[n];
    memo[n] = getFibo(n-1,memo) + getFibo(n-2,memo);
    return memo[n];
  }

  public static void main(String [] args){
    //Testing different inputs
    System.out.println(getFibonacci(0) + " = " + 0);
    System.out.println(getFibonacci(1) + " = " + 1);
    System.out.println(getFibonacci(2) + " = " + 1);
    System.out.println(getFibonacci(13) + " = " + 233);
    System.out.println(getFibonacci(43) + " = " + 433494437);
    System.out.println(getFibonacci(-443) + " = " + 0);
  }
}
