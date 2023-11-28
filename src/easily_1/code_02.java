package easily_1;
/**
 * 9.回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */
public class code_02 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else {
            int n = 0;
            int x01 = x;//判断数字位数。
            while ( x01 != 0){
                x01 = x01/10;
                n++;
            }

            int num = 0;
            int num01 = 0;
            int m = n - 1;
            x01 = x;
            for(int i = 0; i < n;i++){
                num01 = x01 % 10;
                x01 = x01 / 10;
                num = num + num01 * (int)Math.pow(10, m);
                m--;
            }
            return num == x;
        }
    }
}


