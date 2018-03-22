/**
 * @author simple_huang@foxmail.com on 2018/3/22.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        //首先判断特殊情况
        //负数不是回文
        //末尾是0, 而x不是0时, 不是回文
        if (x<0 || (x%10==0 && x!=0)) {
            return false;
        }

        //反转x的后半部分, 跟前半部分相比
        int temp = 0;
        while (x > temp) {
            temp = temp*10 + x%10;
            x /= 10;
        }
        return x==temp || x/10==temp;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(100101));
    }
}
