/* Q.
    Given a string, return true if the string starts with "hi" and false otherwise.


    startHi("hi there") → true
    startHi("hi") → true
    startHi("hello hi") → false
 */


public class startHi {
    public boolean startHi(String str) {
        if (str.length() < 2) return false;
          String firstTwo = str.substring(0, 2);
        return (firstTwo.equals("hi")) ;

    }


    public static void main(String[] args) {
        startHi obj = new startHi();
        boolean result = obj.startHi("Hello");
        System.out.println(result);
    }
}
