package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 *  L   C   I    R
 *  E T O E S I I G
 *  E   D   H   N
 *
 *
 *
 */
public class Leetcode06 {

    @Test
    public void test(){
        String s="LEETCODEISHIRING";
        String convert = convert(s, 3);

        System.out.println(convert);

    }

    //
    public String convert(String s, int numRows) {
        // s=ABCDEFG
        char[] chars = s.toCharArray();

        int len= chars.length;

        StringBuilder []sb=new StringBuilder[numRows];

        for (int i = 0; i < sb.length; i++) {
            sb[i]=new StringBuilder();
        }
        int i=0;
        while (i<len){

            for (int idx = 0; idx < numRows && i<len; idx++) {
                //  一趟 sb[0]= A ，sb[1]=B， sb[2]=C

                // 二趟 sb[0]=AE  sb[1]=BDF sb[2]=CG
                sb[idx].append(chars[i++]);
            }

            // 一趟  sb[1]=BD ，
            for (int idx = numRows-2; idx >=1 && i<len ; idx--) {
                sb[idx].append(chars[i++]);
            }
        }

        for (int idx = 1; idx < sb.length; idx++) {
            sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }


}
