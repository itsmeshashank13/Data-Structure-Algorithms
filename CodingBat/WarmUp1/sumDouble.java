/* Q. 
    Given two int values, return their sum. Unless the two values are the same, then return double their sum.


    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
 */

 public class sumDouble {
  public int sumDouble(int a, int b) {
    int sum = a+b;
    
    if (a == b) {
      return sum = sum*2;
    }  {
      return sum;
    }
}

  public static void main(String[] args) {
    sumDouble obj = new sumDouble();
    int result = obj.sumDouble(4, 5); 
    System.out.println(result);
  }
 }
