/* Q.
    Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.


    max1020(11, 19) → 19
    max1020(19, 11) → 19
    max1020(11, 9) → 11
 */

public class max1020 {
    public int max1020(int a, int b) {
        Boolean numA = a >= 10 && a <= 20;
        Boolean numB = b >= 10 && b <= 20;
        
        if (numA && (!numB || a > b)) return a;
        if (numB && (!numA || b > a)) return b;
        return 0;
    }


    public static void main(String[] args) {
        max1020 obj = new max1020();
        int result = obj.max1020(11,9);
        System.out.println(result);
    }
}
