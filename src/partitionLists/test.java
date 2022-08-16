package partitionLists;

public class test {

    public static void main(String[] args){
        int[] num = {1,2,3,4,4,3,2,1};
        Solution test = new Solution();
        ListNode List =test.create(num);

        ListNode newlist = test.solution(List,3);
        ListNode  printlist= newlist;
        while(printlist!=null){
            System.out.print(printlist.val+",");
            printlist=printlist.next;
        }
        }

    }

