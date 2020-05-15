package cn.fh.bigdata.test;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class LunceneTest {

    @Test
    public void test1() {
        System.out.println("hello world");
    }


    @Test
    public void test2s() {
        ArrayList list1 = new ArrayList<String>();

        list1.add("12321");
        list1.add("12322");
        list1.add("1232=3");
        list1.add("12321=4");
        for (Object o : list1) {
            System.out.println(o);
        }
        System.out.println(list1);
    }

    @Test
    public void test3() {
        for (int i = 0; i < 100; i++) {
            final String s = "dashuads  " + i;

            System.out.println(s);
        }
    }


    @Test
    public void test4() {

        String ss="asdas\tdass_ ";

        String[] split = ss.split("\t");

        String xx=split[1];
        String s = "dsa_ ";

            String[] s1 = s.split("_",-1);

        System.out.println(s.split("_").length);
        for (int i = 0; i < s.split("_").length; i++) {
            System.out.println("---" + s1[i]);

        }
    }

    @Test
    public void test5(){

        try {
            method1();
        } catch (Exception e) {
            System.out.println("抓住异常 "+e.toString());
        }

        System.out.println("----------");
    }

    private void method1() throws   Exception {
        if (true){
            throw  new Exception("dsaj");
        }
        System.out.println("asdbas");
    }


    @Test
    public  void test7(){
        String s="aa\tdsajk\tda_sj\t11_22_33";
        String[] split = s.split("\t", -1);

        for (int i = 0; i < split.length; i++) {

        }
    }


    @Test
    public  void test8(){
        String s="49921@qq.com.cn";

        String s1="49921@qq.com ";
        boolean contains = s.contains("@qq.com");

        int i = s.lastIndexOf("@qq.com");

        int i1 = s1.trim().lastIndexOf("@qq.com");
        int length = s.split("@qq.com").length;
        int length1 = s1.trim().split("@qq.com",-1).length;

        System.out.println(i+"---"+i1);

        System.out.println(length+"----"+length1);

    }


    @Test
    public  void test(){
        String s="49921@qq.com";

        String sd="49921c";

        HashMap<Character,String> map=new HashMap<>();
        map.put('c',"@qq.com");
        byte[] bytes1 = ("49921").getBytes();

        byte[] bytes13=new byte[1];
        bytes13[0]='c';
        // c -->@qq.com
         String s1 = map.get((char)bytes13[0]);
        byte[] bytes2 = s1.getBytes();

        System.out.println("byte1 :"+new String(bytes1)+" bytes2 :"+new String(bytes2));
        byte[] bytes3 = byteMergerAll(bytes1, bytes2);
        System.out.println(new String(bytes3));
    }


    @Test
    public void test9(){
        charToByte('c');
    }


    @Test
    public void test10(){
        String a="49921";
        byte[] bytes = a.getBytes();

        byte[] bytes1 = Arrays.copyOfRange(bytes, 1, bytes.length );

        System.out.println(new String(bytes1));

    }
    public static byte[] charToByte(char c) {
        byte[] b = new byte[2];
        b[0] = (byte) ((c & 0xFF00) >> 8);
        b[1] = (byte) (c & 0xFF);
        return b;
    }

    public static char byteToChar(byte[] b) {
        char c = (char) (((b[0] & 0xFF) << 8) | (b[1] & 0xFF));
        return c;
    }

  /*  //java 合并两个byte数组
    public static byte[]  mergeBytes(byte [] bytes1,byte[] bytes2){
        byte[] byte3 = new byte[bytes1.length+bytes2.length];
        System.arraycopy(bytes2, 0, byte3, 0, bytes1.length);

        System.arraycopy(bytes2, 0, byte3, bytes1.length, bytes2.length);

        return byte3;
    }*/


    private static byte[] byteMergerAll(byte[]... values) {
        int length_byte = 0;
        for (int i = 0; i < values.length; i++) {
            length_byte += values[i].length;
        }
        byte[] all_byte = new byte[length_byte];
        int countLength = 0;
        for (int i = 0; i < values.length; i++) {
            byte[] b = values[i];
            System.arraycopy(b, 0, all_byte, countLength, b.length);
            countLength += b.length;
        }
        return all_byte;
    }

    @Test
    public void test213(){
            byte [] n=new byte[]{'1'};

            String s="8855581953";

        byte[] bytes = s.getBytes();

        byte[] bytes1 = byteMergerAll(n, bytes);

        System.out.println(new String(bytes1));

    }

    @Test
    public void test101(){
        byte [] n=new byte[1];
        n[0]='1';

        String tel="8855581953";

        byte[] bytes;
        bytes= tel.getBytes();

        bytes = byteMergerAll(n, bytes);

        System.out.println(new String(bytes));
    }


    @Test
    public void  test15(){
        String s="32156F334";
        byte[] bytes = s.getBytes();

        byte [] tmp=bytes;
        System.out.println(new String(tmp));
        Arrays.sort(bytes);

        System.out.println(new String(tmp) +"---"+new String(bytes));

    /*    for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]=='F');
        }*/

        int i = Arrays.binarySearch(bytes, (byte) 'F');

        System.out.println(new String(bytes));

        System.out.println(i);

    }


    @Test
    public void  test16(){
        String s="32156334F";
        byte[] bytes = s.getBytes();

        if (bytes[bytes.length-1]=='F'){
            System.out.println("dsafas");
            bytes[bytes.length-1]='X';
        }
        System.out.println(bytes[bytes.length-1]);

        System.out.println(new String(bytes));

    }


    @Test
    public void test19(){

        long a=112;
        long b=10;
        long c=12;
        long d=125;
/*        String[] split = String.valueOf(a).split("");

        System.out.println(split.length);*/

        System.out.println(0x2E);

        byte [] ax=new byte[1];

        ax[0]=0x2E;

//        long reverse = Long.reverse(112);

        int reverse1 = reverse((int)a);
        System.out.println(reverse1);

        System.out.println("------------------");
        byte[] bytes = reverse2(reverse1);

        byte[] bytesx= String.valueOf(a).getBytes();

        System.out.println();
        byte[] bytes1 = String.valueOf("112.").getBytes();

        System.out.println("------------------");
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }
        System.out.println("*****************************");

        for (int i = 0; i < bytesx.length; i++) {
            System.out.println(bytesx[i]);
        }
        System.out.println("=================================");
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }





    }

    public static void main(String[] args) {

        
    }


    @Test
    public void test20(){
        byte [] ax=new byte[1];

        ax[0]=0x2E;

        byte[] bytes1 = String.valueOf("112.").getBytes();

        System.out.println("------------原始--------");
        for (int i = 0; i < bytes1.length; i++) {
            System.out.println(bytes1[i]);
        }

        int reverse1 = reverse((int)112);

        byte[] bytes = reverse2(reverse1);

        bytes[3]=0x2E;

        System.out.println("*********最终转换*************");
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }



    }
    
    @Test
    public void test100(){
        String a="12345";
        byte[] bytes = Arrays.copyOfRange(a.getBytes(), 1, a.getBytes().length- 1);


        System.out.println(new String(bytes));
    }

    public byte [] reverse2(int y){

        byte [] bytes;
        if (y<10 && y>0){
                bytes=new byte[1];
        }else if (y>10 && y<100){
                bytes=new byte[2];
        }else {
                bytes=new byte[4];
        }
        int i=0;
        int j=0;
        do {
            i=y%10;
            y=y/10;
//            System.out.println(i);
            bytes[j]=(byte) ((byte)i+0x30);
            j++;
        }while (y%10!=0);

        return bytes;
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

    @Test
    public void  test11(){

        String s="12345678";

        byte[] bytes = Arrays.copyOfRange(s.getBytes(), 1, s.getBytes().length);

        System.out.println(new String(bytes));
    }




    @Test
    public void  test13(){

        ConcurrentHashMap<String,String> hashMap=new ConcurrentHashMap<>();

        System.out.println(hashMap.isEmpty());

        hashMap.put("1","2");
        hashMap.put("2","2");

        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap);

        hashMap=null;

        String s = hashMap.get(null);

        System.out.println(s);
    }






    
    @Test
    public void test17() throws UnsupportedEncodingException {

        byte b[]=new byte[]{110,-97,30,20};


        System.out.println(new String(b).getBytes( "utf-8").length);
    }
    
    @Test
    public  void testBinary(){

        String s = Integer.toBinaryString(8);
        String s1 = Integer.toBinaryString(3);
        System.out.println(s);
        System.out.println(s1);
    }
    @Test
    public  void testBinaryCount(){
            int n=3;
            int count=0;
            while(n != 0) {
                 count ++;
                n = n & (n - 1);
         }

        System.out.println(count);
    }

}
