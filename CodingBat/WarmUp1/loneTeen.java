/* Q. 
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values, return true if one or the other is teen, but not both.


    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false
 */


public class loneTeen {
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen || !aTeen && bTeen);
    }


    public static void main(String[] args){
        loneTeen obj = new loneTeen();
        boolean result = obj.loneTeen(19, 12);
        System.out.println(result);
    }
}
