/**
 * @author simple_huang@foxmail.com on 2018/3/21.
 */
public class IntegerReverse {
    /**
     Given a 32-bit signed integer, reverse digits of an integer.

     Example 1:

     Input: 123
     Output:  321
     Example 2:

     Input: -123
     Output: -321
     Example 3:

     Input: 120
     Output: 21
     Note:
     Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
     For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
     * @param n
     * @return
     */
    public static int reverse(int n) {
        long res = 0;
        while (n!=0) {
            res = res*10 + n%10;
            n = n/10;
        }
//        if (temp<Integer.MIN_VALUE || temp>Integer.MAX_VALUE) {
//            return 0;
//        }
//        return (int)temp;
        return res<Integer.MIN_VALUE ||res>Integer.MAX_VALUE? 0: (int) res;
    }

    public static int reverseV2(int n) {
        int res = 0;
        int temp;
        while (n!=0) {
            temp = res*10 + n%10;
            if (temp/10 != res) {
                return 0;
            }
            res = temp;
            n /=10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverseV2(Integer.MAX_VALUE));
    }
}
