/* Q.
    Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.


    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true
 */


public class posNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
          return (a<0 && b<0);
        }
          return ((a<0 && b>0) || (a>0 && b<0));
      }


    public static void main(String[] args) {
    posNeg obj = new posNeg();
    boolean result = obj.posNeg(10, 10, false);
    System.out.println(result);
    }
}
