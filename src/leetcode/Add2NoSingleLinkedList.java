package leetcode;

//completed
public class Add2NoSingleLinkedList  {
    public class ListNode {
        int val;
        leetcode.ListNode next;
        ListNode(){}
        ListNode(int val){this.val=val;}
        ListNode(int val, leetcode.ListNode next){this.val=val;this.next=next;}
    }
    //l1=9,9,9,9,9,9,9     l2=9,9,9,9 o/p=8,9,9,9,0,0,0,1
    public static void main(String[] args)
    {
        leetcode.ListNode ln1=new leetcode.ListNode(9);
        ln1.next=new leetcode.ListNode(9);
        ln1.next.next=new leetcode.ListNode(9);
        ln1.next.next.next=new leetcode.ListNode(9);
        ln1.next.next.next.next=new leetcode.ListNode(9);
        ln1.next.next.next.next.next=new leetcode.ListNode(9);
        ln1.next.next.next.next.next.next=new leetcode.ListNode(9);
//        ln1.next=new leetcode.ListNode(4);
//        ln1.next.next=new leetcode.ListNode(3);
        //second list
        leetcode.ListNode ln2=new leetcode.ListNode(9);
        ln2.next=new leetcode.ListNode(9);
        ln2.next.next=new leetcode.ListNode(9);
        ln2.next.next.next=new leetcode.ListNode(9);
//        ln2.next=new leetcode.ListNode(6);
//        ln2.next.next=new leetcode.ListNode(4);
        Add2NoSingleLinkedList a2=new Add2NoSingleLinkedList();
      //  System.out.println("call add fun");
        leetcode.ListNode l3=a2.addTwoNumbers(ln1,ln2);
      //  System.out.println("call print fun");
        a2.print(l3);
    }
    public  leetcode.ListNode addTwoNumbers(leetcode.ListNode l1, leetcode.ListNode l2){
       // System.out.println(" add fun");
        leetcode.ListNode ln=new leetcode.ListNode();
        leetcode.ListNode last=ln;
              int carry=0;
                  if(l1==null && l2==null)
                      return  new leetcode.ListNode();
//                  while (l1!=null && l2!=null)
//                  {
//                      int sum=carry+l1.val+l2.val;
//                     // System.out.println("sum  "+sum);
//                      leetcode.ListNode node=new leetcode.ListNode(sum%10);
//                      last.next=node;
//                      last= last.next;
//                      carry=sum/10;
//                      l1=l1.next;
//                      l2=l2.next;
//                  }
//                  if(ln.next==null)
//                  {
//                      ln.val=ln.val+carry;
//                  }

               while (l1!=null || l2!=null)
               {
                   int sum=0;
                   if(l1!=null){
                       sum+=l1.val;
                       l1=l1.next;
                   }
                   if(l2!=null){
                       sum+=l2.val;
                       l2=l2.next;
                   }
                   sum+=carry;
                   carry=sum/10;
                   last.next=new leetcode.ListNode(sum%10);
                   last= last.next;
               }
        if(carry!=0)
        {
            last.next=new leetcode.ListNode(carry);
            last= last.next;
        }
        return ln.next;
    }
    public void print(leetcode.ListNode l3)
    {
        System.out.println(" print fun");
        while (l3!=null)
        {
            System.out.print(l3.val);
            l3=l3.next;
        }
    }


}
