package cn.fiberhome.bigdata.review;

import java.util.Scanner;

public class StrLastLen {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.nextLine();
            if (s!=null){
                String[] s1 = s.split(" ");

                System.out.println(s1[s1.length-1].length());
                break;
            }
        }
    }
}
