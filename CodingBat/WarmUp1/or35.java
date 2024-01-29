/* Q.   
Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


or35(3) → true
or35(10) → true
or35(8) → false
 */

public class or35 {
    public boolean or35(int n) {
        return (n%3 == 0 || n%5 == 0 );
    }


    public static void main(String[] args) {
        or35 obj = new or35();
        boolean result = obj.or35(5);
        System.out.println(result); 
    }
}
