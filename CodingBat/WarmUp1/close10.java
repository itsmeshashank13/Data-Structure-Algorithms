/* Q.
    Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0
 */

public class close10 {
    public int close10(int a, int b) {
        int valueA = Math.abs(10 - a);
        int valueB = Math.abs(10 - b);
        
        if (valueA < valueB) {
          return a;
        } 
        if (valueB < valueA) {
          return b;
        }
        if (valueA == valueB) {
          return 0;
        }
        return 0;
    }

    public static void main(String[] args){
        close10 obj = new close10();
        int result = obj.close10(13,7);
        System.out.println(result);
    }
}
