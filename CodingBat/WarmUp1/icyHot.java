/* Q.
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.


    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
 */

public class icyHot {
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }


    public static void main(String[] args) {
        icyHot obj = new icyHot();
        boolean result = obj.icyHot(0, 0);
        System.out.println(result);
    }
}
