package leetcode;

import java.util.Scanner;


public class DeletetheMiddleNodeofLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of nodes size : ");
        int n=sc.nextInt();
        leetcode.ListNode head= new leetcode.ListNode();
        leetcode.ListNode head1= head;
        for(int i=0;i<n;i++){
            leetcode.ListNode l1=new leetcode.ListNode();
            l1.val=sc.nextInt();
            l1.next=null;
            head.next=l1;
            head=head.next;
        }
        printList(head1.next);
        head1=deleteMiddle(head1.next);
        printList(head1);
    }
    public static void printList(leetcode.ListNode head){
        System.out.println("print");
        while(head!=null)
        {
            System.out.println(head.val);
            head=head.next;
        }
    }
    public static leetcode.ListNode deleteMiddle(leetcode.ListNode head) {
        leetcode.ListNode head1=head;
        leetcode.ListNode head2=head;
        leetcode.ListNode cl=head;
        int count=0;
        while(cl!=null)
        {
            count++;
            cl=cl.next;
        }
       cl=head.next;
        for(int i=1;i<count/2;i++){
            head1=head1.next;
            cl=cl.next;
        }
        head1.next=cl.next;
        return head2;

    }
}
