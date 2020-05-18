package cn.fiberhome.bigdata.review;
import java.util.*;

/**
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */
public class IntReverseAndDistinct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(s);

        stringBuffer.reverse();

//        System.out.println(stringBuffer);

        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i <=stringBuffer.length()-1; i++) {

            char c = stringBuffer.charAt(i);

//            int c_char=c-'0';

            set.add(c);
        }

        for (Character character : set) {
            System.out.print(character);
        }

    }
}
