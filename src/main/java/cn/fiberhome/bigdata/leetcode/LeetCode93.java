package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个只包含数字的字符串，复原它所有的可能的IP地址格式
 * 输入: "25525511135"
 * 输出: ["255.255.11.135", "255.255.111.35"]
 */
public class LeetCode93 {

    @Test
    public void test() {

        restoreIpAddress("25525511135");

        System.out.println(set);
    }

    List<String> set = new ArrayList<String>();

    public List<String> restoreIpAddress(String s) {
        // a.b.c.d  segment 存储 a b c d 的值
        List<String> segment = new ArrayList<String>();
        // 搜索
        dfs(s, 0, segment);
        return set;
    }

    /**
     * 搜索
     * @param s
     * @param start
     * @param segment
     */
    private void dfs(String s, int start, List<String> segment) {
        // 遍历结束
        if (start == s.length()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < segment.size(); i++) {
                stringBuilder.append(segment.get(i));
                if (i != segment.size() - 1) {
                    stringBuilder.append(".");
                }
            }
            set.add(stringBuilder.toString());
        } else {
            if (segment.size() > 4) return;
            // 最多3个字符
//            System.out.println("start :"+ start);
            for (int i = start; i < s.length()/* && i < start + 3*/; i++) {
                String str = s.substring(start, i + 1);

                if (str.charAt(0) == '0' && str.length() > 1) {
                    break;
                }
                int num = Integer.parseInt(str);

                if (num > 0 && num <= 255) {
                    segment.add(str);
//                    System.out.println(str);
                    dfs(s, i + 1, segment);

                    segment.remove(segment.size() - 1);

//                    System.out.println(segment);
                } else {
                    break;
                }
            }
        }
    }
}
