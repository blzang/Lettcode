package cn.fiberhome.bigdata.leetcode;

import org.junit.Test;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Lettcode02 {

    class ListNode {
        int val; //当前结点的值
        ListNode next;// 下一个链表对象
        ListNode(int x) { val = x; } //赋值链表的值
    }


    @Test
    public void test(){
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        ListNode listNode = addTowNums(l1, l2);

//        System.out.println(l1.val+":"+l2.val);


        System.out.println(listNode.val+"-"+listNode.next.val+"-"+listNode.next.next.val);
    }

    public ListNode addTowNums(ListNode l1, ListNode l2) {

        ListNode res=new ListNode(0);

        ListNode cur=res;

        ListNode pre=null;

        int carry=0;

        while (l1!=null && l2!=null){
            cur.val=l1.val+l2.val+carry;
            carry=cur.val/10;
            cur.val=cur.val%10;
            cur.next=new ListNode(0);

            pre=cur;
            cur=cur.next;
            l1=l1.next;
            l2=l2.next;
        }

        while (l1!=null){
            cur.val=l1.val+carry;
            carry=cur.val/10;
            cur.val=cur.val%10;
            cur.next=new ListNode(0);
            pre=cur;
            cur=cur.next;
            l1=l1.next;
        }

        while (l2!=null){
            cur.val=l2.val+carry;
            carry=cur.val/10;
            cur.val=cur.val%10;
            cur.next=new ListNode(0);
            pre=cur;
            cur=cur.next;
            l2=l2.next;
        }

        if (carry==0){
            pre.next=null;
        }else {
            cur.val=carry;
        }
        return res;
    }

}
