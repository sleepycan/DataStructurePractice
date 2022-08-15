package linkedlist.merge;

import java.util.List;

public class mergesortedlsts {
    public static void main(String[] args){
        int[] num1 = {10,6,2,1};
        int[] num2 = {12,9,7,3,0};
        ListNode list1 = create(num1);
        ListNode list2 = create(num2);
        ListNode head = mergeTwoLists(list1,list2);
        while(head!=null){
            System.out.println(head.val);
            head = head.next;
        }
    }
    public static ListNode create(int[] num){
        ListNode head = null;
        for(int i=0;i<num.length;i++){
            ListNode list = new ListNode(num[i]);
            if(head==null)head=list;
            else{
                list.next = head;
                head = list;
            }
        }
        return head;
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        ListNode p1 = list1;
        ListNode p2 = list2;
        while(p1!=null&&p2!=null){
            if(p1.val>p2.val){
                p.next = p2;
                p2 = p2.next;
            }else{
                p.next = p1;
                p1 = p1.next;
            }
            p = p.next;
        }
        if(p1==null){
            p.next = p2;
        }
        if(p2==null){
            p.next = p1;
        }
        return dummy.next;
    }
}


