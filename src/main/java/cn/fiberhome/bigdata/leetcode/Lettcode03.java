package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 *
 */
public class Lettcode03 {

    public  int lengthOfLongestSubstring(String s){
        if (s==null || s.length()==0)
            return 0;
        int left=0;int right=0;
        int n=s.length();

        // 默认是false
        boolean []used=new  boolean[128];
        // 定义最大子串长度
        int max=0;

        while (right<n){
            // 右指针
            if (used[s.charAt(right)]==false){
                used[s.charAt(right)]=true;
                right++;
            }else {
                max=Math.max(max,right-left);

                System.out.println(max);
                // 移动左指针
                while (left<right && s.charAt(right)!=s.charAt(left)){
                    used[s.charAt(left)]=true;
                    left++;
                }
                left++;
                right++;
            }
        }
        max=Math.max(max,right-left);
        System.out.println(max);
        return max;
    }

    @Test
    public void  test(){
        String s="abcdebxz";
    /*    char c = s.charAt(0);
        System.out.println(c);*/

        lengthOfLongestSubstring(s);
    }
}
