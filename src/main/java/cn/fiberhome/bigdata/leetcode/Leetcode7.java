package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 输入: 123
 * 输出: 321
 *
 * 输入: 120
 * 输出: 21
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */

public class Leetcode7 {

    @Test
    public void test(){
        System.out.println(1998%10);


      reverse(-1234);

        System.out.println(reverse(0));
    }

    public int reverse(int x) {

        int rev=0;
        while (x!=0){

            int newrev=rev*10+x%10;
            // 发生了overflow
            if ((newrev-x%10)/10!=rev) return 0;
            rev=newrev;
            x/=10;
        }
        return rev;
    }
}
