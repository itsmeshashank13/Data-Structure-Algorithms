/* 
    Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.


    lastDigit(7, 17) → true
    lastDigit(6, 17) → false
    lastDigit(3, 113) → true
 */


public class lastDigit {
    public boolean lastDigit(int a, int b) {
        int first = (a % 10);
        int second = (b % 10);
        
        if (first == second) {
          return true;
        }
        return false;
    }


    public static void main(String[] args) {
        lastDigit obj = new lastDigit();
        boolean result = obj.lastDigit(7,17);
        System.out.println(result);
    }   
}
