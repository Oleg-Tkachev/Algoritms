 package src;

 public class ListNodeUtils {


     public static ListNode addFirst(int value, ListNode listForAdd) {
         ListNode newNode = new ListNode();
         newNode.val = value;
         if (listForAdd != null) {
             newNode.next = listForAdd;
         }
         return newNode;
     }

     public static ListNode removeFirst(ListNode listForRemove) {
         if (listForRemove != null) {
             listForRemove = listForRemove.next;
         }
         return listForRemove;
     }

     public static ListNode reverse(ListNode listForReverse) {
         ListNode previous = null;
         while (listForReverse != null) {
             ListNode nextElement = listForReverse.next;
             listForReverse.next = previous;
             previous = listForReverse;
             listForReverse = nextElement;
         }
         return previous;
     }

     public static class ListNode {
         int val;
         ListNode next;

         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }
 }