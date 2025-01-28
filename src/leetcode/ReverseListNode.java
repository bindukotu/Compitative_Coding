package leetcode;

import java.util.*;

public class ReverseListNode {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public static void main(String[] args) {
        ListNode head=new ListNode();
        ListNode first=head;
      //  System.out.println("enter the size");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println("enter val of node :");
            int val =sc.nextInt();
            ListNode ln=new ListNode(val);
            head.next=ln;
            head=head.next;
        }
        System.out.println("print node val:");
        head=first.next;
        while(head!=null){
            System.out.println(head.val);
            head=head.next;
        }
        head=first.next;
        System.out.println("rev");
        ListNode l1=reverseList(head);
        while (l1!=null){
            System.out.println(l1.val);
            l1=l1.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode rev=new ListNode(head.val);
        head=head.next;
        while (head!=null)
        {
            ListNode temp=new ListNode(head.val);;
            temp.next=rev;
            rev=temp;
              head=head.next;
        }
        return rev;
    }

}
