package listNode;

public class MergeTwoSortedList {

    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){

        ListNode temp = new ListNode(0);
        ListNode current = temp;

        while(list1 != null && list2 != null){
            if(list1.value<list2.value){
                current.next = list1;
                list1=list1.next;
            }else {
                current.next=list2;
                list2=list2.next;
            }
            current =current.next;
        }
return null;
    }
}
