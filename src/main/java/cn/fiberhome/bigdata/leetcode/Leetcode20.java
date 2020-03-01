package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

import java.util.Stack;

/**
 *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *
 *有效字符串需满足：
 * 注意空字符串可被认为是有效字符串。
 */
public class Leetcode20 {

    @Test
    public void test(){
        isValid("({})");
    }

    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack=new Stack<Character>();

        for (char c : chars) {
           // 左半边 压栈
            if (c=='('|| c=='[' || c== '{'){
                stack.push(c);
            }else {
            if (stack.isEmpty()){
                return false;
            }

            if (c==')' && stack.pop()!='('){
                return false;
            }

            if (c==']'&& stack.pop()!='['){
                return false;
            }
            if (c=='}'&& stack.pop()!='{'){
                return false;
            }
            }
        }

        return stack.isEmpty();

    };
}
