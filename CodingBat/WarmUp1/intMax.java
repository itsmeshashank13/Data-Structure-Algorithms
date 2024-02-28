/* Q.
    Given three int values, a b c, return the largest.

    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3
 */

public class intMax {
    public int intMax(int a, int b, int c) {
        int maxAC = Math.max(a, c);
        int maxABC = Math.max(maxAC, b);
        return maxABC;
    }


    public static void main(String[] args) {
        intMax obj = new intMax();
        int result = obj.intMax(1,2,3);
        System.out.println(result);
    }
}
