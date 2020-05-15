package cn.fiberhome.bigdata.review;

/**
 * 题目描述
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 *
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 *
 * 如，输入： Type 输出： epTy
 *
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 *
 * 如，输入： BabA 输出： aABb
 *
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 *
 *
 * 如，输入： By?e 输出： Be?y
 */
import java.util.*;
public class StrSort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            char[] chars = s.toCharArray();
            List<Character> list=new LinkedList<>();
            for (int i = 0; i < chars.length; i++) {
                // 是字母还是数字
                if (Character.isLetter(chars[i])){
                    list.add(chars[i]);
                }
            }

            System.out.println("sort before "+list);
            // 字母排序
            Collections.sort(list, new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    return Character.toLowerCase(o1)-Character.toLowerCase(o2);
                }
            });
            System.out.println("sort after"+list);
            int cnt=0;
            for (int i = 0; i < chars.length; i++) {
                if (Character.isLetter(chars[i])){
                    chars[i]=list.get(cnt);
                    cnt++;
                }
            }

            System.out.println(chars);

        }
    }
}
