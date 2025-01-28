package leetcode;

import java.util.LinkedList;
import java.util.Scanner;

public class RemoveNthNodefromList {
    public static class ListNode {
      int val;
      ListNode next;
       ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode ln=head.next;
            int count=0;
            while(ln!=null){
                count++;
                ln=ln.next;
            }
        System.out.println(count);
            int del=count-n;
            ln=head.next;
            while (count==del)
            {
                count--;
                ln=ln.next;
            }
            ln.next=ln.next.next;
            return ln;
    }

    public static void main(String[] args) {
        ListNode ln=new ListNode(1);
        ln.next=new ListNode(2);
        ln.next.next=new ListNode(3);
        ln.next.next.next=new ListNode(4);
        ln.next.next.next.next=new ListNode(5);
        int n=2;
        print(ln);
        ListNode l1=removeNthFromEnd(ln,n);
        print(l1);
    }
    public static void print(ListNode node){
        ListNode n1=node;
        while (n1!=null){
            System.out.println(n1.val+" *");
            n1=n1.next;
        }
    }
}
