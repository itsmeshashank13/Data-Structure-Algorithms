/* Q. 
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
 */

public class front22 {
    public String front22(String str) {
        if (str.length() < 2) {
            return str + str + str;
          } else {
             String repeat = str.substring(0, 2);
            return repeat + str + repeat;
          }
    }


    public static void main(String[] args) {
        front22 obj = new front22();
        String result = obj.front22("lobalG");
        System.out.println(result);
    }
}
